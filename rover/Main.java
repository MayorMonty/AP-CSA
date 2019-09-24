import java.util.Scanner;
import java.util.Random;

/**
 * Controls everything
 */

public class Main {

    private static void pause() {
        Thread.sleep(2000);
    }

    public static void main(String[] args) {

        System.out.println("ROVER NAVIGATION SYSTEM");
        System.out.println("PROPERTY OF NASA. NO USE WITHOUT AUTHORIZATION");

        Rover rover = new Rover(0, 0, 0, 100, 10, 10, 100);
        Scanner stdin = new Scanner(System.in);
        Random random = new Random();

        String in = "";

        while (!in.toUpperCase().equals("Q") && !in.toUpperCase().equals("QUIT")) {

            // Perform actions
            switch (in.toUpperCase()) {

            case "CHARGE":
                System.out.println("CHARGING...");
                int amount = random.nextInt((10 - 1) + 2) + 2;

                rover.charge(amount);
                System.out.printf("%d ENERGY COLLECTED\n", amount);
                break;

            case "REPAIR":
                System.out.println("REPARING...");
                int toRepair = Math.min(rover.maxHealth() - rover.health(), rover.energy());

                rover.repair(toRepair);
                System.out.printf("%d DAMAGE REPAIRED\n", toRepair);

                break;

            }

            // Output stats

            System.out.println("\nVITALS");
            System.out.printf("Health: %d / %d\n", rover.health(), rover.health());
            System.out.printf("Energy: %d / %d\n", rover.energy(), rover.maxEnergy());
            System.out.printf("Ammo: %d\n\n", rover.ammo());

            Rover.Position location = rover.position();
            System.out.println("POSITION");
            System.out.printf("(%f, %f)\n", location.x, location.y);
            System.out.printf("angle = %f\n\n", location.rotation);

            System.out.println("ACTIONS:");

            if (!rover.alive()) {
                System.out.println("ROVER IS DEAD. EMERGENCY PROTOCOL ACTIVATED");
                System.out.println(" CHARGE");
            } else {
                System.out.println(" MOVE");
                System.out.println(" GOTO");
                System.out.println(" TURN");
                System.out.println(" REPAIR");
                System.out.println(" CHARGE");

            }
            System.out.println(" QUIT");

            System.out.print("$ ");
            in = stdin.nextLine();
        }
    }

}