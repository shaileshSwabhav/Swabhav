package com.techlab.composite.html;

public class Control implements IHtml {

	private StringBuilder sb;
	private final String tag;
	private String type;
	private String value;

	public Control(String tag, String type, String value) {
		this.tag = tag;
		this.type = type;
		this.value = value;
		this.sb = new StringBuilder();

	}

	public Control(String tag) {
		this.tag = tag;
		this.sb = new StringBuilder();

	}

	@Override
	public StringBuilder parseHtml() {
		sb.append("<" + tag);
		sb.append(" type = " + type);
		sb.append(" value = " + value);
		sb.append("> </" + tag + ">");

		sb.append("\n");

		return sb;
	}

}
