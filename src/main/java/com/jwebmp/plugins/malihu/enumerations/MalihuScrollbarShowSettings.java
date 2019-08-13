package com.jwebmp.plugins.malihu.enumerations;

/**
 * Always keep scrollbar(s) visible, even when there’s nothing to scroll.
 * * alwaysShowScrollbar: 0 – disable (default)
 * * alwaysShowScrollbar: 1 – keep dragger rail visible
 * * alwaysShowScrollbar: 2 – keep all scrollbar components (dragger, rail, buttons etc.) visible
 */
public enum MalihuScrollbarShowSettings
{
	DontShowWhenNothingToScroll,
	KeepDraggerRailVisible,
	KeepAllComponentVisible;

}
