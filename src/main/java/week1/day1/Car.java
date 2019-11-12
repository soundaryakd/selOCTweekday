package week1.day1;

public class Car {
public void applyBrake() {
	System.out.println("Brake applied");
}
	public void soundOn() {
		System.out.println("turn on the music");
}
public static void main(String args[]) {
	Car c=new Car();
	c.applyBrake();
	c.soundOn();
	}
}
