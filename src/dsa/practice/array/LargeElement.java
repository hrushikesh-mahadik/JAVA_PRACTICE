package dsa.practice.array;

import java.util.Scanner;

public class LargeElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE SIZE OF ARRAY: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("ENTER ELEMENTS:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        System.out.println("ARRAY MAX ELEMENT IS : " + max);
        System.out.println("ARRAY MAX INDEX IS   : " + maxIndex);

        sc.close();
    }
}