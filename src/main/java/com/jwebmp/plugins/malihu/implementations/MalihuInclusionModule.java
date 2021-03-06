package com.jwebmp.plugins.malihu.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class MalihuInclusionModule implements IGuiceScanModuleInclusions<MalihuInclusionModule>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.malihuscrollbar");
		return set;
	}
}
