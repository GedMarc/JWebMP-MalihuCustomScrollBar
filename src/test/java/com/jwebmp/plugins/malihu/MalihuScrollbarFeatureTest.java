package com.jwebmp.plugins.malihu;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.plugins.malihu.enumerations.*;
import com.jwebmp.plugins.malihu.options.MalihuScrollBarAdvancedOptions;
import com.jwebmp.plugins.malihu.options.MalihuScrollBarOptions;
import com.jwebmp.plugins.malihu.options.MalihuScrollbarKeyboardOptions;
import com.jwebmp.plugins.malihu.options.MalihuScrollbarMouseOptions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedHashSet;

class MalihuScrollbarFeatureTest
{

	private MalihuScrollBarOptions<?> defaultOptions()
	{
		return new MalihuScrollBarOptions<>().setHeight("auto")
		                                     .setTheme(MalihuScrollbarThemes.$3D_Thick_Dark)
		                                     .setAxis(MalihuScrollbarAxis.YX)
		                                     .setAlwaysShowScrollbar(MalihuScrollbarShowSettings.KeepAllComponentVisible)
		                                     .setPosition(MalihuScrollbarPosition.Outside)
		                                     .setTop("top")
		                                     .setLeft("left")
		                                     .setAutoDraggerLength(true)
		                                     .setAutoHideScrollbar(true)
		                                     .setLive("live")
		                                     .setLiveSelector("liveSelector")
		                                     .setWidth("width")
		                                     .setContentTouchScroll(25)
		                                     .setDocumentTouchScroll(true)
		                                     .setMouseWheel(new MalihuScrollbarMouseOptions<>()
				                                                    .setAxis(MalihuMouseWheelAxis.X)
				                                                    .setDeltaFactor(52)
				                                                    .setDisableOver(new LinkedHashSet(Arrays.asList(new String[]{"disable1", "disable2"})))
				                                                    .setEnable(true)
				                                                    .setInvert(true)
				                                                    .setNormalizeDelta(true)
				                                                    .setPreventDefault(true)
				                                                    .setScrollAmount(500)
		                                                   )
		                                     .setKeyboard(new MalihuScrollbarKeyboardOptions<>()
				                                                  .setEnable(true)
				                                                  .setScrollAmount(200)
				                                                  .setScrollType(MalihuScrollbarKeyboardScrollTypes.Stepless)
		                                                 )
		                                     .setAdvancedOptions(new MalihuScrollBarAdvancedOptions<>()
				                                                         .setAutoExpandHorizontalScroll(true)
				                                                         .setAutoScrollOnFocus("yesfocus")
				                                                         .setAutoUpdateTimeout(400)
				                                                         .setExtraDraggableSelectors("extraSelectors")
				                                                         .setReleaseDraggableSelectors("releaseSelectors")
				                                                         .setUpdateOnContentResize(true)
				                                                         .setUpdateOnImageLoad(false)
				                                                         .setUpdateOnSelectorChange("UpodateChange is string?")
		                                                        )
				;
	}

	@Test
	void getOptions()
	{
		MalihuScrollbarFeature<?> feature = new MalihuScrollbarFeature<>(new DivSimple<>());
		feature.getComponent()
		       .setID("divtest");
		feature.setID("feature");

		feature.setOptions(defaultOptions());

		System.out.println(feature.toString());
	}

	@Test
	void assignFunctionsToComponent()
	{
		Page<?> p = new Page<>();
		DivSimple d = new DivSimple();
		d.setID("d");
		d.addFeature(new MalihuScrollbarFeature<>(d)
				            .setOptions(defaultOptions()));
		p.getBody()
		 .add(d);
		p.getOptions()
		 .setDynamicRender(false);

		System.out.println(p.toString(0));
	}
}