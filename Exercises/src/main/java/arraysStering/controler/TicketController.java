package arraysStering.controler;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TicketController {
    public static void main(String[] args) {

        TicketMachine ticketMachine = new TicketMachine();
        LocalDateTime testTime = LocalDateTime.now().minusMinutes(30);
        Ticket invalidTicket = new Ticket(testTime, 5);

        List<Passenger> passengers = new ArrayList<>();

        passengers.add(new Passenger("Pete", "Reves"));
        passengers.add(new Passenger("Jan", "Mall"));
        passengers.add(new Passenger("Stef", "Prie"));
        passengers.add(new Passenger("Julie", "Mua"));

        ticketMachine.buyTicket(passengers.get(0), 15);
        ticketMachine.buyTicket(passengers.get(2), 15);
        ticketMachine.buyMyTicket(passengers.get(1), invalidTicket);
        ticketMachine.buyMyTicket(passengers.get(3), invalidTicket);

        System.out.println(passengersWithInvalidTicket(passengers));


    }

    private static List<Passenger> passengersWithInvalidTicket(List<Passenger> passengers){
        return passengers.stream()
                .filter(passenger -> !passenger.getTicket().isTheTicketValid())
                .collect(Collectors.toList());
    }

}
