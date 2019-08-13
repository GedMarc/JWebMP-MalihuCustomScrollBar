package com.jwebmp.plugins.malihu;

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

public class MalihuScrollBarPageConfigurator
		implements IPageConfigurator<MalihuScrollBarPageConfigurator>
{
	private static boolean enabled = true;

	@Override
	public @NotNull Page<?> configure(Page<?> page)
	{
		page.addJavaScriptReference(MalihuScrollBarReferences.MalihuScrollBarReferencesReference.getJavaScriptReference());
		page.addCssReference(MalihuScrollBarReferences.MalihuScrollBarReferencesReference.getCssReference());

		JQueryPageConfigurator.setRequired(true);
		return page;
	}

	@Override
	public boolean enabled()
	{
		return enabled;
	}

	public static boolean isEnabled()
	{
		return enabled;
	}

	public static void setEnabled(boolean enabled)
	{
		MalihuScrollBarPageConfigurator.enabled = enabled;
	}
}
