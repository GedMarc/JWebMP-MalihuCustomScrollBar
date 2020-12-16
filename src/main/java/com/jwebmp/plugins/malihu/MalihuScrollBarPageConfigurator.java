package com.jwebmp.plugins.malihu;

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

@PluginInformation(pluginName = "Malihu Scrollbar",
		pluginUniqueName = "malihu-scrollbar",
		pluginDescription = "Highly customizable custom scrollbar jQuery plugin (Demo). Features include:\n" +
				"\n" +
				"Vertical and/or horizontal scrollbar(s)\n" +
				"Adjustable scrolling momentum\n" +
				"Mouse-wheel, keyboard and touch support\n" +
				"Ready-to-use themes and customization via CSS\n" +
				"RTL direction support\n" +
				"Option parameters for full control of scrollbar functionality\n" +
				"Methods for triggering actions like scroll-to, update, destroy etc.\n" +
				"User-defined callbacks\n" +
				"Selectable/searchable content",
		pluginVersion = "3.1.13",
		pluginDependancyUniqueIDs = "jquery",
		pluginCategories = "scrolling,ui",
		pluginSubtitle = "Highly customizable custom scrollbar jQuery plugin",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-MalihuCustomScrollBar",
		pluginSourceUrl = "https://github.com/malihu/malihu-custom-scrollbar-plugin",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-MalihuCustomScrollBar/wiki",
		pluginOriginalHomepage = "http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.jquery/malihu-custom-scrollbar",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginLastUpdatedDate = "2020/12/14",
		pluginArtifactId = "jwebmp-malihu-scrollbar",
		pluginGroupId = "malihu-custom-scrollbar",
		pluginModuleName = "com.jwebmp.plugins.malihuscrollbar",
		pluginStatus = PluginStatus.Released
)
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
