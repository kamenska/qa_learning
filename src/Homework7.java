public class Homework7 {

	public static void main(String[] args) {
/*1. Write a Java program to test if an array contains a specific value. Fill the array with your own values (random
 would be preferred) and containing values you also choosing by yourself. */

		int arrNum[];
		arrNum = new int[7];

		for (int i=0; i < arrNum.length; i++){
			if ((i/2)>0){
				arrNum[i] = i+5;
			}
		}

			System.out.println(arrNum[i]);
	}
}