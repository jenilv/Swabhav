package com.techlabs.composite.html;

import java.util.ArrayList;
import java.util.List;

public class ControlGroup implements IHtml {

	private final String tag;
	private List<IHtml> controls;

	public ControlGroup(String tag) {
		this.tag = tag;
		this.controls = new ArrayList<IHtml>();
	}

	public void addControl(IHtml element) {
		controls.add(element);
	}

	public List<IHtml> getControls() {
		return controls;
	}

	public void setControls(List<IHtml> controls) {
		this.controls = controls;
	}

	@Override
	public StringBuilder parseHtml() {
		StringBuilder html = new StringBuilder();
		html.append("<" + tag + ">\n");
		if (controls != null) {
			for (IHtml iHtml : controls) {
				html.append(iHtml.parseHtml());
			}
		}
		html.append("</" + tag + ">\n");
		return html;
	}

}
