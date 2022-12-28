package week1.day1;

public class Bike {

	public void applyBrake() {
		System.out.println("Applied Brake");

	}
    public void soundHorn() {
		System.out.println("Sound Horn");
	}
    public static void main(String[] args) {
		Car result = new Car();
		result.applyBrake();
		result.soundHorn();
		
		Bike result1 = new Bike();
		result1.applyBrake();
		result1.soundHorn();
	}
}
