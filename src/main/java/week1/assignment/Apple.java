package week1.assignment;

public class Apple implements SmartPhone {
	public void fingerPrint() {
		// TODO Auto-generated method stub
		System.out.println("Accessed");
	
		
	}
	public void mobileBrowser() {
		// TODO Auto-generated method stub
		System.out.println("Browser");
		
	}
	public void embededMemory() {
		// TODO Auto-generated method stub
		System.out.println("Memory");
		
	}
	public static void main(String[] args) {
		Apple a=new Apple();
		a.fingerPrint();
		a.mobileBrowser();
		a.embededMemory();
	}

}
