package main.java.Homework9;

import java.util.Scanner;

public class Homework9_2 {

	/*Task: the user enters the number of lines, then the values of these lines.
	The program calculates the average length of lines and displays on the screen.
	 */
	public static void main(String[] arr) {
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);

		System.out.println("Enter the number of lines: ");
		int lines = input1.nextInt();
		int lineLengthAll = 0;

		for(int i = 1; i <= lines; i=i+1) {
			System.out.println("Enter any word for this line: ");
			String word = input2.nextLine();
			int lineLength = word.length();
			lineLengthAll = lineLength + lineLengthAll;
		}
		double aver = (double)lineLengthAll/(double)lines;
		System.out.println("You entered: " + aver + " symbols in average");
	}

}

