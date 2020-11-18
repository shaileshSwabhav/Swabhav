package com.techlab.factory;

public class AutoMobileFactory {

	public IAutoMobile make(AutoType type) {
		
		if(type == AutoType.BMW) {
			return new BMW();
		} else if (type == AutoType.AUDI) {
			return new Audi();
		} else if (type == AutoType.TESLA) {
			return new Tesla();
		}
		return null;
	}
}
