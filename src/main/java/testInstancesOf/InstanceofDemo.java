package main.java.testInstancesOf;

public class InstanceofDemo{

    public static void main(String[] args) {
        Parent pObj = new Parent();
        Parent cObj = new Child();

        System.out.println("pObj is Instanceof Parent: " + (pObj instanceof Parent)); //true
        System.out.println("pObj is Instanceof Child: " + (pObj instanceof Child));   //false
        System.out.println("pObj is Instanceof My Interface: " + (pObj instanceof MyInterface));   //false
        System.out.println("cObj is Instanceof Parent: " + (cObj instanceof Parent));   //true
        System.out.println("cObj is Instanceof Child: " + (cObj instanceof Child));  //??????  true
        System.out.println("cObj is Instanceof My Interface: " + (cObj instanceof MyInterface));   // true
    }
}


