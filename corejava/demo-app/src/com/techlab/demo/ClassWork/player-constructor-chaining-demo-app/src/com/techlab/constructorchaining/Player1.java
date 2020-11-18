package com.techlab.constructorchaining;

public class Player1 {

	private int id;
	private String name;
	private int age;
	private int score;

	public Player1(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public Player1(int id, String name, int age, int score) {
		this(id, name, age);
		this.score = score;
	}

}
