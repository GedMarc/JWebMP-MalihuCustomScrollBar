package com.jwebmp.plugins.malihu.options;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.malihu.enumerations.MalihuScrollbarAxis;
import com.jwebmp.plugins.malihu.enumerations.MalihuScrollbarPosition;
import com.jwebmp.plugins.malihu.enumerations.MalihuScrollbarShowSettings;
import com.jwebmp.plugins.malihu.enumerations.MalihuScrollbarThemes;

import static com.fasterxml.jackson.annotation.JsonFormat.Shape.*;
import static com.jwebmp.plugins.malihu.enumerations.MalihuScrollbarThemes.*;

/**
 * http://manos.malihu.gr/jquery-custom-content-scroller/
 */
public class MalihuScrollBarOptions<J extends MalihuScrollBarOptions<J>>
		extends JavaScriptPart<J>
{
	/**
	 * Set the width of your content (overwrites CSS width), value in pixels (integer) or percentage (string).
	 */
	@JsonProperty("setWidth")
	private String width;
	/**
	 * Set the height of your content (overwrites CSS height), value in pixels (integer) or percentage (string).
	 */
	@JsonProperty("setHeight")
	private String height;
	/**
	 * Set the initial css top property of content, accepts string values (css top position).
	 * Example: setTop: "-100px".
	 */
	@JsonProperty("setTop")
	private String top;
	/**
	 * Set the initial css left property of content, accepts string values (css left position).
	 * Example: setLeft: "-100px".
	 */
	@JsonProperty("setLeft")
	private String left;
	/**
	 * Define content’s scrolling axis (the type of scrollbars added to the element: vertical and/of horizontal).
	 * Available values: "y", "x", "yx".
	 * axis: "y" – vertical scrollbar (default)
	 * axis: "x" – horizontal scrollbar
	 * axis: "yx" – vertical and horizontal scrollbars
	 */
	@JsonProperty("axis")
	private MalihuScrollbarAxis axis;
	/**
	 * Set the position of scrollbar in relation to content.
	 * Available values: "inside", "outside".
	 * Setting scrollbarPosition: "inside" (default) makes scrollbar appear inside the element. Setting scrollbarPosition: "outside" makes scrollbar appear outside the element.
	 * Note that setting the value to "outside" requires your element (or parent elements) to have CSS position: relative (otherwise the scrollbar will be positioned in relation to
	 * document’s root element).
	 */
	@JsonProperty("scrollbarPosition")
	private MalihuScrollbarPosition position;
	/**
	 * Set the amount of scrolling momentum as animation duration in milliseconds.
	 * Higher value equals greater scrolling momentum which translates to smoother/more progressive animation. Set to 0 to disable.
	 */
	@JsonProperty("scrollInertia")
	private Integer scrollInertia;
	/**
	 * Enable or disable auto-adjusting scrollbar dragger length in relation to scrolling amount (same bahavior with browser’s native scrollbar).
	 * Set autoDraggerLength: false when you want your scrollbar to (always) have a fixed size.
	 */
	@JsonProperty("autoDraggerLength")
	private Boolean autoDraggerLength;
	/**
	 * Enable or disable auto-hiding the scrollbar when inactive.
	 * Setting autoHideScrollbar: true will hide the scrollbar(s) when scrolling is idle and/or cursor is out of the scrolling area.
	 * Please note that some special themes like “minimal” overwrite this option.
	 */
	@JsonProperty("autoHideScrollbar")
	private Boolean autoHideScrollbar;
	/**
	 * Enable or disable auto-expanding the scrollbar when cursor is over or dragging the scrollbar.
	 */
	@JsonProperty("autoExpandScrollbar")
	private Boolean autoExpandScrollbar;
	/**
	 * Enable or disable content touch-swipe scrolling for touch-enabled devices.
	 * To completely disable, set contentTouchScroll: false.
	 * Integer values define the axis-specific minimum amount required for scrolling momentum (default: 25).
	 */
	@JsonProperty("contentTouchScroll")
	private Integer contentTouchScroll;
	/**
	 * Enable or disable document touch-swipe scrolling for touch-enabled devices.
	 */
	@JsonProperty("documentTouchScroll")
	private Boolean documentTouchScroll;

	/**
	 * Always keep scrollbar(s) visible, even when there’s nothing to scroll.
	 * alwaysShowScrollbar: 0 – disable (default)
	 * alwaysShowScrollbar: 1 – keep dragger rail visible
	 * alwaysShowScrollbar: 2 – keep all scrollbar components (dragger, rail, buttons etc.) visible
	 */
	@JsonProperty("alwaysShowScrollbar")
	@JsonFormat(shape = JsonFormat.Shape.NUMBER_INT)
	private MalihuScrollbarShowSettings alwaysShowScrollbar;
	/**
	 * Make scrolling snap to a multiple of a fixed number of pixels. Useful in cases like scrolling tabular data, image thumbnails or slides and you need to prevent scrolling from
	 * stopping half-way your elements.
	 * Note that your elements must be of equal width or height in order for this to work properly.
	 */
	@JsonProperty("snapAmount")
	private Integer snapAmount;
	/**
	 * Set an offset (in pixels) for the snapAmount option. Useful when for example you need to offset the snap amount of table rows by the table header.
	 */
	@JsonProperty("snapOffset")
	private Integer snapOffset;
	/**
	 * Options for the Mouse Wheel
	 */
	@JsonProperty("mouseWheel")
	private MalihuScrollbarMouseOptions<?> mouseWheel;
	/**
	 * The options for scroll buttons
	 */
	@JsonProperty("scrollButtons")
	private MalihuScrollBarScrollButtonsOptions<?> scrollButtons;
	/**
	 * The options for the keyboard
	 */
	@JsonProperty("keyboard")
	private MalihuScrollbarKeyboardOptions<?> keyboard;
	/**
	 * The advanced options set
	 */
	@JsonProperty("advanced")
	private MalihuScrollBarAdvancedOptions<?> advancedOptions;

	/**
	 * Set the scrollbar theme.
	 * View all ready-to-use themes
	 * All themes are contained in plugin’s CSS file (jquery.mCustomScrollbar.css).
	 * Default theme: "light"
	 */
	@JsonFormat(shape = STRING)
	@JsonProperty("theme")
	private MalihuScrollbarThemes theme;
	/**
	 * Enable or disable applying scrollbar(s) on all elements matching the current selector, now and in the future.
	 * Set live: true when you need to add scrollbar(s) on elements that do not yet exist in the page. These could be elements added by other scripts or plugins after some action
	 * by the user takes place (e.g. lightbox markup may not exist untill the user clicks a link).
	 * If you need at any time to disable or enable the live option, set live: "off" and "on" respectively.
	 * You can also tell the script to disable live option after the first invocation by setting live: "once".
	 */
	@JsonProperty("live")
	private String live;
	/**
	 * Set the matching set of elements (instead of the current selector) to add scrollbar(s), now and in the future.
	 */
	@JsonProperty("liveSelector")
	private String liveSelector;

	public String getWidth()
	{
		return width;
	}
	@SuppressWarnings("unchecked")
	public J setWidth(String width)
	{
		this.width = width;
		return (J)this;
	}

	public String getHeight()
	{
		return height;
	}
	@SuppressWarnings("unchecked")
	public J setHeight(String height)
	{
		this.height = height;
		return (J)this;
	}

	public String getTop()
	{
		return top;
	}
	@SuppressWarnings("unchecked")
	public J setTop(String top)
	{
		this.top = top;
		return (J)this;
	}

	public String getLeft()
	{
		return left;
	}
	@SuppressWarnings("unchecked")
	public J setLeft(String left)
	{
		this.left = left;
		return (J)this;
	}

	public MalihuScrollbarAxis getAxis()
	{
		return axis;
	}
	@SuppressWarnings("unchecked")
	public J setAxis(MalihuScrollbarAxis axis)
	{
		this.axis = axis;
		return (J)this;
	}

	public MalihuScrollbarPosition getPosition()
	{
		return position;
	}
	@SuppressWarnings("unchecked")
	public J setPosition(MalihuScrollbarPosition position)
	{
		this.position = position;
		return (J)this;
	}

	public Integer getScrollInertia()
	{
		return scrollInertia;
	}
	@SuppressWarnings("unchecked")
	public J setScrollInertia(Integer scrollInertia)
	{
		this.scrollInertia = scrollInertia;
		return (J)this;
	}

	public Boolean getAutoDraggerLength()
	{
		return autoDraggerLength;
	}
	@SuppressWarnings("unchecked")
	public J setAutoDraggerLength(Boolean autoDraggerLength)
	{
		this.autoDraggerLength = autoDraggerLength;
		return (J)this;
	}

	public Boolean getAutoHideScrollbar()
	{
		return autoHideScrollbar;
	}
	@SuppressWarnings("unchecked")
	public J setAutoHideScrollbar(Boolean autoHideScrollbar)
	{
		this.autoHideScrollbar = autoHideScrollbar;
		return (J)this;
	}

	public Boolean getAutoExpandScrollbar()
	{
		return autoExpandScrollbar;
	}
	@SuppressWarnings("unchecked")
	public J setAutoExpandScrollbar(Boolean autoExpandScrollbar)
	{
		this.autoExpandScrollbar = autoExpandScrollbar;
		return (J)this;
	}

	public Integer getContentTouchScroll()
	{
		return contentTouchScroll;
	}
	@SuppressWarnings("unchecked")
	public J setContentTouchScroll(Integer contentTouchScroll)
	{
		this.contentTouchScroll = contentTouchScroll;
		return (J)this;
	}

	public Boolean getDocumentTouchScroll()
	{
		return documentTouchScroll;
	}
	@SuppressWarnings("unchecked")
	public J setDocumentTouchScroll(Boolean documentTouchScroll)
	{
		this.documentTouchScroll = documentTouchScroll;
		return (J)this;
	}

	public MalihuScrollbarShowSettings getAlwaysShowScrollbar()
	{
		return alwaysShowScrollbar;
	}
	@SuppressWarnings("unchecked")
	public J setAlwaysShowScrollbar(MalihuScrollbarShowSettings alwaysShowScrollbar)
	{
		this.alwaysShowScrollbar = alwaysShowScrollbar;
		return (J)this;
	}

	public Integer getSnapAmount()
	{
		return snapAmount;
	}
	@SuppressWarnings("unchecked")
	public J setSnapAmount(Integer snapAmount)
	{
		this.snapAmount = snapAmount;
		return (J)this;
	}

	public Integer getSnapOffset()
	{
		return snapOffset;
	}
	@SuppressWarnings("unchecked")
	public J setSnapOffset(Integer snapOffset)
	{
		this.snapOffset = snapOffset;
		return (J)this;
	}

	public MalihuScrollbarMouseOptions<?> getMouseWheel()
	{
		if (mouseWheel == null)
		{
			mouseWheel = new MalihuScrollbarMouseOptions<>();

		}
		return mouseWheel;
	}
	@SuppressWarnings("unchecked")
	public J setMouseWheel(MalihuScrollbarMouseOptions<?> mouseWheel)
	{
		this.mouseWheel = mouseWheel;
		return (J)this;
	}

	public MalihuScrollBarScrollButtonsOptions<?> getScrollButtons()
	{
		if (scrollButtons == null)
		{
			scrollButtons = new MalihuScrollBarScrollButtonsOptions<>();
		}
		return scrollButtons;
	}
	@SuppressWarnings("unchecked")
	public J setScrollButtons(MalihuScrollBarScrollButtonsOptions<?> scrollButtons)
	{
		this.scrollButtons = scrollButtons;
		return (J)this;
	}

	public MalihuScrollbarKeyboardOptions<?> getKeyboard()
	{
		if (keyboard == null)
		{
			keyboard = new MalihuScrollbarKeyboardOptions<>();
		}
		return keyboard;
	}
	@SuppressWarnings("unchecked")
	public J setKeyboard(MalihuScrollbarKeyboardOptions<?> keyboard)
	{
		this.keyboard = keyboard;
		return (J)this;
	}

	/**
	 * Getter for property 'advancedOptions'.
	 *
	 * @return Value for property 'advancedOptions'.
	 */
	public MalihuScrollBarAdvancedOptions<?> getAdvancedOptions()
	{
		return advancedOptions;
	}

	/**
	 * Setter for property 'advancedOptions'.
	 *
	 * @param advancedOptions Value to set for property 'advancedOptions'.
	 */
	@SuppressWarnings("unchecked")
	public J setAdvancedOptions(MalihuScrollBarAdvancedOptions<?> advancedOptions)
	{
		this.advancedOptions = advancedOptions;
		return (J)this;
	}

	public MalihuScrollbarThemes getTheme()
	{
		if (theme == null)
		{
			theme = Light;
		}
		return theme;
	}

	@SuppressWarnings("unchecked")
	public J setTheme(MalihuScrollbarThemes theme)
	{
		this.theme = theme;
		return (J)this;
	}

	public String getLive()
	{
		return live;
	}
	@SuppressWarnings("unchecked")
	public J setLive(String live)
	{
		this.live = live;
		return (J)this;
	}

	public String getLiveSelector()
	{
		return liveSelector;
	}

	@SuppressWarnings("unchecked")
	public J setLiveSelector(String liveSelector)
	{
		this.liveSelector = liveSelector;
		return (J)this;
	}
}
