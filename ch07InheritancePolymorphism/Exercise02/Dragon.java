package ch07InheritancePolymorphism.Exercise02;

class Dragon extends Monster{
    boolean frighten(int degree) {
        System.out.println("breathe fire");
        return true;
    }
}
