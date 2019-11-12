package week1.day1;

public class MobilePhone {

	public void makeCall() {

		System.out.println("call connected");
	}
	public static void main(String args[]) {
		//System.out.println("hello world");
		MobilePhone obj=new MobilePhone();
		obj.makeCall();
}
}