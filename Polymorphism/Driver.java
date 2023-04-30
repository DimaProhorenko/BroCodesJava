package Polymorphism;

import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
//		Animal a = new Animal();
//		Dog dog = new Dog(1);
//		dog.eat();
//		Cat cat = new Cat();
//		cat.eat();
		
//		Animal spike = new Dog(1);
//		Animal tom = new Cat();
//		
//		Animal[] myAnimals = {spike, tom};
//		
//		for (Animal a:myAnimals) {
//			Driver.doStuff(a);
//		}
		
		
		
		
		
//		Wolf w = new Wolf();
//		
//		w.makeNoise();
//		w.roam();
//		w.eat();
//		w.sleep();
//		
//		PetOwner alex = new PetOwner();
//		alex.start();
//		
//		Animal myDog = new Dog();
		
//		AnimalList al = new AnimalList(2);
//		al.add(new Dog());
//		al.add(new Cat());;
//		System.out.println(al);
//		Animal d = new Dog();
//		((Dog) d).play();
		
		Duck donald = new Duck("Donald", 20);
		System.out.println(donald.getName());
	}
	
	public static void doStuff(Animal a) {
		a.makeNoise();
	}
}
