package ch04MethodsVariables;

class GoodDog {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        if (s > 0) {
            size = s;
        }
    }

    void bark() {
        if (size > 60) {
            System.out.println("Wooof! Wooof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}