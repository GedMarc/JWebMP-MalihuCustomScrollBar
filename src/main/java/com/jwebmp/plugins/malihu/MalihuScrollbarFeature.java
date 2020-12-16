package com.jwebmp.plugins.malihu;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
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
	public MalihuScrollbarFeature(IComponentHierarchyBase<?,?> component)
	{
		super("MalihuScrollbarFeature", component);
		component.asFeatureBase().addFeature(this);
		setOptions(new MalihuScrollBarOptions<>());
	}

	@Override
	public MalihuScrollBarOptions<?> getOptions()
	{
		return super.getOptions();
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("if (!/Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent)) {")
		       .append(getNewLine());
		builder.append(getComponent().asBase().getJQueryID())
		       .append("mCustomScrollbar(")
		       .append(getOptions())
		       .append(");")
		       .append(getNewLine());
		builder.append(" $(\".sidebar-content\").addClass(\"desktop\");")
		       .append(getNewLine());
		builder.append("}")
		       .append(getNewLine());
		addQuery(builder);
	}
}
