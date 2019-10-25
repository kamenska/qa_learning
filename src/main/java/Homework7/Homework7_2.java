package main.java.Homework7;
import java.util.Arrays;
import java.util.Random;

/*2) Write a Java program to insert an element (to specific position, for example to position with index 2) into an array.
Fill the array with your own values (random would be preferred), insertable element value specify by your own.*/
public class Homework7_2 {

//create 'rIndex' to define random position
	public static int generateRandomIndex(double[] arr) {
		Random random = new Random();
		int rIndex = random.nextInt(arr.length); //cast double to integer
		System.out.println("Random index = " + rIndex);
		return rIndex;
	}

//expand a new array
	public static double[] insertValueInArray(double[] arr, int index) {
		double[] newArr = Arrays.copyOf(arr, arr.length + 1); //create a new array by copy of initial array
		for(int i = index; i < arr.length; i++) { //expand the array
			newArr[index] = 1.1111111;  //assign this value to defined position
			newArr[i + 1] = arr[i];
		}
		return newArr;
	}

//create the initial array with random double values
	public static void main(String[] args) {
		double[] initArr;
		initArr = new double[5];
		for(int i = 0; i < initArr.length; i++) {
			initArr[i] = Math.random();
			System.out.println(initArr[i]);
		}
		int r = generateRandomIndex(initArr);
		System.out.println(Arrays.toString(insertValueInArray(initArr, r)));

	}

}


/*
 */

/*

//create a new array by copy of initial
		double[] newArr = main.java.Arrays.copyOf(initArr, initArr.length + 1);
//expand the new array
		int r = generateRandomIndex(initArr);
		for(int i = r; i < initArr.length; i++) {
			newArr[r] = 1.1111111;
			newArr[i + 1] = initArr[i];
		}

//вывод нового массива
		System.out.println("Last array");
		System.out.println(main.java.Arrays.toString(newArr));
* */