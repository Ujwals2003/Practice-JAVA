package tickets;

public class Tickets {
    int ticketsNo;
    String passengerName;
    String destination;
    Train train;

    public Tickets(int ticketsNo, String passengerName, String destination, Train train) {
        this.ticketsNo = ticketsNo;
        this.passengerName = passengerName;
        this.destination = destination;
        this.train = train;
    }

    public void displayTickets() {
        System.out.println("Ticket No: " + ticketsNo);
        System.out.println("Passenger: " + passengerName);
        System.out.println("Destination: " + destination);
        train.displayTrain();
        System.out.println("************************************");
    }
}
