package Day3_OOPs;

public class Book {
    private static String libraryName = "City Library";
    private final String isbn;
    private String title;
    private String author;

    public Book(String title, String author, String isbn) {
        this.title = this.title = title;
        this.author = this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    public void displayDetails() {
        if (this instanceof Book) {
            System.out.println("ISBN: " + isbn);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        }
    }
}
