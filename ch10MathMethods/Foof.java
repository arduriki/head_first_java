package ch10MathMethods;

public class Foof {
    // non-static variables
    final int size = 3; // you can't change size
    final int whuffie;

    Foof() {
        whuffie = 42; // can't change whuffie
    }

    void doStuff (final int x) {
        // you can't change x
    }

    void doMore() {
        final int z = 7;
        // you can't change z
    }
}
