import java.util.Random;

public class NumberCube {

    Random random;

    public NumberCube() {
        this.random = new Random();
    }

    public int toss() {
        return this.random.nextInt(6) + 1;
    }

    public static int[] getCubeTosses(NumberCube cube, int num) {
        int[] results = new int[num];

        for (int i = 0; i < num; i++) {
            results[i] = cube.toss();
        }

        return results;
    }

    public static int getLongestRun(int[] values) {
        int longest = 0;
        int current = 0;
        int longestIndex = -1;
        int currentIndex = -1;

        for (int i = 0; i < values.length - 1; i++) {

            if (values[i] == values[i + 1]) {
                current++;

                if (i < 1 || values[i - 1] != values[i]) {
                    currentIndex = i;
                }

            } else {
                current = 0;
            }

            if (longest < current) {
                longestIndex = currentIndex;
                longest = current;
            }

        }

        return longestIndex;
    }

}