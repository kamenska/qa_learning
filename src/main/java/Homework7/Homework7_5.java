package main.java.Homework7;

public class Homework7_5 {

	public static void main(String[] args) {
//5) Create a JAVA program to write the even numbers from 10 to 20, both included, except 16:
//- Incrementing 2 in each step (use "continue" to skip 16)
		for(int i = 10; i <= 20; i = i + 2) {
			if (i == 16) continue;
			System.out.println("evNum = " + i);
		}

/*
		int r = 10;
		while(r <= 20) {
			if(r == 16) {
				r = r + 2;
				continue;
			} else if(r % 2 == 0) {
				System.out.println("r = " + r);
			}
			r = r + 2;
		}*/

//5) Create a JAVA program to write the even numbers from 10 to 20, both included, except 16:
//- Incrementing 1 in each step (use "continue")

		int a = 10;
		while(a <= 20) {
			if(a == 16) {
				a = a + 1;
				continue;
			}

			if(a % 2 == 0) {
				System.out.println("a = " + a);
			}

			a = a + 1;
		}



//5) Create a JAVA program to write the even numbers from 10 to 20, both included, except 16:
//- With and endless loop (using "break" & "continue")


		int i = 10;
		while(true) {
			if(i == 16) {
				i = i + 2;
				continue;
			}

			System.out.println("i = " + i);

			if(i == 20) break;
			i = i + 2;
		}
	}

}


