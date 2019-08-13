package com.jwebmp.plugins.malihu.options;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.malihu.enumerations.MalihuScrollbarKeyboardScrollTypes;

public class MalihuScrollbarKeyboardOptions<J extends MalihuScrollbarKeyboardOptions<J>>
		extends JavaScriptPart<J>
{
	/**
	 * Enable or disable content scrolling via the keyboard.
	 * The plugin supports the directional arrows (top, left, right and down), page-up (PgUp), page-down (PgDn), Home and End keys.
	 */
	@JsonProperty("enable")
	private Boolean enable;
	/**
	 * Set the keyboard arrows scrolling amount (in pixels). The default value "auto" adjusts scrolling amount according to scrollable content length.
	 */
	@JsonProperty("scrollAmount")
	private Integer scrollAmount;
	/**
	 * Define the keyboard arrows scrolling type/behavior.
	 * scrollType: "stepless" – continuously scroll content while pressing the arrow key (default)
	 * scrollType: "stepped" – each key release scrolls content by a certain amount (defined in scrollAmount option above)
	 */
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@JsonProperty("scrollType")
	private MalihuScrollbarKeyboardScrollTypes scrollType;

	/**
	 * Getter for property 'enable'.
	 *
	 * @return Value for property 'enable'.
	 */
	public Boolean getEnable()
	{
		return enable;
	}

	/**
	 * Setter for property 'enable'.
	 *
	 * @param enable
	 * 		Value to set for property 'enable'.
	 */
	@SuppressWarnings("unchecked")
	public J setEnable(Boolean enable)
	{
		this.enable = enable;
		return (J) this;
	}

	/**
	 * Getter for property 'scrollAmount'.
	 *
	 * @return Value for property 'scrollAmount'.
	 */
	public Integer getScrollAmount()
	{
		return scrollAmount;
	}

	/**
	 * Setter for property 'scrollAmount'.
	 *
	 * @param scrollAmount
	 * 		Value to set for property 'scrollAmount'.
	 */
	@SuppressWarnings("unchecked")
	public J setScrollAmount(Integer scrollAmount)
	{
		this.scrollAmount = scrollAmount;
		return (J) this;
	}

	/**
	 * Getter for property 'scrollType'.
	 *
	 * @return Value for property 'scrollType'.
	 */
	public MalihuScrollbarKeyboardScrollTypes getScrollType()
	{
		return scrollType;
	}

	/**
	 * Setter for property 'scrollType'.
	 *
	 * @param scrollType
	 * 		Value to set for property 'scrollType'.
	 */
	@SuppressWarnings("unchecked")
	public J setScrollType(MalihuScrollbarKeyboardScrollTypes scrollType)
	{
		this.scrollType = scrollType;
		return (J) this;
	}
}
