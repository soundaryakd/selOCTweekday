package week1.day1;

public class MyVehicle {

	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		System.out.println("car name:"+v.carName);
		System.out.println("car number:"+v.carNumber);
		System.out.println("fuel capacity:"+v.capacity+" ltr");
		System.out.println("Is the car punchered?:"+v.isPunchered);
		System.out.println("maximum speed of the car:"+v.maxSpeed()+" kmph");
		System.out.println("air pressure:"+v.airPressure()+" psi");
		System.out.println("Is the engine on?:"+v.isEngineOn());

		// TODO Auto-generated method stub

	}

}
