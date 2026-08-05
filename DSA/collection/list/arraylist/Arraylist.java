package collection.list.arraylist;

import java.util.ArrayList;



public class Arraylist {
public static void main(String[] args) {
	ArrayList<Integer>  arr = new ArrayList<>();
	
	arr.add(10);
	// arr.add(20);
	// arr.add(30);
	arr.add(99);
	System.out.println(arr);
	arr.remove(0);
	System.out.println(arr);
	
	ArrayList<Integer> arr2 = new ArrayList<>();
	arr2.add(15);
	arr2.add(20);
	arr2.add(25);
	arr2.add(30);
	System.out.println(arr2);
	System.out.println(arr2.size());
	
	
	arr.addAll(arr2);
	System.out.println(arr);
	arr.removeAll(arr2);
	System.out.println(arr);
	
//	arr.clear();
	System.out.println(arr);
    arr.set(0,95);
    System.out.println(arr);
	
	
}
}
