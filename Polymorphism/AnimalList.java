package Polymorphism;

import java.util.Arrays;

public class AnimalList {
	private int size = 0;
	private Animal[] animals;
	private int nextIndex = 0;
	
	public AnimalList(int size) {
		this.size = size;
		animals = new Animal[this.size];
	}
	
	public void add(Animal a) {
		if (nextIndex < size) {
			animals[nextIndex] = a;
			nextIndex++;
		}
	}
	
	public String toString() {
		return Arrays.toString(animals);
	}
}
