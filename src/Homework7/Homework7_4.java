package Homework7;

import java.util.Arrays;

public class Homework7_4 {

/*		4) Write a Java program to find the common elements between two arrays of integers.
		Fill the array with your own values (random would be preferred). */

	public static void main(String[] args) {
		int[] arr1;
		arr1 = new int[15];
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = (int)(Math.random()*10);
		}

		int[] arr2;
		arr2 = new int[15];
		for(int j = 0; j < arr2.length; j++) {
			arr2[j] = (int)(Math.random()*10);
		}

		int arrCommon[];
		arrCommon = new int[15];
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					arrCommon[i] = arr1[i];
				}
			}
		}

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arrCommon));
	}

}