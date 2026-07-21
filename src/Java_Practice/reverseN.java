package Java_Practice;

public class reverseN {
	public static void main(String[] args) {
		int y = 1221;
		int r = 0,n=0;
		int a = y;
		
		while(y>0) {
			n=y%10;
			r = (r*10)+n;
			y=y/10;
		}
		System.out.println(r);
		
		if(a==r) {
			System.out.println("it is Palindrome");
		}else {
			System.out.println("it is Not palindrome");
		}
		
			
	}}