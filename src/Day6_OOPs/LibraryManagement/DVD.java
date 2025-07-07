package Day6_OOPs.LibraryManagement;

public class DVD extends LibraryItem implements Reservable {
    private boolean available = true;
    public DVD(int id, String title, String author) { super(id, title, author); }
    @Override public int getLoanDuration() { return 3; }
    @Override public void reserveItem(String borrower) { available = false; }
    @Override public boolean checkAvailability() { return available; }
}