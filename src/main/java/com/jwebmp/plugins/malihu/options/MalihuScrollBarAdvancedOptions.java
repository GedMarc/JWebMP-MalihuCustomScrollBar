package com.jwebmp.plugins.malihu.options;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

public class MalihuScrollBarAdvancedOptions<J extends MalihuScrollBarAdvancedOptions<J>>
		extends JavaScriptPart<J>
{
	/**
	 * Auto-expand content horizontally (for "x" or "yx" axis).
	 * If set to true, content will expand horizontally to accommodate any floated/inline-block elements.
	 * <p>
	 * This field does not support Setting its value to 2 (integer) forces the non scrollHeight/scrollWidth method. A value of 3 forces the scrollHeight/scrollWidth method.
	 */
	@JsonProperty("autoExpandHorizontalScroll")
	private Boolean autoExpandHorizontalScroll;
	/**
	 * Set the list of elements/selectors that will auto-scroll content to their position when focused.
	 * For example, when pressing TAB key to focus input fields, if the field is out of the viewable area the content will scroll to its top/left position (same bahavior with
	 * browser’s native scrollbar).
	 * To completely disable this functionality, set autoScrollOnFocus: false.
	 * Default:
	 * "input,textarea,select,button,datalist,keygen,a[tabindex],area,object,[contenteditable='true']"
	 */
	@JsonProperty("autoScrollOnFocus")
	private String autoScrollOnFocus;
	/**
	 * Update scrollbar(s) automatically on content, element or viewport resize.
	 * The value should be true (default) for fluid layouts/elements, adding/removing content dynamically, hiding/showing elements etc.
	 */
	@JsonProperty("updateOnContentResize")
	private Boolean updateOnContentResize;
	/**
	 * Update scrollbar(s) automatically each time an image inside the element is fully loaded.
	 * Default value is auto which triggers the function only on "x" and "yx" axis (if needed).
	 * The value should be true when your content contains images and you need the function to trigger on any axis.
	 */
	@JsonProperty("updateOnImageLoad")
	private Boolean updateOnImageLoad;
	/**
	 * Update scrollbar(s) automatically when the amount and size of specific selectors changes.
	 * Useful when you need to update the scrollbar(s) automatically, each time a type of element is added, removed or changes its size.
	 * For example, setting updateOnSelectorChange: "ul li" will update scrollbars each time list-items inside the element are changed.
	 * Setting the value to true, will update scrollbars each time any element is changed.
	 * To disable (default) set to false.
	 */
	@JsonProperty("updateOnSelectorChange")
	private String updateOnSelectorChange;
	/**
	 * dd extra selector(s) that’ll release scrollbar dragging upon mouseup, pointerup, touchend etc.
	 * Example: extraDraggableSelectors: ".myClass, #myID"
	 */
	@JsonProperty("extraDraggableSelectors")
	private String extraDraggableSelectors;
	/**
	 * Add extra selector(s) that’ll allow scrollbar dragging upon mousemove/up, pointermove/up, touchend etc.
	 * Example: releaseDraggableSelectors: ".myClass, #myID"
	 */
	@JsonProperty("releaseDraggableSelectors")
	private String releaseDraggableSelectors;
	/**
	 * Set the auto-update timeout in milliseconds.
	 * Default timeout: 60
	 */
	@JsonProperty("autoUpdateTimeout")
	private Integer autoUpdateTimeout;


	/**
	 * Getter for property 'autoExpandHorizontalScroll'.
	 *
	 * @return Value for property 'autoExpandHorizontalScroll'.
	 */
	public Boolean getAutoExpandHorizontalScroll()
	{
		return autoExpandHorizontalScroll;
	}

	/**
	 * Setter for property 'autoExpandHorizontalScroll'.
	 *
	 * @param autoExpandHorizontalScroll
	 * 		Value to set for property 'autoExpandHorizontalScroll'.
	 */
	@SuppressWarnings("unchecked")
	public J setAutoExpandHorizontalScroll(Boolean autoExpandHorizontalScroll)
	{
		this.autoExpandHorizontalScroll = autoExpandHorizontalScroll;
		return (J) this;
	}

	/**
	 * Getter for property 'autoScrollOnFocus'.
	 *
	 * @return Value for property 'autoScrollOnFocus'.
	 */
	public String getAutoScrollOnFocus()
	{
		return autoScrollOnFocus;
	}

	/**
	 * Setter for property 'autoScrollOnFocus'.
	 *
	 * @param autoScrollOnFocus
	 * 		Value to set for property 'autoScrollOnFocus'.
	 */
	@SuppressWarnings("unchecked")
	public J setAutoScrollOnFocus(String autoScrollOnFocus)
	{
		this.autoScrollOnFocus = autoScrollOnFocus;
		return (J) this;
	}

	/**
	 * Getter for property 'updateOnContentResize'.
	 *
	 * @return Value for property 'updateOnContentResize'.
	 */
	public Boolean getUpdateOnContentResize()
	{
		return updateOnContentResize;
	}

	/**
	 * Setter for property 'updateOnContentResize'.
	 *
	 * @param updateOnContentResize
	 * 		Value to set for property 'updateOnContentResize'.
	 */
	@SuppressWarnings("unchecked")
	public J setUpdateOnContentResize(Boolean updateOnContentResize)
	{
		this.updateOnContentResize = updateOnContentResize;
		return (J) this;
	}

	/**
	 * Getter for property 'updateOnImageLoad'.
	 *
	 * @return Value for property 'updateOnImageLoad'.
	 */
	public Boolean getUpdateOnImageLoad()
	{
		return updateOnImageLoad;
	}

	/**
	 * Setter for property 'updateOnImageLoad'.
	 *
	 * @param updateOnImageLoad
	 * 		Value to set for property 'updateOnImageLoad'.
	 */
	@SuppressWarnings("unchecked")
	public J setUpdateOnImageLoad(Boolean updateOnImageLoad)
	{
		this.updateOnImageLoad = updateOnImageLoad;
		return (J) this;
	}

	/**
	 * Getter for property 'updateOnSelectorChange'.
	 *
	 * @return Value for property 'updateOnSelectorChange'.
	 */
	public String getUpdateOnSelectorChange()
	{
		return updateOnSelectorChange;
	}

	/**
	 * Setter for property 'updateOnSelectorChange'.
	 *
	 * @param updateOnSelectorChange
	 * 		Value to set for property 'updateOnSelectorChange'.
	 */
	@SuppressWarnings("unchecked")
	public J setUpdateOnSelectorChange(String updateOnSelectorChange)
	{
		this.updateOnSelectorChange = updateOnSelectorChange;
		return (J) this;
	}

	/**
	 * Getter for property 'extraDraggableSelectors'.
	 *
	 * @return Value for property 'extraDraggableSelectors'.
	 */
	public String getExtraDraggableSelectors()
	{
		return extraDraggableSelectors;
	}

	/**
	 * Setter for property 'extraDraggableSelectors'.
	 *
	 * @param extraDraggableSelectors
	 * 		Value to set for property 'extraDraggableSelectors'.
	 */
	@SuppressWarnings("unchecked")
	public J setExtraDraggableSelectors(String extraDraggableSelectors)
	{
		this.extraDraggableSelectors = extraDraggableSelectors;
		return (J) this;
	}

	/**
	 * Getter for property 'releaseDraggableSelectors'.
	 *
	 * @return Value for property 'releaseDraggableSelectors'.
	 */
	public String getReleaseDraggableSelectors()
	{
		return releaseDraggableSelectors;
	}

	/**
	 * Setter for property 'releaseDraggableSelectors'.
	 *
	 * @param releaseDraggableSelectors
	 * 		Value to set for property 'releaseDraggableSelectors'.
	 */
	@SuppressWarnings("unchecked")
	public J setReleaseDraggableSelectors(String releaseDraggableSelectors)
	{
		this.releaseDraggableSelectors = releaseDraggableSelectors;
		return (J) this;
	}

	/**
	 * Getter for property 'autoUpdateTimeout'.
	 *
	 * @return Value for property 'autoUpdateTimeout'.
	 */
	public Integer getAutoUpdateTimeout()
	{
		return autoUpdateTimeout;
	}

	/**
	 * Setter for property 'autoUpdateTimeout'.
	 *
	 * @param autoUpdateTimeout
	 * 		Value to set for property 'autoUpdateTimeout'.
	 */
	@SuppressWarnings("unchecked")
	public J setAutoUpdateTimeout(Integer autoUpdateTimeout)
	{
		this.autoUpdateTimeout = autoUpdateTimeout;
		return (J) this;
	}


}
