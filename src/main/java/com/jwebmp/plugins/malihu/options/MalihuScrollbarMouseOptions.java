package com.jwebmp.plugins.malihu.options;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.malihu.enumerations.MalihuMouseWheelAxis;

import java.util.Set;

public class MalihuScrollbarMouseOptions<J extends MalihuScrollbarMouseOptions<J>>
		extends JavaScriptPart<J>
{
	/**
	 * Enable or disable content scrolling via mouse-wheel.
	 */
	@JsonProperty("enable")
	private Boolean enable;
	/**
	 * Set the mouse-wheel scrolling amount (in pixels). The default value "auto" adjusts scrolling amount according to scrollable content length.
	 */
	@JsonProperty("scrollAmount")
	private Integer scrollAmount;
	/**
	 * Define the mouse-wheel scrolling axis when both vertical and horizontal scrollbars are present.
	 * Set axis: "y" (default) for vertical or axis: "x" for horizontal scrolling.
	 */
	@JsonProperty("axis")
	private MalihuMouseWheelAxis axis;
	/**
	 * Prevent the default behaviour which automatically scrolls the parent element when end or beginning of scrolling is reached (same bahavior with browser’s native scrollbar).
	 */
	@JsonProperty("preventDefault")
	private Boolean preventDefault;
	/**
	 * Set the number of pixels one wheel notch scrolls. The default value “auto” uses the OS/browser value.
	 */
	@JsonProperty("deltaFactor")
	private Integer deltaFactor;
	/**
	 * Enable or disable mouse-wheel (delta) acceleration. Setting normalizeDelta: true translates mouse-wheel delta value to -1 or 1.
	 */
	@JsonProperty("normalizeDelta")
	private Boolean normalizeDelta;
	/**
	 * Invert mouse-wheel scrolling direction. Set to true to scroll down or right when mouse-wheel is turned upwards.
	 */
	@JsonProperty("invert")
	private Boolean invert;
	/**
	 * Set the tags that disable mouse-wheel when cursor is over them.
	 * Default value:
	 * ["select","option","keygen","datalist","textarea"]
	 */
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonProperty("disableOver")
	private Set<String> disableOver;

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
	 * @param enable Value to set for property 'enable'.
	 */
	public MalihuScrollbarMouseOptions setEnable(Boolean enable)
	{
		this.enable = enable;
		return this;
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
	 * @param scrollAmount Value to set for property 'scrollAmount'.
	 */
	public MalihuScrollbarMouseOptions setScrollAmount(Integer scrollAmount)
	{
		this.scrollAmount = scrollAmount;
		return this;
	}

	/**
	 * Getter for property 'axis'.
	 *
	 * @return Value for property 'axis'.
	 */
	public MalihuMouseWheelAxis getAxis()
	{
		return axis;
	}

	/**
	 * Setter for property 'axis'.
	 *
	 * @param axis Value to set for property 'axis'.
	 */
	public MalihuScrollbarMouseOptions setAxis(MalihuMouseWheelAxis axis)
	{
		this.axis = axis;
		return this;
	}

	/**
	 * Getter for property 'preventDefault'.
	 *
	 * @return Value for property 'preventDefault'.
	 */
	public Boolean getPreventDefault()
	{
		return preventDefault;
	}

	/**
	 * Setter for property 'preventDefault'.
	 *
	 * @param preventDefault Value to set for property 'preventDefault'.
	 */
	public MalihuScrollbarMouseOptions setPreventDefault(Boolean preventDefault)
	{
		this.preventDefault = preventDefault;
		return this;
	}

	/**
	 * Getter for property 'deltaFactor'.
	 *
	 * @return Value for property 'deltaFactor'.
	 */
	public Integer getDeltaFactor()
	{
		return deltaFactor;
	}

	/**
	 * Setter for property 'deltaFactor'.
	 *
	 * @param deltaFactor Value to set for property 'deltaFactor'.
	 */
	public MalihuScrollbarMouseOptions setDeltaFactor(Integer deltaFactor)
	{
		this.deltaFactor = deltaFactor;
		return this;
	}

	/**
	 * Getter for property 'normalizeDelta'.
	 *
	 * @return Value for property 'normalizeDelta'.
	 */
	public Boolean getNormalizeDelta()
	{
		return normalizeDelta;
	}

	/**
	 * Setter for property 'normalizeDelta'.
	 *
	 * @param normalizeDelta Value to set for property 'normalizeDelta'.
	 */
	public MalihuScrollbarMouseOptions setNormalizeDelta(Boolean normalizeDelta)
	{
		this.normalizeDelta = normalizeDelta;
		return this;
	}

	/**
	 * Getter for property 'invert'.
	 *
	 * @return Value for property 'invert'.
	 */
	public Boolean getInvert()
	{
		return invert;
	}

	/**
	 * Setter for property 'invert'.
	 *
	 * @param invert Value to set for property 'invert'.
	 */
	public MalihuScrollbarMouseOptions setInvert(Boolean invert)
	{
		this.invert = invert;
		return this;
	}

	/**
	 * Getter for property 'disableOver'.
	 *
	 * @return Value for property 'disableOver'.
	 */
	public Set<String> getDisableOver()
	{
		return disableOver;
	}

	/**
	 * Setter for property 'disableOver'.
	 *
	 * @param disableOver Value to set for property 'disableOver'.
	 */
	public MalihuScrollbarMouseOptions setDisableOver(Set<String> disableOver)
	{
		this.disableOver = disableOver;
		return this;
	}
}
