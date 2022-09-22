package oop.paymentCalculator;

public class Emplyee {

    private String firstName;
    private String lastName;
    private double salary;

    public Emplyee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }
}
