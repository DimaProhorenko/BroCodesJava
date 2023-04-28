package Polymorphism;

public class PetOwner {
	public void start() {
		Vet v = new Vet();
		Dog d = new Dog();
		Cat c = new Cat();
		
		v.giveShot(d);
		v.giveShot(c);
	}
}
