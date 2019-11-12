package week1day5;

public class FriJavaAs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="madam";
		String text1="";
		//char[] ch=text.toCharArray();
		int length = text.length();
		for(int i=length-1;i>=0;i--) {
			//System.out.println(ch[i]);
			
			text1=text1+text.charAt(i);}
			if(text==text1) {
				System.out.println(text+" is palindrome");
			}else
				System.out.println(text+" is not a palindrome");
		
		
			
		}
	}
