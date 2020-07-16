package com.techlab.pattern;

public enum AutoType {

	BMW, AUDI, TESLA;
	
	public String toString() {
		switch(this) {
		case BMW: return "BMW";
		case AUDI: return "AUDI";
		case TESLA: return "TESLA";
		}
		return null;
	}
	
}
