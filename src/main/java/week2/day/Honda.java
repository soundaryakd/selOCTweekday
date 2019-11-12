package week2.day;


import week2.day1.Car;

public class Honda extends Car {
	
		public void selfDriving() {
			System.out.println("Selfdrive mode ");
			
		}

		public static void main(String[] args) {
			Honda aa=new Honda();
			aa.applyBrake();
			aa.startEngine();
			aa.selfDriving();
			aa.Gear();
			aa.handBrake();
		
			
}}
