public class Test {
    public static void main(String[] args) {
        // for loop -> when you know how many loops
        for (int i = 0; i < 8; i++) {
            System.out.println(i);
        }
        System.out.println("done");
        System.out.println();

        // while loop -> when you don't know how many loops
        int i = 0;
        while (i < 8) {
            System.out.println(i);
            i++;
        }
        System.out.println("done");
        System.out.println();

        // loop an array
        String[] nameArray = {"Fred", "Mary", "Bob"};
        for (String name : nameArray) {
            System.out.println(name);
        }
    }
}
