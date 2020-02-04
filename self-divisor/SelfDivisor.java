import java.util.Arrays;

public class SelfDivisor {

    public static boolean isSelfDivisor(int number) {
        int n = number;
        int lastDigit;

        while (n > 0) {
            lastDigit = n % 10;
            n /= 10;

            if (lastDigit == 0 || number % lastDigit != 0) {
                return false;
            }
        }

        return true;
    }

    public static int[] firstNumSelfDivisors(int start, int num) {

        int[] output = new int[num];
        int matches = 0;

        for (int n = start; matches < num; n++) {

            if (isSelfDivisor(n)) {
                output[matches] = n;
                matches++;
            }

        }

        return output;
    }

    public static void main(String argv[]) {

        // Test if number is self divisor
        System.out.println("Self Divisor (26): " + isSelfDivisor(26));
        System.out.println("Self Divisor (128): " + isSelfDivisor(128));

        System.out.println("First 4 numbers starting at 12: " + Arrays.toString(firstNumSelfDivisors(12, 4)));

    }

}