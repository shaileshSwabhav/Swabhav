package com.techlab.composite.html;

import java.util.ArrayList;
import java.util.List;

public class ControlGroup implements IHtml {

	private final String tag;
	private List<IHtml> controls = new ArrayList<IHtml>();
	private StringBuilder sb;

	public ControlGroup(String tag) {
		this.tag = tag;
		sb = new StringBuilder();
	}

	public void addControl(IHtml element) {
		controls.add(element);
	}

	@Override
	public StringBuilder parseHtml() {
		// TODO Auto-generated method stub
		
		sb.append("<" + tag + ">");
		sb.append("\n");
		
		for (IHtml s : controls) {
			sb.append(s.parseHtml());
		}
		
		sb.append("</" + tag + ">");
		sb.append("\n");

		return sb;
	}

}
