package ch03PrimitivesReferences;

class Books {
    String title;
    String author;
}

class BookTestDrive {
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];

        int z = 0;
        while (z < myBooks.length) {
            myBooks[z] = new Books();
            z = z + 1;
        }

        int x = 0;
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";

        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}