import test_package.Access_modifiers;
import test_package.Subclass_AM;

public class Main {

    public static void main(String[] args) {

        Access_modifiers myCar = new Access_modifiers();  //object myCar
        Subclass_AM bClass = new Subclass_AM();  // object bClass

        System.out.println(myCar instanceof Access_modifiers);  // return true
        System.out.println(bClass instanceof Access_modifiers);  // return true because it's subclass
        System.out.println(myCar instanceof Subclass_AM);   // return false
    }
}
