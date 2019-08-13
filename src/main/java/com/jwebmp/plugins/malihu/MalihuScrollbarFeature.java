package com.jwebmp.plugins.malihu;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.plugins.malihu.options.MalihuScrollBarOptions;

/**
 * The main class for the beautiful malihu scrollbar
 * <p>
 * Add to anything .... almost -
 * <p>
 * http://manos.malihu.gr/jquery-custom-content-scroller/
 *
 * @param <J>
 * 		Always this
 */
public class MalihuScrollbarFeature<J extends MalihuScrollbarFeature<J>>
		extends Feature<GlobalFeatures, MalihuScrollBarOptions<?>, J>
{
	public MalihuScrollbarFeature(ComponentHierarchyBase component)
	{
		super("MalihuScrollbarFeature", component);
		component.addFeature(this);
		setOptions(new MalihuScrollBarOptions());
	}

	@Override
	public MalihuScrollBarOptions<?> getOptions()
	{
		return super.getOptions();
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery(getComponent().getJQueryID() + "mCustomScrollbar(" + getOptions() + ");");
	}
}
