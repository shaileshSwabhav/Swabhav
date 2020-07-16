package com.techlab.decorator;

public class OilChange extends BikeServices {

	private int oilChangeCost = 150;
	
	public OilChange(IBikeService bikeService) {
		super(bikeService);
	}

	@Override
	public String getdescription() {
		// TODO Auto-generated method stub
		return bikeService.getdescription() + "\nOil Change done: " + oilChangeCost;
	}
	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return bikeService.getCost() + oilChangeCost;
	}

}
