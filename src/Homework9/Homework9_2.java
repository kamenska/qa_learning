package Homework9;

import java.util.Scanner;

public class Homework9_2 {

	/*Task: the user enters the number of lines, then the values of these lines.
	The program calculates the average length of lines and displays on the screen.
	 */
	public static void main(String[] arr) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of lines: ");
		int lines = input.nextInt();
		int lineLengthAll = 0;

		for(int i = 0; i <= lines; i=i+1) {
			System.out.print("Enter any word for this line: ");
			String word = input.nextLine();
			int lineLength = word.length();
			lineLengthAll = lineLength + lineLengthAll;
		}

		System.out.println("You entered: " + lineLengthAll/lines + "symbols in average");
	}

}

