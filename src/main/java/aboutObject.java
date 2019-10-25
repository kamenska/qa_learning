package main.java;

import main.java.test_package.Access_modifiers;

public class aboutObject {

    private String color;

// Object.class is a super class inside the project, it's root class in the hierarchy of any program
//class declaration:
    java.lang.Object nameOfObject1; //this declaration the same as: 'Object nameOfObject1'

//class initialising:
public static void main(String[] args) {
    Access_modifiers audi = new Access_modifiers(444, "ddd"); //we create here a new object 'audi' and use a simple constructor without parameters

// all methods of Object class are available for every other classes (because they are children of Object)
//    Object clone();
//    int hashCode();
//    boolean equals(Object obj);
//    void finalize();
//    Class<?> getClass();
//    void notify();
//    void notifyAll();
//    String toString();
//    void wait();
//    void wait(long timeout);
//    void wait(long timeout, int nanos);

    Object obj1 = new Object();
    Object obj2 = new Object();
    Object obj3 = obj1;

    System.out.println(obj1.hashCode());
    System.out.println(obj2.hashCode());
    System.out.println(obj3.hashCode());
    System.out.println(obj1.equals(obj3));

    Access_modifiers mercedes = new Access_modifiers(4000, "red");
    Access_modifiers buggy = new Access_modifiers(400, "red");
//in order to compare to objects we need to overwtire .hashcode method in the class
    System.out.println(mercedes.hashCode());
    System.out.println(buggy.hashCode());
    System.out.println(mercedes.equals(buggy));

    System.out.println(mercedes.getClass());

// in order to use .toString method we need to overwrite it in class
    System.out.println(mercedes.toString());


}


}
