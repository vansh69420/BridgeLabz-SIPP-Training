package Day6_OOPs.LibraryManagement;

public interface Reservable {
    void reserveItem(String borrower);
    boolean checkAvailability();
}