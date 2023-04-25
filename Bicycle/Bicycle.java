package Bicycle;

public class Bicycle {
	private int speed;
	private int gear;
	private String make;
	
	
	public Bicycle(int startSpeed, int startGear, String startMake) {
		speed = startSpeed;
		gear = startGear;
		make = startMake;
	}
	
	public Bicycle() {
		speed = 0;
		gear = 0;
		make = "Unknown";
	}
	
	public Bicycle(String startMake) {
		make = startMake;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int newValue) {
		speed = newValue;
	}
	
	public int getGear() {
		return gear;
	}
	
	public void setGear(int newValue) {
		gear = newValue;
	}
	
	public String getMake() {
		return make;
	}
	
	public void setString(String newValue) {
		make = newValue;
	}
	
	public String toString() {
		return String.format("Make: %s\nSpeed: %d\nGear: %d.", make, speed, gear);
	}
}
