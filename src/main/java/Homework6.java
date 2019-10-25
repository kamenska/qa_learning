package main.java;

public class Homework6 {

	public static void main(String[] args) {
//It is necessary for the program to display the following sequence of numbers 7 14 21 28 35 42 49 56 63 70 77 84 91 98
		int i = 1;
		int r = 1;
		while(r < 98) {
			r = i * 7;
			System.out.println("r = " + r);
			i++;
		}

		int i2 = 1;
		int r2 = 1;
		do {
			r2 = i2 * 7;
			System.out.println(i2 + ": " + r2);
			i2++;
		} while(r2 < 98);

//It is necessary for the program to display the following sequence of numbers 1 2 4 8 16 32 64 128 256
		int rr = 1;
		while(rr <= 256) {
			System.out.println("rr = " + rr);
			rr = rr * 2;
		}

		int ii = 1;
		do {
			System.out.println("ii = " + ii);
			ii = ii * 2;
		} while(ii <= 256);

//for
//		for(int a = 0; a < Math.abs(3333); a++) {
//			System.out.print(a + " ffff");
//		}

}


}

