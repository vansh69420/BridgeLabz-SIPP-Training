package LinkedList.DoublyLinkedList;

public class LibraryDoublyLinkedList {
    static class BookNode {
        String title, author, genre;
        int bookId;
        boolean available;
        BookNode next, prev;
        BookNode(String title, String author, String genre, int bookId, boolean available) {
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.bookId = bookId;
            this.available = available;
        }
    }
    private BookNode head, tail;

    public void addAtBeginning(String title, String author, String genre, int bookId, boolean available) {
        BookNode newNode = new BookNode(title, author, genre, bookId, available);
        newNode.next = head;
        if (head != null) head.prev = newNode;
        head = newNode;
        if (tail == null) tail = newNode;
    }

    public void addAtEnd(String title, String author, String genre, int bookId, boolean available) {
        BookNode newNode = new BookNode(title, author, genre, bookId, available);
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void addAtPosition(int pos, String title, String author, String genre, int bookId, boolean available) {
        if (pos <= 1) {
            addAtBeginning(title, author, genre, bookId, available);
            return;
        }
        BookNode temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) temp = temp.next;
        if (temp == null || temp.next == null) {
            addAtEnd(title, author, genre, bookId, available);
            return;
        }
        BookNode newNode = new BookNode(title, author, genre, bookId, available);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    public void removeByBookId(int bookId) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                if (temp.prev != null) temp.prev.next = temp.next;
                else head = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
                else tail = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }

    public void searchByTitle(String title) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.title.equals(title))
                System.out.println(temp.title + " | " + temp.author + " | " + temp.genre + " | " + temp.bookId + " | " + temp.available);
            temp = temp.next;
        }
    }
    public void searchByAuthor(String author) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.author.equals(author))
                System.out.println(temp.title + " | " + temp.genre + " | " + temp.bookId + " | " + temp.available);
            temp = temp.next;
        }
    }

    public void updateAvailability(int bookId, boolean available) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.available = available;
                return;
            }
            temp = temp.next;
        }
    }

    public void displayForward() {
        BookNode temp = head;
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.author + " | " + temp.genre + " | " + temp.bookId + " | " + temp.available);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        BookNode temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.author + " | " + temp.genre + " | " + temp.bookId + " | " + temp.available);
            temp = temp.prev;
        }
    }

    public void countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total books: " + count);
    }

    public static void main(String[] args) {
        LibraryDoublyLinkedList list = new LibraryDoublyLinkedList();
        list.addAtEnd("Book1", "Author1", "Fiction", 1, true);
        list.addAtBeginning("Book2", "Author2", "Sci-Fi", 2, false);
        list.addAtPosition(2, "Book3", "Author1", "Drama", 3, true);
        list.displayForward();
        System.out.println("Reverse:");
        list.displayReverse();
        list.updateAvailability(2, true);
        list.removeByBookId(3);
        System.out.println("After update and remove:");
        list.displayForward();
        list.countBooks();
        System.out.println("Search by author Author1:");
        list.searchByAuthor("Author1");
    }
}
