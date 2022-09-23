package oop.paymentCalculator;

public class PaymentCalculator {

    private static final double ZUS_PAYMENT = 100;

    public static double nettoYearPayment(Emplyee emplyee){
        double netYearPayment = emplyee.getSalary() * 12;
        return netYearPayment;
    }
    public static double bruttoYearPayment(Emplyee emplyee){
        double grossYearPayment = 12 * (emplyee.getSalary() + ZUS_PAYMENT + (emplyee.getSalary()/5));
        return grossYearPayment;
    }
}
