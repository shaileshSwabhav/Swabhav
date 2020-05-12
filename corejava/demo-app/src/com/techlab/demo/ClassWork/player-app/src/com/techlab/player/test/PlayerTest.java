package com.techlab.player.test;

import com.techlab.player.Player;

public class PlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player p2 = new Player(102, "pqr", 24);
		Player p1 = new Player(101, "xyz", 23);
		Player p3 = new Player(103, "abc", 22);
 		
		printPlayerInfo(p1);
		printPlayerInfo(p2);
		printPlayerInfo(p3);
		
	}
	
	public static void printPlayerInfo(Player p) {
		
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getAge());
		
	}

}
