package main.java;

public class Loop {

	public static void main(String[] args) {
		int a = 1;
		int count = 0;

//while
		while(a < 7) {
			if(a % 2 == 0) {
				System.out.println(a + " is even");
			} else {
				System.out.println(a + " is odd");
			}
			a += 1;
		}

//do-while
		do {
			System.out.printf("Count is: " + count);
			count++;
		} while(count <= 10);

//for
		for(int j = 0; j < 10; j++) {
			System.out.println("Count is: " + j);
		}


//keyword break
		int numbers [];
		numbers =  new int [7];
		int searchfor = 12;
		int index = -1;
		for (int i =0; i < numbers.length; i++){
			if (numbers[i]== searchfor){
				index = 1;
				break;
			}
		}

//keyword continue
		String searchMe = "pleasep";
		int max = searchMe.length();
		int numPs = 0;
		for (int i =0; i < max; i++){
			if (searchMe.charAt(i) != 'p'){
				continue;
			}
			numPs++;
			System.out.println("numPs = " +numPs);
		}

	}
}