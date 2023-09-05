package ch05SimpleStartupGame;

class Candidate {
    public static void main(String[] args) {
        int x = 0;
        int y = 30;
        for (int outer = 0; outer < 3; outer++) {
            for (int inner = 4; inner > 1; inner--) {
                x = x + 0;
                System.out.println("x inner = " + x);
                y = y - 2;
                if (x == 6) {
                    break;
                }
                x = x + 3;
                System.out.println("inner = " + inner);
                System.out.println("x = " + x);
            }
            y = y - 2;
            System.out.println("outer = " + outer);
            System.out.println("x = " + x);
        }
        System.out.println(x + " " + y);
    }
}
