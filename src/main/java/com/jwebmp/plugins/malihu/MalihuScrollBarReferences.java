package com.jwebmp.plugins.malihu;

import com.jwebmp.core.base.references.CSSReference;
import com.jwebmp.core.base.references.JavascriptReference;
import com.jwebmp.core.base.servlets.interfaces.IReferencePool;

public enum MalihuScrollBarReferences
		implements IReferencePool
{
	MalihuScrollBarReferencesReference(
	                   new JavascriptReference("MalihuCustomScrollbar",3.113,"bower_components/malihuscrollbar/jquery.mCustomScrollbar.concat.min.js"),
	                   new CSSReference("MalihuCustomScrollbar",3.113,"bower_components/malihuscrollbar/jquery.mCustomScrollbar.css")),
	;

	/**
	 * The actual javascript
	 */
	private JavascriptReference javaScriptReference;
	/**
	 * The actual css reference
	 */
	private CSSReference cssReference;


	/**
	 * Constructs a new reference pool
	 *
	 * @param javaScriptReference
	 * @param cssReference
	 */
	MalihuScrollBarReferences(JavascriptReference javaScriptReference, CSSReference cssReference)
	{
		this.javaScriptReference = javaScriptReference;
		this.cssReference = cssReference;
	}

	@Override
	public CSSReference getCssReference()
	{
		return cssReference;
	}

	@Override
	public void setCssReference(CSSReference cssReference)
	{
		this.cssReference  = cssReference;
	}

	@Override
	public JavascriptReference getJavaScriptReference()
	{
		return javaScriptReference;
	}

	@Override
	public void setJavaScriptReference(JavascriptReference javaScriptReference)
	{
		this.javaScriptReference = javaScriptReference;
	}
}
