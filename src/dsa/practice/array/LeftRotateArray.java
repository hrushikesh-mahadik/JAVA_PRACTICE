package dsa.practice.array;


import java.util.Arrays;

public class LeftRotateArray {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		arr[arr.length - 1] = temp;
		System.out.println(Arrays.toString(arr));
	
		////////////////////////////////////
		int temp2 = arr[arr.length - 1];  // save last element
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];  // shift everything right
		}
		arr[0] = temp2;  // put saved element at front
		
		System.out.println(Arrays.toString(arr));
	}
	
}
