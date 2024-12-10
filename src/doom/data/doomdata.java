package data;
// Emacs style mode select   -*- Java -*-
//-----------------------------------------------------------------------------
//
// $Id: doomdata.java,v 1.4 2011/02/11 00:11:13 velktron Exp $
//
// Copyright (C) 1993-1996 by id Software, Inc.
//
// This program is free software; you can redistribute it and/or
// modify it under the terms of the GNU General Public License
// as published by the Free Software Foundation; either version 2
// of the License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// DESCRIPTION:
//  all external data is defined here
//  most of the data is loaded into different structures at run time
//  some internal structures shared by many modules are here
//
//-----------------------------------------------------------------------------

// The most basic types we use, portability.
//#include "doomtype.h"
// Some global defines, that configure the game.
public class doomdata {
//
// Map level types.
// The following data structures define the persistent format
// used in the lumps of the WAD files.
//

// Lump order in a map WAD: each map needs a couple of lumps
// to provide a complete scene geometry description.
// Maes: this was defined as a typeless enum, probably intended to be used as cardinality?
// Turning it into "ML" enum or int consts.
    public static enum ML {
        ML_LABEL, // A separator, name, ExMx or MAPxx
        ML_THINGS, // Monsters, items..
        ML_LINEDEFS, // LineDefs, from editing
        ML_SIDEDEFS, // SideDefs, from editing
        ML_VERTEXES, // Vertices, edited and BSP splits generated
        ML_SEGS, // LineSegs, from LineDefs split by BSP
        ML_SSECTORS, // SubSectors, list of LineSegs
        ML_NODES, // BSP nodes
        ML_SECTORS, // Sectors, from editing
        ML_REJECT, // LUT, sector-sector visibility
        ML_BLOCKMAP		// LUT, motion clipping, walls/grid element
    };

// A single Vertex.
    static class mapvertex_t {

        short x;
        short y;
    };

// A SideDef, defining the visual appearance of a wall,
// by setting textures and offsets.
    static class mapsidedef_t {

        short textureoffset;
        short rowoffset;
        char[] toptexture = new char[8];
        char[] bottomtexture = new char[8];
        char[] midtexture = new char[8];
        // Front sector, towards viewer.
        short sector;
    }

// A LineDef, as used for editing, and as input
// to the BSP builder.
    static class maplinedef_t {

        short v1;
        short v2;
        short flags;
        short special;
        short tag;
        // sidenum[1] will be -1 if one sided
        int[] sidenum = new int[2];
    }

//
// LineDef attributes.
//
// Solid, is an obstacle.
    public static final int ML_BLOCKING = 1;

// Blocks monsters only.
    public static final int ML_BLOCKMONSTERS = 2;

// Backside will not be present at all
//  if not two sided.
    public static final int ML_TWOSIDED = 4;

// If a texture is pegged, the texture will have
// the end exposed to air held constant at the
// top or bottom of the texture (stairs or pulled
// down things) and will move with a height change
// of one of the neighbor sectors.
// Unpegged textures allways have the first row of
// the texture at the top pixel of the line for both
// top and bottom textures (use next to windows).
// upper texture unpegged
    public static final int ML_DONTPEGTOP = 8;

// lower texture unpegged
    public static final int ML_DONTPEGBOTTOM = 16;

// In AutoMap: don't map as two sided: IT'S A SECRET!
    public static final int ML_SECRET = 32;

// Sound rendering: don't let sound cross two of these.
    public static final int ML_SOUNDBLOCK = 64;

// Don't draw on the automap at all.
    public static final int ML_DONTDRAW = 128;

// Set if already seen, thus drawn in automap.
    public static final int ML_MAPPED = 256;

// Sector definition, from editing.
    class mapsector_t {

        short floorheight;
        short ceilingheight;
        char[] floorpic = new char[8];
        char[] ceilingpic = new char[8];
        short lightlevel;
        short special;
        short tag;
    };

// SubSector, as generated by BSP.
    class mapsubsector_t {

        short numsegs;
        // Index of first one, segs are stored sequentially.
        short firstseg;
    };

// LineSeg, generated by splitting LineDefs
// using partition lines selected by BSP builder.
    class mapseg_t {

        short v1;
        short v2;
        short angle;
        short linedef;
        short side;
        short offset;
    };

// BSP node structure.
// Indicate a leaf.
    public static int NF_SUBSECTOR = 0x8000;

    class mapnode_t {
        // Partition line from (x,y) to x+dx,y+dy)

        short x;
        short y;
        short dx;
        short dy;

        // Bounding box for each child,
        // clip against view frustum.
        short[][] bbox = new short[2][4];

        // If NF_SUBSECTOR its a subsector,
        // else it's a node of another subtree.
        //Maes: used to be unsigned short
        int[] children = new int[2];

    };

}