package ch08InterfacesPolymorphism;

import ch07InheritancePolymorphism.Cat;
import ch07InheritancePolymorphism.Dog;

public class AnimalTestDrive {
    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        Dog dog = new Dog();
        Cat cat = new Cat();
        list.add(dog);
        list.add(cat);
    }
}
