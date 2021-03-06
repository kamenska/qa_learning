package main.java.test_package;

import java.awt.*;
import java.util.Objects;

/*public modifier: class is visible inside the other class, outside the package, subclass, whole project */
public class Access_modifiers {
    String color; // class variable
    int weight;  // class variable
    private static int countOfObjects;  //class variable - any fields declared with the 'static' modifier
    private String operationType; // instance variable is unique for each instance of a class - in "non-static fields", always "private"

/* default modifier: class is visible inside the class, inside the package */
 class Access_modifiers1 {}

/* protected modifier: variable is visible inside the class, inside the package, in subclass */
    protected String prVar;

/* private modifier: variable is visible only inside the class*/
    private int privVar;

/* method, public (access) - for all classes, void - doesnt return anything; */
    public void getDistance(int speed, int time) {  //speed, time - parameters
        int distance = speed * time;  // distance - local variable, only for this method
        System.out.println(distance);
    }
////////////////////////////////////////////////////////////

    public Access_modifiers (int weight, String color){
        this.weight = weight;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Access_modifiers)) return false;
        Access_modifiers that = (Access_modifiers) o;
        return weight == that.weight &&
                Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, weight);
    }

    @Override
    public String toString() {
        return "Access_modifiers{" + "weight=" + weight + ", color=" + color + "}";
    }
}

