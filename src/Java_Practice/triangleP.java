package Java_Practice;

public class triangleP {

	public static void main(String[] args) {
System.out.println("---------");
		
		for(int r=1;r<=5;r++) {
			
			for(int s =1 ;s<=5-r;s++) {
				System.out.println(" ");
			}
			for(int c=1;c<=r;c++) {
				
				
					System.out.print("$ ");
					
					
				
			} System.out.println();
		}
		
		System.out.println("---------");
		int i = 1;
		for(int r=1;r<=5;r++) {
		 i =1;
			for(int c=1;c<=r;c++) {
				
				
					System.out.print(i);
					i++;
				
			} System.out.println(" ");
		}
		
	}
}
