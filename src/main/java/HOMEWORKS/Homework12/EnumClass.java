package main.java.HOMEWORKS.Homework12;

public enum EnumClass {
    WINTER("winter", 5, -30),
    SPRING("spring", 15, 0),
    SUMMER("summer", 40, 13),
    FALL("fall", 20, -3);

    String name;
    double tMax, tMin;

    EnumClass(String name, int tMax, int tMin) {
        this.name = name;
        this.tMax = tMax;
        this.tMin = tMin;
    }

    public double getAverageTemp(double max, double min) {
        double tAverage = Math.round((max + min) / 2);
        return tAverage;
    }
}
