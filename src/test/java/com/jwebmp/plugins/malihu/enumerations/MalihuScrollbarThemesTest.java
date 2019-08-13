package com.jwebmp.plugins.malihu.enumerations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MalihuScrollbarThemesTest
{

	@Test
	void testToString()
	{
		System.out.println(MalihuScrollbarThemes.$3D_Thick);
		if(!MalihuScrollbarThemes.$3D_Thick.toString().contains("3d-thick"))
			fail("Broken enum tostring()");

		System.out.println(MalihuScrollbarThemes.$3D_Thick_Dark);
		if(!MalihuScrollbarThemes.$3D_Thick_Dark.toString().contains("3d-thick-dark"))
			fail("Broken enum tostring()");
	}
}