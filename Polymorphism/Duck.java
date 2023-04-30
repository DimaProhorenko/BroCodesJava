package Polymorphism;

public class Duck extends Animal {
	private int size;
	
	public Duck(int size) {
		setSize(size);
	}
	
	public Duck(String name, int size) {
		super(name);
		System.out.println("Duck constructor");
	}
	
	public int getSize() {
		return this.size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public String toString() {
		return String.format("Size: %d", this.size);
	}
}
