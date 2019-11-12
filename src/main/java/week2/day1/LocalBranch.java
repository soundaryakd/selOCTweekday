package week2.day1;

public class LocalBranch {

	public void fixedDeposit() {
		System.out.println("10 percentage");
	}
	public void savings() {
		System.out.println("5 percentage");
	}
	public static void main(String[] args) {
		/*LocalBranch l=new LocalBranch();
		l.fixedDeposit();
		l.savings();*/
		Sbi s=new Sbi();
		s.fixedDeposit();
		s.savings();
	}
}
