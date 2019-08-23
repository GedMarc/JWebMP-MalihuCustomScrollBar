module com.jwebmp.plugins.malihuscrollbar {
	exports com.jwebmp.plugins.malihu;
	exports com.jwebmp.plugins.malihu.enumerations;
	exports com.jwebmp.plugins.malihu.options;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.fasterxml.jackson.databind;
	requires com.fasterxml.jackson.annotation;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.malihu.MalihuScrollBarPageConfigurator;
}