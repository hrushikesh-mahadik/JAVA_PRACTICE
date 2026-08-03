package dsa.practice.array;

public class TargetSum {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int target = 10;
		int sum = 0, count = 0;
		
		for(int i =0;i<a.length;i++) {
			sum =0;
			for(int j =i;j<a.length;j++) {
				sum +=a[j];
			
			if(sum == target) 
				count++; 
			break;
			
			
		
		}System.out.println(count);
	}
	}
	
}

