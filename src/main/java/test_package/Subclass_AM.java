package main.java.test_package;

public class Subclass_AM extends Access_modifiers {
    public Subclass_AM(int weight, String color) {
        super(weight, color);
    }

    public void test(){
        prVar="dfgdgddf"; /* protected variable inside the package and in subclass*/
    }

}