public class Loop {

	public static void main(String[] args) {

//homework6

/*		int i = 1;
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

		//
		int r = 1;
		while(r <= 256) {
			System.out.println("r = " + r);
			r = r * 2;
		}

		int i = 1;
		do {
			System.out.println("i = " + i);
			i = i * 2;
		} while(i <= 256);*/

//for
//		for(int a = 0; a < Math.abs(3333); a++) {
//			System.out.print(a + " ffff");
//		}

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