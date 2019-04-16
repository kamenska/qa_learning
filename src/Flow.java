import java.util.Random;

public class Flow {

    public static void main(String[] args) {

//decision-making statements
      int score = 0;
      String name = "Lionss";
      String result = "nothing";
      String day = "MON";
      String scores = "";
      String xy = "";
      Random r = new Random();
      int num = r.nextInt();


        if (num > 0) {
            System.out.println("The number is positive " + num);
        }

        if ("Lions".equals(name)) {   //if name equals "Lion" then put 200
            score = 200;
            System.out.println("Score is --> " + score);
        } else {
            score = 300;
            System.out.println("Score is --> " + score);
        }

//?????????
        result = name == "Lionss" ? (xy = "YES") : (xy = "NO");
        System.out.println("Name is Lionss? " + xy);


        if (score == 0) {   // we use 'else if' for the conditionals-actions
            result = "A";
            System.out.println("result is " + result + " because name is " + name);
        } else if (score == 200){
            result = "B";
            System.out.println("result is " + result + " because name is " + name);
        } else if (score == 300) {
            result = "C";
            System.out.println("result is " + result + " because name is " + name);
        } else {
            System.out.println("result is " + result + " because name is " + name);
        }

     switch (day){     // we use 'case' for the testing the value of the variable
         case "MON":
             System.out.println("The week just started...");
             break;
         case "TUE":
             System.out.println("Time to work!!");
             break;
         case "WED":
         case "THU":
         case "FRI":
             System.out.println("Nearly weekend");
             break;
         case "SAT":
             System.out.println("Weekend!!!");
             break;
         case "SUN":
             System.out.println("Weekend!!!");
             break;
         default:
             System.out.println("Invalid day?");
     }

    }

}
