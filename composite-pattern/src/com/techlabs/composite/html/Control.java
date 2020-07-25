package com.techlabs.composite.html;

public class Control implements IHtml {

	private final String tag;
	private String type;
	private String value;

	public Control(String tag, String type, String value) {
		this.tag = tag;
		this.type = type;
		this.value = value;
	}

	@Override
	public StringBuilder parseHtml() {
		StringBuilder html = new StringBuilder();
		html.append("<" + tag + " type = " + type + " value = " + value + "></" + tag + "\n");
		return html;
	}

}
