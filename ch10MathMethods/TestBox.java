package ch10MathMethods;

public class TestBox {
    private Integer i; // i can't be null due to Integer class
    private int j;

    public void go() {
        j = i;
        System.out.println(j);
        System.out.println(i);
    }

    public static void main(String[] args) {
        TestBox t = new TestBox();
        t.go();
    }
}
