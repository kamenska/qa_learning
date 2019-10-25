package main.java.Homework8;

public class Homework8_1 {

	public static void main(String[] args) {
//Write a program that will display asterisks in the console in the same pattern they're arranged here, by using two
// for loops.
		int i, j;

		for(i = 1; i <= 3; i++) {
			for(j = 1; j <= 5; j++) {
				System.out.format("%s", "*");
			}
			System.out.println();
		}
	}

}