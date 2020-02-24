import java.util.ArrayList;

public class Digits {

    private ArrayList<Integer> digits;

    public Digits(int num) {

        digits = new ArrayList<Integer>();

        do {
            int digit = num % 10;
            digits.add(0, digit);

            num /= 10;
        } while (num > 0);
    }

    public boolean isStrictlyIncreasing() {

        for (int i = 1; i < digits.size(); i++) {
            int digit = digits.get(i);
            int preceeding = digits.get(i - 1);

            if (preceeding >= digit) {
                return false;
            }

        }

        return true;
    }

    public ArrayList<Integer> getDigits() {
        return digits;
    }

}