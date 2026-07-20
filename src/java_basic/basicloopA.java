package java_basic;

public class basicloopA {
	public static void main(String[] args) {
		int k = 1; // initialization
		for(;k<=30;) // Condition
		{
			System.out.println(k);
			k+=2; //UPDATE
		}
		
		int j =1;
		while(j<=10) {
			System.out.println("K:-" +j);
			j++;
		}
		j =20;
		while(j>=10) {
			System.out.println("J" +j);
			j--;
		}
	}

}
