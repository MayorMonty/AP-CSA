import java.util.ArrayList;

/**
 * Write a description of class WordList here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordList {
    private ArrayList<String> myList;

    public WordList(ArrayList<String> myList) {
        this.myList = myList;
    }

    public int numWordsOfLength(int len) {

        int count = 0;

        for (String word : myList) {
            if (word.length() == len)
                count++;
        }

        return count;
    }

    public void removeWordsOfLength(int len) {

        for (int i = 0; i < myList.size(); i++) {
            String word = myList.get(i);

            if (word.length() == len) {
                myList.remove(i);
                i--;
            }

        }

    }

    public String toString() {
        return myList.toString();
    }
}