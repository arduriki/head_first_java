package ch10MathMethods;

import ch10MathMethods.Duck;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck d1 = new Duck();
        Duck d2 = new Duck();
        Duck d3 = new Duck();
        Duck d4 = new Duck();
        Duck d5 = new Duck();
        

        System.out.println(d1.getDuckCount());
        System.out.println(d2.getDuckCount());
        System.out.println(d3.getDuckCount());
        System.out.println(d4.getDuckCount());
        System.out.println(d5.getDuckCount());
    }
}
