package ch02ClassesObjects;

class DogTestDrive {
    public static void main(String[] args) {
        Dog d = new Dog();  // Make an object
        d.size = 40;  // Dot operator to set the size.
        d.bark();  // Dot operator to call a method
    }
}
