package Homework7;
import java.util.Arrays;
import java.util.Random;

public class Homework7_2 {


/*2) Write a Java program to insert an element (to specific position, for example to position with index 2) into an array.
Fill the array with your own values (random would be preferred), insertable element value specify by your own.*/

	public static int generateRandomIndex(double[] arr) {
		Random random = new Random();
		int index = random.nextInt(arr.length);
		System.out.println("Random index = " + index);
		return index;
	}

	public static double[] insertValueInArray(double[] arr, int index) {
//initialization of new array by copy
		double[] newArr = Arrays.copyOf(arr, arr.length + 1);
		System.out.println(Arrays.toString(newArr));

//moving all value
			for(int i = index; i < newArr.length; i++) {
			newArr[i + 1] = arr[i];
			}
		return newArr;
	}

	public static void main(String[] args) {
		double[] initArr;
		initArr = new double[3];
//array initialization
		for(int i = 0; i < initArr.length; i++) {
			initArr[i] = Math.random();
			System.out.println(initArr[i]);
		}

//вывод нового массива
		System.out.println(Arrays.toString(insertValueInArray(initArr, 25)));

	}
}