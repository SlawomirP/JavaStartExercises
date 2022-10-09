package arraysStering.controler;

import java.time.Duration;
import java.time.LocalDateTime;

public class Ticket {

    private LocalDateTime activationTime;
    private int validityTime;

    public Ticket(int validityTime) {
        this.activationTime = LocalDateTime.now();
        this.validityTime = validityTime;
    }

    public Ticket(LocalDateTime activationTime, int validityTime) {
        this.activationTime = activationTime;
        this.validityTime = validityTime;
    }

    public LocalDateTime getActivationTime() {
        return activationTime;
    }

    public int getValidityTime() {
        return validityTime;
    }

    public boolean isTheTicketValid(){
        return (Duration.between(this.activationTime, LocalDateTime.now()).toMinutes()) < this.validityTime;
    }
}
