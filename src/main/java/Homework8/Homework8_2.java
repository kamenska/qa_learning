package main.java.Homework8;

// но в условии было сказано о трех for
public class Homework8_2 {

	public static void main(String[] args) {
//Write a Java program by using three for loops to print the following pattern:
		int x, y;

		for(x = 1; x <= 7; x++) {
			for(y = 1; y <= 7; y++) {
				if(y <= x) {
					System.out.print(y);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}


//	public static void main(String[] args) {
//
//		int a, b;
//		int evenS, middle;
//
//		for(a = 0; a <= 9; a++) {
//			evenS = ((9 - a) % 2);
////			middle =  ((9-a)/2);
//			middle = 10;
//			for(b = 0; b < 9; b++) {
//				if(evenS == 0 & b >= middle + a & b <= middle - a) {   //if it's even stroke
//					System.out.print("* ");
//				} else if(evenS != 0 & b >= middle & b <= middle + a) {    //if it's not even stroke
//					System.out.print("* ");
//				} else {
//					System.out.print("a ");
//				}
//			}
//			System.out.println();
//		}
//	}

}
