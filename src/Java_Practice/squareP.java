package Java_Practice;

public class squareP {
public static void main(String[] args) {
	for(int a=1 ; a<=5 ; a++) {
		for(int b=1 ; b<=5 ; b++) {
			System.out.print(b + " ");
		}
		System.out.println();
	}
	
	
	char ch1 = 'A';
			for(int a=1 ; a<=5 ; a++) {
				ch1='A';
				for(int b=1 ; b<=5 ; b++) {
					System.out.print(ch1 + " ");
					ch1++;
				}
				System.out.println();
			}
}
}
