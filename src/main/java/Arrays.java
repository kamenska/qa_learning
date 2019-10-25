package main.java;

public class Arrays {

	public static void main(String[] args) {

//array declaration
	int numbers[];
	String letters[];
	int multiArray[][];

//array allocation
	numbers = new int[7];
	letters = new String[3];
	multiArray = new int[6][3];

//array initialization
	for (int i=0; i < numbers.length; i++){
		numbers[i] = i+5;
		System.out.println(numbers[i]);
	}
	System.out.println(numbers);

	}

}
