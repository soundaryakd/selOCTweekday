package wwek2.day2;

public class Bajaj extends Bike {

	@Override
	public void speed() {
		System.out.println("50 kmph");
		
	}
	public static void main(String[] args) {
		Bajaj bb = new Bajaj();
		bb.cost();
		bb.speed();
	}
	

}
