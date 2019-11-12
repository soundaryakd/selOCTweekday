package week1.day2;

public class Assignment {
	public static void main(String[] args) {
		int num=1546,sum=0;
		while(num>0){
		int n=num%10;
		
        sum=sum+n;
        n=num/10;
        
	}
		System.out.println(sum);

}
}