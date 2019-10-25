package main.java;

import main.java.test_package.Access_modifiers;
import main.java.test_package.Subclass_AM;

import javax.print.attribute.standard.PresentationDirection;

public class Main {

    public static void main(String[] args) {

        Access_modifiers myCar = new Access_modifiers(2, "red");  //object myCar
        Subclass_AM bClass = new Subclass_AM(4, "green");  // object bClass

        System.out.println(myCar instanceof Access_modifiers);  // return true
        System.out.println(bClass instanceof Access_modifiers);  // return true because it's subclass
        System.out.println(myCar instanceof Subclass_AM);   // return false

    }


}
