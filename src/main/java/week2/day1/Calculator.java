package week2.day1;

public class Calculator {
	public void multiply(int a,int b) {
		System.out.println(a*b);
		
	}
	public void multiply(double a,double b) {
		System.out.println(a*b);
		
	}
	public void multiply(int a,int b,int c) {
		System.out.println(a*b*c);
	}
	public static void main(String[] args) {
		Calculator cc= new Calculator();
		cc.multiply(2, 3);
		cc.multiply(3.5, 7.2);
		cc.multiply(10, 20, 30);
	}

}
