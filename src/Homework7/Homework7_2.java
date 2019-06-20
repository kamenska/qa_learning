package Homework7;

import java.util.Arrays;
import java.util.Random;

public class Homework7_2 {


/*2) Write a Java program to insert an element (to specific position, for example to position with index 2) into an array.
Fill the array with your own values (random would be preferred), insertable element value specify by your own.*/

	public static void main(String[] args) {
		double[] initArr;
		initArr = new double[10];
		Random random = new Random();

//array initialization
		for(int i = 0; i < initArr.length; i++) {
			initArr[i] = Math.random();
			System.out.println(initArr[i]);
		}

//initialization of new array +1 элементом в конце
		double[] newArr = Arrays.copyOf(initArr, initArr.length+1);
//создаем переменную и передаем ей случайное значение
		int index = random.nextInt(newArr.length);
		System.out.println("Random index = " + index);
		System.out.println(newArr[index]);
		newArr[index] = 10;

//вывод нового массива
		System.out.println(Arrays.toString(newArr));


/*создается пустой массив с большим размером */
		double addArr[] =new double[initArr.length+1];
		System.out.println(addArr[5]);
		for(int i = 0; i < addArr.length; i++) {
			addArr[i] = Math.random();
			System.out.println(addArr[i]);
		}
		int j = random.nextInt(addArr.length);
		System.out.println("Random index = " + j);
		System.out.println(addArr[j]);
		addArr[j] = 10;

		//вывод нового массива
		System.out.println(Arrays.toString(addArr));


	}
}




/*3) Write a Java program to find the maximum and minimum value of an array.
 Fill the array with your own values (random would be preferred).
		double arrFind[];
		arrFind = new double[10];
		for (int i=0; i < arrFind.length; i++) {
			arrFind[i] = Math.random();
			System.out.println(arrFind[i]);
		}
			double maxVal = max(arrFind);
			double minVal = min(arrFind);
			System.out.println(maxVal);
			System.out.println(minVal);
// почему Infinity?


//		4) Write a Java program to find the common elements between two arrays of integers.
//		Fill the array with your own values (random would be preferred).


		int arr1[];
		arr1 = new int[10];
		int arr2[];
		arr2 = new int[15];
		int arrNew[];
		arrNew = new int[10];

		for (int i=0; i < arr1.length; i++) {
			arr1[i] = i*4;
			System.out.println(arr1[i]);
		}

		for (int j=0; j < arr2.length; j++) {
			arr2[j] = j *2;
			System.out.println(arr2[j]);
		}

		for (int i=0; i < arr1.length; i++) {
			for (int j=0; j< arr2.length; j++){
				if (arr1[i] == arr2[j]) {
					arrNew[i] = arr1[i];
					}
			}
			System.out.println(arrNew[i]);
		}
*/
//5) Create a JAVA program to write the even numbers from 10 to 20, both included, except 16:
//- Incrementing 2 in each step (use "continue" to skip 16)

//5) Create a JAVA program to write the even numbers from 10 to 20, both included, except 16:
//- Incrementing 1 in each step (use "continue")

//5) Create a JAVA program to write the even numbers from 10 to 20, both included, except 16:
//- With and endless loop (using "break" & "continue")






