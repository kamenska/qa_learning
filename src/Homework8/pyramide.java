package Homework8;

public class pyramide {

	public static void main(String[] args) {


		for (int i = 1; i <= 5; i++) { // loop row
			for (int k = 1; k <= 5 - i; k++) { // 1st triangle (printing space)
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) { // 2nd triangle
				System.out.print("*");
			}
			for (int l = 1; l <= i - 1; l++) { //3rd triangle
				if (i == 1) {
					break;
				}
				System.out.print("*");
			}

			System.out.println();
		}
	}

}
