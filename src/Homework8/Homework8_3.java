package Homework8;

public class Homework8_3 {

//Write Java program using nested loops that produce following input:

	public static void main(String[] args) {



//	public static int builPyramide(int rows) {

		int l, p = 0, e;
		int evenS, middle;

// build the snow
		for(l=0; l <= 9; l++) {  //line
			for (e = 0; e < 9; e++){ // element in line
				if (l%2==0 ) {				System.out.printf(" %s", "*");}
				else {				System.out.printf("%s ", "*");}
			}

			evenS = ((18 - l) % 2);
			middle = 9;


//			for(p = 0; p < 9; p++) {  //elements
//				if(evenS == 0 && p != middle + l & p <= middle - l) {   //if it's even stroke
//					System.out.print(" *");
//					} else if(evenS != 0 & p >= middle & p <= middle + l) {    //if it's not even stroke
//					System.out.print(" *");
//					} else {
//					System.out.printf(" %s", "s");
//					}
//				}
			System.out.println();
			}
//		return p;

//	System.out.println(builPyramide(9));
	}

}




