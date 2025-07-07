package Day6_OOPs.LibraryManagement;

public class Book extends LibraryItem implements Reservable {
    private boolean available = true;
    public Book(int id, String title, String author) { super(id, title, author); }
    @Override public int getLoanDuration() { return 14; }
    @Override public void reserveItem(String borrower) { available = false; }
    @Override public boolean checkAvailability() { return available; }
}