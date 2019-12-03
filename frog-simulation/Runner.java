public class Runner {

    public static void main(String[] args) {

        FrogSimulation frog = new FrogSimulation(20, 10);

        // Single test case
        System.out.println("Single Test Case: ");
        System.out.println(frog.simulate() ? "PASSED" : "FAILED");

        // Many simulations
        System.out.println("Many Simulations: ");
        System.out.println(frog.runSimulations(1000000));

    }
}