package Homework9;
import java.util.Scanner;

public class Homework9_3 {
/*The user enters the values of two variables.
The program implements the basic mathematical operations on these variables (+ - * /).
(additional: do everything in one program, split the tasks into packages,
then make a general demo class to show the results of the tasks)
*/

	public static void main(String[] arr) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter integer value for 'a': ");
		int a = input.nextInt();

		System.out.print("Enter integer value for 'b': ");
		int b = input.nextInt();

		int sum = a+b;
		int sub = a-b;
		int mult = a*b;
		double div = (double)a/(double) b;

		System.out.println("a + b = " + sum);
		System.out.println("a - b = " + sub);
		System.out.println("a * b = " + mult);
		System.out.println("a / b = " + div);

		}


}

