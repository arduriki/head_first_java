package ch10MathMethods;

import static java.lang.Math.*;
import static java.lang.System.out;

public class WithStatic {
    // static imports
    // not good for reading
    public static void main(String[] args) {
        out.println("sqrt " + sqrt(2.0));
        out.println("tan " + tan(60));
    }
}
