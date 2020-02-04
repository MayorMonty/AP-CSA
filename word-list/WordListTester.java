import java.util.ArrayList;


/**
 * Write a description of class WordListTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordListTester
{
    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<String>();
        words.add("cat");
        words.add("mouse");
        words.add("frog");
        words.add("dog");
        words.add("dog");
        
        WordList animals = new WordList(words);
        
        System.out.println(animals);

        System.out.println(animals.numWordsOfLength(4));
        System.out.println(animals.numWordsOfLength(3));
        System.out.println(animals.numWordsOfLength(2));
                
        animals.removeWordsOfLength(4);
        System.out.println(animals);
        
        animals.removeWordsOfLength(3);
        System.out.println(animals);
        
        animals.removeWordsOfLength(2);
        System.out.println(animals);
    }
}