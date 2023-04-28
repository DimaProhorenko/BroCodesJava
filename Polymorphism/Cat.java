package Polymorphism;

public class Cat extends Feline implements Pet {
	
	public void eat() {
		System.out.println("Cat eats");
	}
	
	public void makeNoise() {
		System.out.println("Cat meows");
	}
	
	public void play() {
		System.out.println("Cat wants to play");
	}
}
