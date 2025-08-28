package Problem2;

public class Passenger {
    protected String name;
    protected String passportNumber;

    public Passenger(String name, String passportNumber) {
        this.name = name;
        this.passportNumber = passportNumber;
    }

    public void printPassengerInfo() {
        System.out.println("Passenger Name: " + name);
        System.out.println("Passport Number: " + passportNumber);
    }
}
