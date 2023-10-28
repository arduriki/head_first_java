package ch10MathMethods;

public class Duck {
    private int size;
    private static int duckCount = 0;
    
    public Duck() {
        // Everytime an object is created, duckCount increments.
        duckCount++;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getDuckCount() {
        return duckCount;
    }
}
