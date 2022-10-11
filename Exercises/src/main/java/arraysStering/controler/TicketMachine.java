package arraysStering.controler;

public class TicketMachine {

    public void buyTicket(Passenger passenger, int time){
        Ticket ticket = new Ticket(time);
        passenger.setTicket(ticket);
    }
    public void buyMyTicket(Passenger passenger, Ticket ticket){
        passenger.setTicket(ticket);
    }
}
