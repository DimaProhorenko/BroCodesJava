
class Dog {
	int size;
	String name;
	
	public Dog(String name, int size) {
		this.name = name;
		this.size = size;
	}
	
	public void bark(int count) {
		String barkType = "Woof";
		
		if (this.size < 60) {
			barkType = "Roof";
		} else if (this.size < 40) {
			barkType = "Yif";
		}
		
		while (count > 0) {
			System.out.print(barkType);
			count--;
		}
	}
	
	public void setSize(int size) {
		this.size = size;
	}
}


public class DogTestDrive {
	public static void main(String[] args) {
		Dog spike = new Dog("Spike", 50);
		Dog chichy = new Dog("Chichy", 150);
		
		spike.bark(3);
		chichy.bark(50);
	}
}
