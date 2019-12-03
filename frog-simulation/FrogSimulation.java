import java.util.Random;

public class FrogSimulation {

    private int goalDistance;
    private int maxHops;

    private Random generator = new Random();

    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance() {
        // Allows from negative numbers
        return generator.nextInt(20) - 10;
    }

    public boolean simulate() {
        int hops = 0;
        int position = 0;
        boolean reached = false;

        while (hops < maxHops && position >= 0 && !reached) {
            hops++;
            position += hopDistance();
            reached = position >= goalDistance;
        }

        return reached;
    }

    public double runSimulations(int count) {
        int reached = 0;

        for (int i = 0; i < count; i++) {
            reached += simulate() ? 1 : 0;
        }

        return (double) reached / count;
    }

}