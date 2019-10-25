package main.java.Homework7;

public class Homework7_3 {

/*3) Write a Java program to find the maximum and minimum value of an array.
 Fill the array with your own values (random would be preferred).*/

//create initial array with random value

	public static double maxValue(double[] arr) {
		double max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if (arr[i]>max){
				max = arr[i];
			}
		}
		return max;
	}


	public static double minValue(double[] arr) {
		double min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if (arr[i]<min){
				min = arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		double initArr[];
		initArr = new double[10];
		for(int i = 0; i < initArr.length; i++) {
			initArr[i] = Math.random();
			System.out.println(initArr[i]);
		}
	System.out.println("max value = " + maxValue(initArr));
	System.out.println("min value = " + minValue(initArr));
	}

}
