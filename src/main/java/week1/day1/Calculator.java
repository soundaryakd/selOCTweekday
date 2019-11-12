package week1.day1;

public class Calculator {

	public void add(int a,int b) {
	int sum=a+b;
	System.out.println(sum);
	}
	public void sub(int x,int y) {
	int ans=x-y;
	System.out.println(ans);}
	
	public void mul(int p,int q) {
	int result=p*q;
	System.out.println(result);}
	public void div(int a1,int b1) {
	int value=a1/b1;
	System.out.println(value);}

public static void main(String args[]) {
	Calculator c=new Calculator();
	c.add(2, 3);
	c.sub(5, 3);
	c.mul(2, 3);
	c.div(60, 10);
}
}