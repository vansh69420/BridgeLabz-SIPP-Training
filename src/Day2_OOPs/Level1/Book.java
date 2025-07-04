package Day2_OOPs.Level1;

public class Book {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        this.available = true;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    public boolean borrow() {
        if (available) {
            available = false;
            return true;
        }
        return false;
    }
}