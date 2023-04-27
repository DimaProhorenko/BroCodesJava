
class Cat {
	
	private String name;
	private int age;
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Cat() {
		this("Unknown", 0);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return String.format("Cat name: %s\nCat age: %d", this.name, this.age);
	}
	
	public void getInfo() {
		System.out.println(this.toString());
	}
}


public class ThisKeywords {

	public static void main(String[] args) {
		
		Cat hugo = new Cat();
		Cat saber = new Cat("Saber", 2);
		
		System.out.println(hugo);
		System.out.println("");
		saber.getInfo();

	}

}
