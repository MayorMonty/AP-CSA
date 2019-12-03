import java.util.Arrays;

public class Runner {

    public static void main(String arg[]) {

        NumberCube cube = new NumberCube();

        int tosses[] = NumberCube.getCubeTosses(cube, 20);

        // Print tosses
        System.out.println(Arrays.toString(tosses));

        // Analyze
        int longestRun = NumberCube.getLongestRun(tosses);

        System.out.println(longestRun);

    }

}