/**
 * my-first-java-program Tell me a little about yourself
 * 
 * @author Brendan McGuire
 * @version August 20, 2019
 */
public class AboutMe {
    public static void main(String[] args) {

        System.out.println("I was born in North Carolina, but grew up in Greenville, SC");
        System.out.println("I am going to college");
        System.out.println("Go Pats!");
        System.out.println("My daughter, Tyler, is a senior at J.L. Mann");
        System.out.println("In my free time, I like to build robots");

        String name = "Brendan";
        int birthYear = 2002;
        int currentYear = 2019;

        int age = currentYear - birthYear;

        System.out.println("currentYear - birthYear");
        System.out.println(currentYear - birthYear);

        System.out.println("My name is " + name + ", and I am " + age + " years old.");

        boolean hadBirthday = true;

        if (!hadBirthday) {
            age--;
        }

        System.out.println("My name is " + name + ", and I am " + age + " years old.");
    }
}