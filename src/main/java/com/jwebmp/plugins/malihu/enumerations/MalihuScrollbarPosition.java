package com.jwebmp.plugins.malihu.enumerations;

public enum MalihuScrollbarPosition
{
	/**
	 * Setting scrollbarPosition: "inside" (default) makes scrollbar appear inside the element.
	 */
	Inside,
	/**
	 * Setting scrollbarPosition: "outside" makes scrollbar appear outside the element. Note that setting the value to "outside" requires your element (or parent elements) to have CSS position: relative (otherwise the scrollbar will be positioned in relation to document’s root element).
	 */
	Outside,

	;

	@Override
	public String toString()
	{
		return name().toLowerCase();
	}
}
