package ch09LifeDeathObject;

public class Duck extends Animal {
    int size;
    
    public Duck(int duckSize) {
        // Superclass constructor (must be the first element)
        super();
        // Constructor
        System.out.println("Quack");
        // Use argument to set the size of the instance variable.
        size = duckSize;

        System.out.println("size is " + size);
    }

    public void setSize(int newSize) {
        // Setter method
        size = newSize;
    }
}
