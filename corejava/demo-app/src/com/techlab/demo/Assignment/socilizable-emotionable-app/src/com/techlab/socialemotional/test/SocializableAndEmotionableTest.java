package com.techlab.socialemotional.test;

import com.techlab.socialemotional.*;

public class SocializableAndEmotionableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Man m = new Man();
		atTheParty(m, m);
		atTheMovie(m);

		Boy b = new Boy();
//		atTheParty(b);
		atTheMovie(b);

	}
	
	public static void atTheParty(ISocializable obj,IEmotionable obj1) {
		obj.wish();;
		obj.depart();
		obj1.cry();
		obj1.laugh();
	}
	
	public static void atTheMovie(IEmotionable obj) {
		obj.cry();
		obj.laugh();
	}

}
