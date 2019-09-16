package Homework9;

import java.util.Arrays;
import java.util.Random;

public class Homework9_1 {
// Task: fill the array with data (random). Print out. Replace all negative values with 0. Print.
	public static void main(String[] args) {
		int arrayInt []= new int [10];
		Random rnd = new Random();

//create array with positive and negative numbers
		for (int x:arrayInt) {
			x = rnd.nextInt(40) - 10;
			System.out.println(x);
		}

		System.out.println(Arrays.toString(arrayInt));

//replace all negative values with 0 and print
			for(int x : arrayInt) {
				if(x < 0) {
					x = 0;
				}
				System.out.println(x);
			}



	}
}
