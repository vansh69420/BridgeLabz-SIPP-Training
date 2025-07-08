package LinkedList.DoublyLinkedList;


public class MovieDoublyLinkedList {
    static class Node {
        String title, director;
        int year;
        double rating;
        Node next, prev;
        Node(String title, String director, int year, double rating) {
            this.title = title;
            this.director = director;
            this.year = year;
            this.rating = rating;
        }
    }
    private Node head, tail;

    // Add at beginning
    public void addAtBeginning(String title, String director, int year, double rating) {
        Node newNode = new Node(title, director, year, rating);
        newNode.next = head;
        if (head != null) head.prev = newNode;
        head = newNode;
        if (tail == null) tail = newNode;
    }

    // Add at end
    public void addAtEnd(String title, String director, int year, double rating) {
        Node newNode = new Node(title, director, year, rating);
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Add at position (1-based)
    public void addAtPosition(int pos, String title, String director, int year, double rating) {
        if (pos <= 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }
        Node temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) temp = temp.next;
        if (temp == null || temp.next == null) {
            addAtEnd(title, director, year, rating);
            return;
        }
        Node newNode = new Node(title, director, year, rating);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // Remove by title
    public void removeByTitle(String title) {
        Node temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                if (temp.prev != null) temp.prev.next = temp.next;
                else head = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
                else tail = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }

    // Search by director or rating
    public void searchByDirector(String director) {
        Node temp = head;
        while (temp != null) {
            if (temp.director.equals(director)) {
                System.out.println(temp.title + " (" + temp.year + "), Rating: " + temp.rating);
            }
            temp = temp.next;
        }
    }
    public void searchByRating(double rating) {
        Node temp = head;
        while (temp != null) {
            if (temp.rating == rating) {
                System.out.println(temp.title + " (" + temp.year + "), Director: " + temp.director);
            }
            temp = temp.next;
        }
    }

    // Update rating by title
    public void updateRating(String title, double newRating) {
        Node temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
    }

    // Display forward
    public void displayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.director + " | " + temp.year + " | " + temp.rating);
            temp = temp.next;
        }
    }

    // Display reverse
    public void displayReverse() {
        Node temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.director + " | " + temp.year + " | " + temp.rating);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        MovieDoublyLinkedList list = new MovieDoublyLinkedList();
        list.addAtEnd("Inception", "Nolan", 2010, 8.8);
        list.addAtBeginning("Interstellar", "Nolan", 2014, 8.6);
        list.addAtPosition(2, "Avatar", "Cameron", 2009, 7.8);
        list.displayForward();
        System.out.println("Reverse:");
        list.displayReverse();
        list.updateRating("Avatar", 8.0);
        list.removeByTitle("Inception");
        System.out.println("After update and remove:");
        list.displayForward();
        System.out.println("Search by director Nolan:");
        list.searchByDirector("Nolan");
    }
}