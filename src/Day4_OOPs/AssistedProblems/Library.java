package Day4_OOPs.AssistedProblems;

import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> books = new ArrayList<>();

    public Library(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) {
            b.display();
        }
    }
}
