package main.java;

public class Operators {
    public static void main(String[] args) {
/* arithmetical */
        int a, b = 1, c = 1;
        a = b + c;
        System.out.println("a = " + a);

        int i = 3;
        System.out.println("i = " + i);

/*unary*/
        i++;
        System.out.println("i++ = " + i);  // at first print then add

        ++i;
        System.out.println("++i = " + i);  //  at first add then print

        i = i++ + ++i;
        System.out.println(i);

/* equality*/
        int x = 3;
        x++;

        if(x==3){ }   //we check if x is equal to 3
        boolean flag = !(x==3);  //we check the same

        boolean u = false;
        System.out.println(u);
        System.out.println(!u);  //we use operator ! for the negation of the value

        boolean w = x == 5;   // we check if x is equal to 5 than assign true

/*conditionals */
        boolean co = x == 5 && x < i;  /* && means AND
        true && true == true
        true && false == false
        false && false == false */

        boolean d = x == 5 || x < i;  /* || means OR
        true && true == true
        true && false == true
        false && false == false */


/* instanceOf*/


    }
}
