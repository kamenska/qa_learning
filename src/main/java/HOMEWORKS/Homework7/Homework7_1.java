package main.java.HOMEWORKS.Homework7;

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
	}

}