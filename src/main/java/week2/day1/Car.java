package week2.day1;

public class Car extends Vehicle {
public void startEngine(){
	System.out.println("Engine Started");

}
protected void handBrake() {
	System.out.println("handbrake applied");
}
private void color() {
	System.out.println("Black");
}
public static void main(String[] args) {
	Car c=new Car();
	c.color();
}
}
