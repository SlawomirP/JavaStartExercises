package oop.paymentCalculator;

public class PaymentCalculator {

    public double nettoYearPayment(Emplyee emplyee){
        double netYearPayment = emplyee.getSalary() * 12;
        return netYearPayment;
    }
    public double bruttoYearPayment(Emplyee emplyee){
        double grossYearPayment = 12 * (emplyee.getSalary() + 1000 + (emplyee.getSalary()/5));
        return grossYearPayment;
    }
}
