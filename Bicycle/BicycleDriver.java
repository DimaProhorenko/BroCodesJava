package Bicycle;

public class BicycleDriver {
	public static void main(String[] args) {
		Bicycle bmx = new Bicycle("Bmx");
		
		bmx.setSpeed(25);
		System.out.println(bmx.getSpeed());
		System.out.println(bmx.getGear());
		
		System.out.println(bmx);
	}
}
