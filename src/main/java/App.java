import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;

public class App{
    public static void main(String[] args){
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a word: ");
            String scrabbleWord = bufferedReader.readLine();
            ScrabbleScorer myScrabble = new ScrabbleScorer();
            System.out.println(myScrabble.calculateScore(scrabbleWord));
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}