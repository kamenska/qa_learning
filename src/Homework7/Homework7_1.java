package Homework7;

public class Homework7_1 {


/*1. Write a Java program to test if an array contains a specific value.
Fill the array with your own values (random
 would be preferred) and containing values you also choosing by yourself.
 */
public static boolean checkValueInArray(int[] args, int x) {
  	boolean res = false;

	for(int i = 0; i < args.length; i++) {
		if(args[i] == x) {
			res = true;
			break;
		}
	}
	return res;
}

public static void main(String[] args) {
	int[] arrNum;
	arrNum = new int[10];
	int	x = 5;

 	for(int i = 0; i < arrNum.length; i++){
		arrNum[i] = ((int) (Math.random() * 10));
//		System.out.println(arrNum[i]);
	}

System.out.println(checkValueInArray(arrNum, x));
 	

/*2) Write a Java program to insert an element (to specific position, for example to position with index 2) into an array.
Fill the array with your own values (random would be preferred), insertable element value specify by your own.

		char arrCh[];
		arrCh = new char[]{'a', 'b', 'c', 'd'};
		arrCh[2] = 'x';
		System.out.println(arrCh);
		System.out.println("arrCh = " +arrCh);
		почему так не работает???

/*
//3) Write a Java program to find the maximum and minimum value of an array.
// Fill the array with your own values (random would be preferred).
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




	}

}