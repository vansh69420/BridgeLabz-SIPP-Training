package LinkedList.CircularLinkedList;

public class TicketReservationCircularList {
    static class TicketNode {
        int ticketId;
        String customerName, movieName, seatNumber, bookingTime;
        TicketNode next;
        TicketNode(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
            this.ticketId = ticketId;
            this.customerName = customerName;
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.bookingTime = bookingTime;
        }
    }
    private TicketNode head = null;

    public void addAtEnd(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        TicketNode newNode = new TicketNode(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        TicketNode temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = newNode;
        newNode.next = head;
    }

    public void removeByTicketId(int ticketId) {
        if (head == null) return;
        if (head.ticketId == ticketId) {
            if (head.next == head) {
                head = null;
                return;
            }
            TicketNode temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = head.next;
            head = head.next;
            return;
        }
        TicketNode temp = head;
        while (temp.next != head && temp.next.ticketId != ticketId) temp = temp.next;
        if (temp.next.ticketId == ticketId) temp.next = temp.next.next;
    }

    public void displayAll() {
        if (head == null) return;
        TicketNode temp = head;
        do {
            System.out.println(temp.ticketId + " | " + temp.customerName + " | " + temp.movieName + " | " + temp.seatNumber + " | " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchByCustomer(String customerName) {
        if (head == null) return;
        TicketNode temp = head;
        do {
            if (temp.customerName.equals(customerName))
                System.out.println(temp.ticketId + " | " + temp.movieName + " | " + temp.seatNumber + " | " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }
    public void searchByMovie(String movieName) {
        if (head == null) return;
        TicketNode temp = head;
        do {
            if (temp.movieName.equals(movieName))
                System.out.println(temp.ticketId + " | " + temp.customerName + " | " + temp.seatNumber + " | " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    public void countTickets() {
        if (head == null) {
            System.out.println("Total tickets: 0");
            return;
        }
        int count = 0;
        TicketNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        System.out.println("Total tickets: " + count);
    }

    public static void main(String[] args) {
        TicketReservationCircularList list = new TicketReservationCircularList();
        list.addAtEnd(1, "Alice", "Movie1", "A1", "10:00");
        list.addAtEnd(2, "Bob", "Movie2", "B2", "11:00");
        list.displayAll();
        list.removeByTicketId(1);
        System.out.println("After remove:");
        list.displayAll();
        list.countTickets();
        System.out.println("Search by customer Bob:");
        list.searchByCustomer("Bob");
    }
}
