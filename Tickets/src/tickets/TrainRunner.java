package tickets;

public class TrainRunner {
    public static void main(String[] args) {
        Train t1 = new Train("Chikkamagaluru Express", 12548);
        Train t2 = new Train("Shatabdi Express", 157842);

        Tickets[] ticketsList = new Tickets[3];
        ticketsList[0] = new Tickets(101, "Ujwal", "Bengaluru", t1);
        ticketsList[1] = new Tickets(102, "Amaan", "Mysuru", t2);
        ticketsList[2] = new Tickets(103, "Siri", "Hubli", t1);


        for (Tickets t : ticketsList) {
            t.displayTickets();
        }
    }
}
