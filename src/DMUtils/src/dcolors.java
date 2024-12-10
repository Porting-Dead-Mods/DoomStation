import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class dcolors {
	public static final String VERSION= "1.1";

	public final static int playpal[] = {
		0x00,0x00,0x00,0x1F,0x17,0x0B,0x17,0x0F,0x07,0x4B,0x4B,0x4B,0xFF,0xFF,0xFF,0x1B,
		0x1B,0x1B,0x13,0x13,0x13,0x0B,0x0B,0x0B,0x07,0x07,0x07,0x2F,0x37,0x1F,0x23,0x2B,
		0x0F,0x17,0x1F,0x07,0x0F,0x17,0x00,0x4F,0x3B,0x2B,0x47,0x33,0x23,0x3F,0x2B,0x1B,
		0xFF,0xB7,0xB7,0xF7,0xAB,0xAB,0xF3,0xA3,0xA3,0xEB,0x97,0x97,0xE7,0x8F,0x8F,0xDF,
		0x87,0x87,0xDB,0x7B,0x7B,0xD3,0x73,0x73,0xCB,0x6B,0x6B,0xC7,0x63,0x63,0xBF,0x5B,
		0x5B,0xBB,0x57,0x57,0xB3,0x4F,0x4F,0xAF,0x47,0x47,0xA7,0x3F,0x3F,0xA3,0x3B,0x3B,
		0x9B,0x33,0x33,0x97,0x2F,0x2F,0x8F,0x2B,0x2B,0x8B,0x23,0x23,0x83,0x1F,0x1F,0x7F,
		0x1B,0x1B,0x77,0x17,0x17,0x73,0x13,0x13,0x6B,0x0F,0x0F,0x67,0x0B,0x0B,0x5F,0x07,
		0x07,0x5B,0x07,0x07,0x53,0x07,0x07,0x4F,0x00,0x00,0x47,0x00,0x00,0x43,0x00,0x00,
		0xFF,0xEB,0xDF,0xFF,0xE3,0xD3,0xFF,0xDB,0xC7,0xFF,0xD3,0xBB,0xFF,0xCF,0xB3,0xFF,
		0xC7,0xA7,0xFF,0xBF,0x9B,0xFF,0xBB,0x93,0xFF,0xB3,0x83,0xF7,0xAB,0x7B,0xEF,0xA3,
		0x73,0xE7,0x9B,0x6B,0xDF,0x93,0x63,0xD7,0x8B,0x5B,0xCF,0x83,0x53,0xCB,0x7F,0x4F,
		0xBF,0x7B,0x4B,0xB3,0x73,0x47,0xAB,0x6F,0x43,0xA3,0x6B,0x3F,0x9B,0x63,0x3B,0x8F,
		0x5F,0x37,0x87,0x57,0x33,0x7F,0x53,0x2F,0x77,0x4F,0x2B,0x6B,0x47,0x27,0x5F,0x43,
		0x23,0x53,0x3F,0x1F,0x4B,0x37,0x1B,0x3F,0x2F,0x17,0x33,0x2B,0x13,0x2B,0x23,0x0F,
		0xEF,0xEF,0xEF,0xE7,0xE7,0xE7,0xDF,0xDF,0xDF,0xDB,0xDB,0xDB,0xD3,0xD3,0xD3,0xCB,
		0xCB,0xCB,0xC7,0xC7,0xC7,0xBF,0xBF,0xBF,0xB7,0xB7,0xB7,0xB3,0xB3,0xB3,0xAB,0xAB,
		0xAB,0xA7,0xA7,0xA7,0x9F,0x9F,0x9F,0x97,0x97,0x97,0x93,0x93,0x93,0x8B,0x8B,0x8B,
		0x83,0x83,0x83,0x7F,0x7F,0x7F,0x77,0x77,0x77,0x6F,0x6F,0x6F,0x6B,0x6B,0x6B,0x63,
		0x63,0x63,0x5B,0x5B,0x5B,0x57,0x57,0x57,0x4F,0x4F,0x4F,0x47,0x47,0x47,0x43,0x43,
		0x43,0x3B,0x3B,0x3B,0x37,0x37,0x37,0x2F,0x2F,0x2F,0x27,0x27,0x27,0x23,0x23,0x23,
		0x77,0xFF,0x6F,0x6F,0xEF,0x67,0x67,0xDF,0x5F,0x5F,0xCF,0x57,0x5B,0xBF,0x4F,0x53,
		0xAF,0x47,0x4B,0x9F,0x3F,0x43,0x93,0x37,0x3F,0x83,0x2F,0x37,0x73,0x2B,0x2F,0x63,
		0x23,0x27,0x53,0x1B,0x1F,0x43,0x17,0x17,0x33,0x0F,0x13,0x23,0x0B,0x0B,0x17,0x07,
		0xBF,0xA7,0x8F,0xB7,0x9F,0x87,0xAF,0x97,0x7F,0xA7,0x8F,0x77,0x9F,0x87,0x6F,0x9B,
		0x7F,0x6B,0x93,0x7B,0x63,0x8B,0x73,0x5B,0x83,0x6B,0x57,0x7B,0x63,0x4F,0x77,0x5F,
		0x4B,0x6F,0x57,0x43,0x67,0x53,0x3F,0x5F,0x4B,0x37,0x57,0x43,0x33,0x53,0x3F,0x2F,
		0x9F,0x83,0x63,0x8F,0x77,0x53,0x83,0x6B,0x4B,0x77,0x5F,0x3F,0x67,0x53,0x33,0x5B,
		0x47,0x2B,0x4F,0x3B,0x23,0x43,0x33,0x1B,0x7B,0x7F,0x63,0x6F,0x73,0x57,0x67,0x6B,
		0x4F,0x5B,0x63,0x47,0x53,0x57,0x3B,0x47,0x4F,0x33,0x3F,0x47,0x2B,0x37,0x3F,0x27,
		0xFF,0xFF,0x73,0xEB,0xDB,0x57,0xD7,0xBB,0x43,0xC3,0x9B,0x2F,0xAF,0x7B,0x1F,0x9B,
		0x5B,0x13,0x87,0x43,0x07,0x73,0x2B,0x00,0xFF,0xFF,0xFF,0xFF,0xDB,0xDB,0xFF,0xBB,
		0xBB,0xFF,0x9B,0x9B,0xFF,0x7B,0x7B,0xFF,0x5F,0x5F,0xFF,0x3F,0x3F,0xFF,0x1F,0x1F,
		0xFF,0x00,0x00,0xEF,0x00,0x00,0xE3,0x00,0x00,0xD7,0x00,0x00,0xCB,0x00,0x00,0xBF,
		0x00,0x00,0xB3,0x00,0x00,0xA7,0x00,0x00,0x9B,0x00,0x00,0x8B,0x00,0x00,0x7F,0x00,
		0x00,0x73,0x00,0x00,0x67,0x00,0x00,0x5B,0x00,0x00,0x4F,0x00,0x00,0x43,0x00,0x00,
		0xE7,0xE7,0xFF,0xC7,0xC7,0xFF,0xAB,0xAB,0xFF,0x8F,0x8F,0xFF,0x73,0x73,0xFF,0x53,
		0x53,0xFF,0x37,0x37,0xFF,0x1B,0x1B,0xFF,0x00,0x00,0xFF,0x00,0x00,0xE3,0x00,0x00,
		0xCB,0x00,0x00,0xB3,0x00,0x00,0x9B,0x00,0x00,0x83,0x00,0x00,0x6B,0x00,0x00,0x53,
		0xFF,0xFF,0xFF,0xFF,0xEB,0xDB,0xFF,0xD7,0xBB,0xFF,0xC7,0x9B,0xFF,0xB3,0x7B,0xFF,
		0xA3,0x5B,0xFF,0x8F,0x3B,0xFF,0x7F,0x1B,0xF3,0x73,0x17,0xEB,0x6F,0x0F,0xDF,0x67,
		0x0F,0xD7,0x5F,0x0B,0xCB,0x57,0x07,0xC3,0x4F,0x00,0xB7,0x47,0x00,0xAF,0x43,0x00,
		0xFF,0xFF,0xFF,0xFF,0xFF,0xD7,0xFF,0xFF,0xB3,0xFF,0xFF,0x8F,0xFF,0xFF,0x6B,0xFF,
		0xFF,0x47,0xFF,0xFF,0x23,0xFF,0xFF,0x00,0xA7,0x3F,0x00,0x9F,0x37,0x00,0x93,0x2F,
		0x00,0x87,0x23,0x00,0x4F,0x3B,0x27,0x43,0x2F,0x1B,0x37,0x23,0x13,0x2F,0x1B,0x0B,
		0x00,0x00,0x53,0x00,0x00,0x47,0x00,0x00,0x3B,0x00,0x00,0x2F,0x00,0x00,0x23,0x00,
		0x00,0x17,0x00,0x00,0x0B,0x00,0x00,0x00,0xFF,0x9F,0x43,0xFF,0xE7,0x4B,0xFF,0x7B,
		0xFF,0xFF,0x00,0xFF,0xCF,0x00,0xCF,0x9F,0x00,0x9B,0x6F,0x00,0x6B,0xA7,0x6B,0x6B
		};

	/*
	=============================================================================

									DCOLORS

								by John Carmack

	=============================================================================
	*/

	public static final int	NUMLIGHTS	=	32;
	public static final int	GRAYCOLORMAP =	32;

	static private byte[]	palette=new byte[768];

	static private byte[][]	lightpalette=new byte[NUMLIGHTS+2][256];
	static private short[][]	color12s=new short[NUMLIGHTS+2][256];
	static private short[][]	color15s=new short[NUMLIGHTS+2][256];


	/*
	=====================
	=
	= ColorShiftPalette
	=
	= at shift = 0, the colors are normal
	= at shift = steps, the colors are all the given rgb
	=====================
	*/

	static private void	ColorShiftPalette (byte[] inpal, byte[] outpal
	, int r, int g, int b, int shift, int steps)
	{
		int	i;
		int	dr, dg, db;
		int	in_p, out_p;

		in_p = 0;
		out_p = 0;

		for (i=0 ; i<256 ; i++)
		{
			dr = r - inpal[in_p+0];
			dg = g - inpal[in_p+1];
			db = b - inpal[in_p+2];

			outpal[out_p+0] = (byte) (inpal[in_p+0] + dr*shift/steps);
			outpal[out_p+1] = (byte) (inpal[in_p+1] + dg*shift/steps);
			outpal[out_p+2] = (byte) (inpal[in_p+2] + db*shift/steps);

			in_p += 3;
			out_p += 3;
		}
	}

	/*
	===============
	=
	= BestColor
	=
	===============
	*/

	static private byte BestColor (int r, int g, int b, byte[] palette, int rangel, int rangeh)
	{
		int	i;
		long	dr, dg, db;
		long	bestdistortion, distortion;
		int	bestcolor;
		int	pal;

	//
	// let any color go to 0 as a last resort
	//
		bestdistortion = ( (long)r*r + (long)g*g + (long)b*b )*2;
		bestcolor = 0;

		pal = rangel*3;
		for (i=rangel ; i<= rangeh ; i++)
		{
			dr = r - (int)(0xFF&palette[pal+0]);
			dg = g - (int)(0xFF&palette[pal+1]);
			db = b - (int)(0xFF&palette[pal+2]);
			pal += 3;
			distortion = dr*dr + dg*dg + db*db;
			if (distortion < bestdistortion)
			{
				if (distortion==0)
					return (byte) i;		// perfect match

				bestdistortion = distortion;
				bestcolor = i;
			}
		}

		return (byte) bestcolor;
	}


	/*
	=====================
	=
	= RF_BuildLights
	=
	= 0 is full palette
	= NUMLIGHTS	and NUMLIGHTS+1 are all black
	=
	=====================
	*/

	static private void	RF_BuildLights ()
	{
		int		l,c;
		int		red,green,blue, ri, gi, bi;
		int	palsrc;
		short	color12,color15;

		for (l=0;l<NUMLIGHTS;l++)
		{
	System.out.printf ("%d.",NUMLIGHTS-l);
			palsrc = 0;
			for (c=0;c<256;c++)
			{
				red = 0xFF&palette[palsrc++];
				green = 0xFF&palette[palsrc++];
				blue = 0xFF&palette[palsrc++];

				red = (red*(NUMLIGHTS-l)+NUMLIGHTS/2)/NUMLIGHTS;
				green = (green*(NUMLIGHTS-l)+NUMLIGHTS/2)/NUMLIGHTS;
				blue = (blue*(NUMLIGHTS-l)+NUMLIGHTS/2)/NUMLIGHTS;

				// RGBA 4-4-4-4 packed for NeXT
				color12 = getRGBA4444(red,green,blue);

				// RGB555 for HiColor
				color15 = getRGB555(red,green,blue);

				System.out.printf("Color15 for %2x %2x %2x: %4x %4x\n",red,green,blue,color12,color15);

				lightpalette[l][c] = BestColor(red,green,blue,palette,0,255);

				color12s[l][c] = color12;
				color15s[l][c] = color15;
			}

			/*
			memcpy (screen,lightpalette[l],256);
			screen+=320;
			memcpy (screen,lightpalette[l],256);
			screen+=320;
			memcpy (screen,lightpalette[l],256);
			screen+=320; */
		}
	}

	public static final short getRGB555(int red,int green,int blue){
		int ri,gi,bi;

		ri = (((red+4)>255?255:red+4))>>3;
		ri = ri > 31 ? 31 : ri;
		gi = (((green+4)>255?255:green+4))>>3;
		gi = gi > 31 ? 31 : gi;
		bi = (((blue+4)>255?255:blue+4))>>3;
		bi = bi > 31 ? 31 : bi;

		// RGB555 for HiColor
		return (short) ((ri<<10) + (gi<<5) + bi);
	}

	public static final short getRGBA4444(int red,int green,int blue){
		int ri,gi,bi;

		ri = (((red+8)>255?255:red+8))>>4;
		ri = ri > 15 ? 15 : ri;
		gi = (((green+8)>255?255:green+8))>>4;
		gi = gi > 15 ? 15 : gi;
		bi = (((blue+8)>255?255:blue+8))>>4;
		bi = bi > 15 ? 15 : bi;

		// RGBA 4-4-4-4 packed for NeXT

		return (short) ((ri<<12)+ (gi<<8) +(bi<<4)+15);
		//return (short)(0xDEAD);
	}

	/*
	=====================
	=
	= BuildSpecials
	=
	= Red and gray colormaps
	=
	=====================
	*/

	static private void	BuildSpecials ()
	{
		int		c,gray;
		float	red, green, blue;
		int palsrc;

		palsrc = 0;
		for (c=0;c<256;c++)
		{
			red = (float) ((0xFF&palette[palsrc++]) / 256.0);
			green = (float) ((0xFF&palette[palsrc++]) / 256.0);
			blue = (float) ((0xFF&palette[palsrc++]) / 256.0);

			gray = (int) (255*(1.0-(red*0.299 + green*0.587 + blue*0.144)));

			color12s[GRAYCOLORMAP][c] = getRGBA4444(gray,gray,gray);
			System.out.printf("%4x for %x\n",color12s[GRAYCOLORMAP][c],gray);
			color15s[GRAYCOLORMAP][c] = getRGB555(gray,gray,gray);

			lightpalette[GRAYCOLORMAP][c] = BestColor(gray,gray,gray,palette,0,255);
		}

		/*
		memcpy (screen,lightpalette[GRAYCOLORMAP],256);
		screen+=320;
		memcpy (screen,lightpalette[GRAYCOLORMAP],256);
		screen+=320;
		memcpy (screen,lightpalette[GRAYCOLORMAP],256);
		screen+=320; */
	}


	/*
	====================
	=
	= main
	=
	====================
	*/

	public static void main (String[] argv) throws IOException
	{
		int 		i;
		OutputStream handle;
		InputStream palhandle;
		byte		[]pic;
		byte[]		outpal=new byte[768];

		System.out.printf ("\nDCOLORS %s by John Carmack, copyright (c) 1992 Id Software\n",VERSION);
/*
		if (argv.length != 2) {
			CmdLib.Error("dcolors picture.lbm");

		}	*/
	//
	// load lbm for base palette
	//
		//LoadLBM (argv[1],&pic, &palette);
		//VGAMode ();
		//SetPalette (palette);
		//memcpy ( screen, pic, 64000);
		//free (pic);			// don't care whats on it

	//
	// build palette shifts
	//
		palhandle=CmdLib.SafeOpenRead("PLAYPAL.lmp");
		CmdLib.SafeRead(palhandle,palette);
		palhandle.close();

		for (i=0;i<palette.length;i+=3){
			palette[i]=(byte) (0xFF&(playpal[i]));
			palette[i+1]=(byte) (0xFF&(playpal[i+1]));
			palette[i+2]=(byte) (0xFF&(playpal[i+2]));
			System.out.printf("Palette %d: %x %x %x\n",(i/3),palette[i],palette[i+1],palette[i+2]);
		}

		handle = CmdLib.SafeOpenWrite ("playpal1.lmp");

		// Standard palette.
		CmdLib.SafeWrite (handle, palette, palette.length);

		CmdLib.GetKey ();

		// Progressively redder pain palettes (8 of them)
		// Max 8/9 of 255,0,0. Progressive 11%, 22% etc.
		for (i=1 ; i<9 ; i++)
		{
			ColorShiftPalette (palette, outpal, 255, 0, 0, i, 9);
			CmdLib.SafeWrite (handle, outpal, 768);
			//CmdLib.SetPalette (outpal);
			CmdLib.GetKey ();
		}

		//SetPalette (palette);
		CmdLib.GetKey ();

		// Progressively yellower palettes (pickup)
		// 4 of them. Progressive 12.5, 25, 37.5, 50%.
		for (i=1 ; i<5 ; i++)
		{
			ColorShiftPalette (palette, outpal, 215, 186, 69, i, 8);
			CmdLib.SafeWrite (handle, outpal, 768);
			//CmdLib.SetPalette (outpal);
			CmdLib.GetKey ();
		}

		// Green radsuit palette.
		ColorShiftPalette (palette, outpal, 0, 256, 0, 1, 8);
		CmdLib.SafeWrite (handle, outpal, 768);
		//CmdLib.SetPalette (outpal);
		CmdLib.GetKey ();

		handle.close();
		//CmdLib.SetPalette (palette);

	//
	// build light mappings
	// Includes standard colormaps 0-31
		RF_BuildLights ();

	//
	// build special maps
	//
		BuildSpecials ();

	//
	// write lumps
	//
		CmdLib.SaveFile ("colormap.lmp",lightpalette);
		CmdLib.SaveFile ("colors12.lmp",color12s);
		CmdLib.SaveFile ("colors15.lmp",color15s);

		CmdLib.GetKey ();
		//TextMode ();

	}


}