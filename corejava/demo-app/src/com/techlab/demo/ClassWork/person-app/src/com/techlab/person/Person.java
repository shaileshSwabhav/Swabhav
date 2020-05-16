package com.techlab.person;

public class Person {

	private String name, gender;
	private int age;
	private float height, weight, bmi;
	private final static int DEFAULT_AGE = 25;
	
	public Person() {
		
	}

	public Person(String name, int age, String gender, float height, float weight) {

		this.name = checkNameGender(name);
		this.gender = checkNameGender(gender);
		this.height = checkHeightWeight(height);
		this.weight = checkHeightWeight(weight);
		this.age = checkAge(age);
	}

	public Person(String name, String gender, float height, float weight) {
		this(name, DEFAULT_AGE, gender, height, weight);
	}

	// getters
	private void xyz() {
		System.out.println("hi");
	}
	
	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}
	
	public float getBMI() {
		return bmi;
	}
	// Other methods
	public void doWorkOut() {
		weight = (float) (weight - (weight / 100 * 20));
	}

	public void doEat() {
		weight = (float) (weight + (weight / 100 * 5));
	}

	public void calculateBMI() {
		bmi = weight / (height * height);
	}
	
	// Validations
	public String checkNameGender(String str) {

		return (str.isEmpty() || str.equals("null") ? "unspecified" : str);
	}

	public int checkAge(int age) {
		return (age <= 0 ? Math.abs(age) : age);
	}

	public float checkHeightWeight(float value) {
		return (value <= 0 ? Math.abs(value) : value);
	}
	


}
