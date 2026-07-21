package Java_Practice;

public class primeN {
public static void main(String[] args) {
	int y = 6;
		int cout=0;
		for(int i=1; i<=y ;i++) {
			if(y%i==0) {cout++;
		}
			System.out.println(cout);
}
		if(cout==2) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
		
}}