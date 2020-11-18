package com.techlab.decorator;

public abstract class BikeServices implements IBikeService {

	protected IBikeService bikeService;
	
	public BikeServices(IBikeService bikeService) {
		this.bikeService = bikeService;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return bikeService.getCost();
	}

}
