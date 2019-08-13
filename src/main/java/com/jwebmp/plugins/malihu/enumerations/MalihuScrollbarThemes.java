package com.jwebmp.plugins.malihu.enumerations;

import com.jwebmp.core.utilities.StaticStrings;

/**
 * http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/scrollbar_themes_demo.html
 */
public enum MalihuScrollbarThemes
{
	Light,
	Dark,
	Minimal,
	Minimal_Dark,
	Light_2,
	Dark_2,
	Light_3,
	Dark_3,
	Light_Thick,
	Dark_Thick,
	Light_Thin,
	Dark_Thin,
	Inset,
	Inset_Dark,
	Inset_2,
	Inset_2_Dark,
	Inset_3,
	Inset_3_Dark,
	Rounded,
	Rounded_Dark,
	Rounded_Dots,
	Rounded_Dots_Dark,
	$3D,
	$3D_Dark,
	$3D_Thick,
	$3D_Thick_Dark,
	;

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(StaticStrings.CHAR_UNDERSCORE, StaticStrings.CHAR_DASH)
		             .replace(StaticStrings.STRING_DOLLAR, StaticStrings.STRING_EMPTY);
	}
}
