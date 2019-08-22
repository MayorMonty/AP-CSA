/**
 * This program sings the song "Ants Go Marching." lyrics:
 * http://kids.niehs.nih.gov/lyrics/antsgo.htm
 *
 * @author you
 * @version today
 */

public class AntsGoMarching {
	/**
	 * Sings the first two lines.
	 *
	 * @param number (as a word) for how the ants march
	 */
	public static void goMarching(String number) {
		System.out.println("The ants go marching " + number + " by " + number + ", hurrah, hurrah");
	}

	/**
	 * Sings the third line.
	 *
	 * @param number (as a word) for how the ants march
	 */
	public static void noHurrah(String number) {
		System.out.println("The ants go marching " + number + " by " + number + ",");
	}

	/**
	 * Sings the 4th line about the little ant.
	 *
	 * @param action What the little one stops to do
	 */
	public static void littleAnt(String action) {
		System.out.println("The little one stops to " + action);
	}

	/**
	 * Sings the last two lines of each verse.
	 */
	public static void rain() {
		System.out.println("And they all go marching down to the ground");
		System.out.println("To get out of the rain, BOOM! BOOM! BOOM!");
	}

	/**
	 * Sings a verse of Ants Go Marching.
	 * 
	 * @param number Number (as a word) for how the ants march
	 * @param action What the little one stops to do
	 */
	public static void singIt(String n, String action) {
		goMarching(n);
		goMarching(n);
		noHurrah(n);
		littleAnt(action);
		rain();
	}

	/**
	 * Calls the singIt() for each verse.
	 */
	public static void main(String[] args) {
		System.out.println("Ants Go Marching\n");

		String[] numbers = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String[] actions = { "suck his thumb", "tie his shoe", "climb a tree", "shut the door", "take a dive",
				"pick up sticks", "pray to heaven", "shut the gate", "check the time", "say \"THE END\"" };

		for (int i = 0; i < 9; i++) {
			singIt(numbers[i], actions[i]);
			System.out.println();
		}
	}

}
