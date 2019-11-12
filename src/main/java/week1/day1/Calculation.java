package week1.day1;

public class Calculation {

	public int add(int a,int b) {
		int sum=a+b;
		//System.out.println(sum);
		return sum;
	}

	public int sub(int x,int y) {
		int ans=x-y;
		//System.out.println(ans);
		return ans;
	}

	public int mul(int p,int q) {
		int result=p*q;
		//System.out.println(result);
		return result;
	}


	public int div(int a1,int b1) {
		int value=a1/b1;
		//System.out.println(value);
		return value;
	}

	public static void main(String args[]) {
		Calculation c=new Calculation();
		System.out.println(c.add(2, 3));
		System.out.println(c.sub(5, 3));
		System.out.println(c.mul(2, 3));
		System.out.println(c.div(60, 10));
	}
}