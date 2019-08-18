package com.jwebmp.plugins.malihu.options;

import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

public class MalihuScrollBarScrollButtonsOptions<J extends MalihuScrollBarScrollButtonsOptions<J>>
		extends JavaScriptPart<J>
{
	/**
	 * Enable the scroll buttons
	 */
	private boolean enable;
	/**
	 * Set a tabindex value for the buttons.
	 */
	private Integer tabIndex;

	/**
	 * Set a tabindex value for the buttons.
	 *
	 * @return Value for property 'tabIndex'.
	 */
	public Integer getTabIndex()
	{
		return tabIndex;
	}

	/**
	 * Set a tabindex value for the buttons.
	 *
	 * @param tabIndex
	 * 		Value to set for property 'tabIndex'.
	 */
	public MalihuScrollBarScrollButtonsOptions<J> setTabIndex(Integer tabIndex)
	{
		this.tabIndex = tabIndex;
		return this;
	}

	/**
	 * Getter for property 'enable'.
	 *
	 * @return Value for property 'enable'.
	 */
	public boolean isEnable()
	{
		return enable;
	}

	/**
	 * Setter for property 'enable'.
	 *
	 * @param enable Value to set for property 'enable'.
	 */
	public MalihuScrollBarScrollButtonsOptions<J> setEnable(boolean enable)
	{
		this.enable = enable;
		return this;
	}
}
