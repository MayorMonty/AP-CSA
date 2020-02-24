public class DigitsRunner {

    public static void testDigit(int num) {
        System.out.print("\nnew Digit(" + num + ") = ");
        Digits digits = new Digits(num);
        System.out.println(digits.getDigits());

        if (digits.isStrictlyIncreasing()) {
            System.out.println("(Strictly Increasing)");
        } else {
            System.out.println("(Not Strictly Increasing)");
        }
    }

    public static void main(String[] argv) {

        testDigit(3);
        testDigit(21345);
        testDigit(585858867);
        testDigit(0);
        testDigit(27373);

        testDigit(121);

        testDigit(123456789);

        testDigit(34567);

    }

}