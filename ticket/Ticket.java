import java.util.Random;

public abstract class Ticket {

    private int serialNumber;

    static Random serialGenerator = new Random();

    private static int getNextSerialNumber() {
        return serialGenerator.nextInt();
    }

    public Ticket() {
        serialNumber = getNextSerialNumber();
    }

    public abstract double getPrice();
}