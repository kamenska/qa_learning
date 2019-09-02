package Homework8;

public class Homework8_3 {

//Write Java program using nested loops that produce following input:

	public static void main(String[] args) {

int m = 5; // size of pyramid

		for(int line = 0; line <= m; line++) {
//build spaces
			for(int element = m; element >= 0; element--) {
				if(element - line > 0) System.out.print(" ");
			}
//build pyramid
			for(int element = line; element >=0; element--) System.out.print("* ");

		System.out.println();
		}

// build the snow
//			for(int element = 1; element <= m; element++){
//				if(line % 2 == 0) {
//					System.out.printf(" %s", "*");
//				}  // for even line
//				else {
//					System.out.printf("%s ", "*");
//				}            // for odd line

//			evenS = ((18 - column) % 2);
//			middle = 9;




//			for(p = 0; p < 9; p++) {  //elements
//				if(evenS == 0 && p != middle + l & p <= middle - l) {   //if it's even stroke
//					System.out.print(" *");
//					} else if(evenS != 0 & p >= middle & p <= middle + l) {    //if it's not even stroke
//					System.out.print(" *");
//					} else {
//					System.out.printf(" %s", "s");
//					}
//				}
//			System.out.println();
//			}
//		return p;

//	System.out.println(builPyramide(9));
	}

}




