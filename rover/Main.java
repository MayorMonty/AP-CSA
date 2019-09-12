import java.util.Scanner;

/**
 * Controls everything
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("ROVER NAVIGATION SYSTEM");
        System.out.println("PROPERTY OF NASA. NO USE WITHOUT AUTHORIZATION");

        Rover r = new Rover(0, 0, 0, 100, 10, 10, 100);
        Scanner stdin = new Scanner(System.in);

        String in = "";

        while (!in.toUpperCase().equals("Q")) {

            System.out.println("\nVITALS");
            System.out.printf("Health: %d / %d\n", r.health(), r.health());
            System.out.printf("Energy: %d / %d\n", r.energy(), r.maxEnergy());
            System.out.printf("Ammo: %d\n\n", r.ammo());

            Rover.Position location = r.position();
            System.out.println("POSITION");
            System.out.printf("(%f, %f)\n", location.x, location.y);
            System.out.printf("angle = %f\n\n", location.rotation);

            System.out.println("Actions:");
            System.out.println("(M)ove");
            System.out.println("(T)urn");
            System.out.println("(R)epair");
            System.out.println("(C)harge");
            System.out.println("(Q)uit");

            System.out.print("$ ");
            in = stdin.nextLine();
        }
    }

}