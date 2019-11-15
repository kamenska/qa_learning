package main.java.HOMEWORKS.Homework12;

import main.java.EnumClassLesson;

public class Main {
    public static void main(String[] args) {

        System.out.println("This season is " + EnumClass.FALL.name());
        System.out.println(EnumClass.WINTER.getClass());

        String nameOfConstant = "SUMMER";
        System.out.println(EnumClass.valueOf(nameOfConstant));

        System.out.println("This season hav average temperature " + EnumClass.WINTER.getAverageTemp(5, -10));

    }
}
