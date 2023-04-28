package Polymorphism;

public class Dog extends Canine implements Pet {
	private int breed;
	
	
	public int getBreed() {
		return this.breed;
	}
	
	public void setBreed(int breed) {
		this.breed = breed;
	}
	
	public void eat() {
		System.out.println("Dog eat");
	}
	
	@Override
	public void makeNoise() {
		System.out.println("Woof Woof");
	}
	
	public void growl() {
		System.out.println("Growl");
	}
	

	public void play() {
		System.out.println("Dog wants to play");
	}
}
