package com.techlab.guitar;

public class GuitarSpecs {

	private String model;
	private Builder builder;
	private Type type;
	private Wood backWood, topWood;
	
	public GuitarSpecs(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}
	
	public Builder getBuilder() {
		return builder;
	}
	
	public Type getType() {
		return type;
	}
	
	public Wood getBackWood() {
		return backWood;
	}
	
	public Wood getTopWood() {
		return topWood;
	}
	
	public String getModel() {
		return model;
	}
	
	public boolean matches(GuitarSpecs spec) {
		if(builder != spec.builder)
			return false;			
		if((model != null) && (!model.equals("")) && (!model.equals(spec.model)))
			return false;			
		if(type != spec.type)
			return false;						
		if(backWood != spec.backWood)
			return false;			
		if(topWood != spec.topWood) 
			return false;			
		return true;
	}
		
}
