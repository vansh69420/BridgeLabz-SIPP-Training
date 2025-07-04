package Day1_OOPs.Level2;

public class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;
    private boolean booked;

    public MovieTicket() {
        this.booked = false;
    }

    public void bookTicket(String movieName, int seatNumber, double price) {
        if (!booked) {
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.price = price;
            this.booked = true;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Ticket already booked.");
        }
    }

    public void displayTicket() {
        if (booked) {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: " + price);
        } else {
            System.out.println("No ticket booked.");
        }
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.bookTicket("Inception", 12, 250.0);
        ticket.displayTicket();
    }
}
