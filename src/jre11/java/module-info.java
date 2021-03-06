import com.jwebmp.plugins.malihu.implementations.MalihuInclusionModule;

module com.jwebmp.plugins.malihuscrollbar {
	exports com.jwebmp.plugins.malihu;
	exports com.jwebmp.plugins.malihu.enumerations;
	exports com.jwebmp.plugins.malihu.options;

	requires com.jwebmp.core;
	requires jakarta.validation;
	requires com.fasterxml.jackson.databind;

	opens com.jwebmp.plugins.malihu to com.fasterxml.jackson.databind, com.google.guice, com.jwebmp.core;
	opens com.jwebmp.plugins.malihu.implementations to com.google.guice;
	opens com.jwebmp.plugins.malihu.options to com.fasterxml.jackson.databind, com.google.guice, com.jwebmp.core;
	
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with MalihuInclusionModule;
	
	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.malihu.MalihuScrollBarPageConfigurator;
}
