package com.techlab.demo;

public class DrumKitTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DrumKit d = new DrumKit();
		
		d.playSnare();
		d.playTopHat();
		
		d.snare = false;
		
		if (d.snare == true) {
			d.playSnare();
		}	
	}
}

class DrumKit {
	
	boolean topHat = true;
	boolean snare = true;
	
	void playSnare() {
		System.out.println("bang bang ba-bang");
	}
	
	void playTopHat() {
		System.out.println("ding ding da-ding");
	}

}	

