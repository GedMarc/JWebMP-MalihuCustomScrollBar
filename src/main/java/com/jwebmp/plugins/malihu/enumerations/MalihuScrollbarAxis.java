package com.jwebmp.plugins.malihu.enumerations;

public enum MalihuScrollbarAxis
{
	/**
	 * vertical scrollbar (default)
	 */
	Y,
	/**
	 * horizontal scrollbar
	 */
	X,
	/**
	 * vertical and horizontal scrollbars
	 */
	YX;

	@Override
	public String toString()
	{
		return name().toLowerCase();
	}

}
