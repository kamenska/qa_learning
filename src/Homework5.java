import java.util.Random;

public class Homework5 {
    public static void main(String[] args) {

// 1 task
//If i equals to 20 → Change variable s value to "First task". Print it to the console
//If i NOT equals to 20 → Change variable s value to "First task second option" and change i value to 10. Print it to the console
//If i equals 10 → Assign "Initial result" to result variable

        int i = 10;
        String s = "anything";
        String result = "";

        if (i == 20) {
            s = "First task";
            System.out.println("'s' = " + s);
        } else if (i == 10){
            result = "Initial result";
            System.out.println(result);
        } else {
            s = "First task second option";
            i = 10;
            System.out.println("'s' = " + s + " and 'i' = " + i);
        }

// 2 task
//String month = "" which can have any of the following values: JAN, FEB, MAR, APRIL, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
        String month = "FEB";
        switch (month){
            case "JAN":
                System.out.println("JAN");
                break;
            case "FEB":
                System.out.println("FEB");
            case "MAR":
                System.out.println("MAR");
                break;
            case "APRIL":
                System.out.println("APRIL");
                break;
            case "MAY":
                System.out.println("MAY");
                break;
            case "JUN":
                System.out.println("JUN");
                break;
            case "JUL":
                System.out.println("JUL");
                break;
            case "AUG":
                System.out.println("AUG");
                break;
            case "SEP":
                System.out.println("SEP");
                break;
            case "OCT":
                System.out.println("OCT");
            case "NOV":
                System.out.println("NOV");
                break;
            case "DEC":
                System.out.println("DEC");
            default:
                System.out.println("APRIL");
        }

// 3 task
//If i>4 assign the value of "Result1" to variable result. Otherwise, assign the value of "Result2" to variable result.
        int a = new Random().nextInt(10);
        String res = "";
        res = (a > 4) ? "Result1" : "Result2";
        System.out.println("a = " + a + ", res = " + res);
    }
}
