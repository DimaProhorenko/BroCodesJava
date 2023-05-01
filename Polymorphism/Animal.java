package Polymorphism;

public class Animal {
	private String name;
	private String color;
	private static int totalAnimalsNumber = 0;
	
	public Animal(String name, String color) {
		this.name = name;
		this.color = color;
		totalAnimalsNumber++;
	}
	
	public Animal(String name) {
		this.name = name;
		System.out.println("Animal arg Constructor");
		totalAnimalsNumber++;
	}
	
	public Animal() {
		this("Animal name", "Animal color");
		System.out.println("Animal no-arg constructor");
	}
	
	public static int getTotalAnimalsNumber() {
		return totalAnimalsNumber;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void eat() {
		System.out.println("Eating");
	}
	
	public void makeNoise() {
		System.out.println("Wroooom");
	}
	
	public void sleep() {
		System.out.println("Sleep");
	}
	
	public void roam() {
		System.out.println("Roaming");
	}
}
