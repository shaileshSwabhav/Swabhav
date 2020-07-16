package com.techlab.pattern;

public class AutoMobileFactory {

	private static AutoMobileFactory factory;
	private static IAutoMobile bmw, audi, tesla;
	
	public IAutoMobile make(AutoType type) {
		
		if(type == AutoType.BMW) {
			if (bmw == null) {
				bmw = new BMW();
			} 
			return bmw;
		} else if (type == AutoType.AUDI) {
			if (audi == null) {
				audi = new Audi();
			} 
			return audi;

		} else if (type == AutoType.TESLA) {
			if (tesla == null) {
				tesla = new Tesla();
			} 
			return tesla;

		}
		return null;
	}
	
	
	public static AutoMobileFactory getInstance() {
		
		if (factory == null) {
			factory = new AutoMobileFactory();
		}
		
		return factory;

	}
}
