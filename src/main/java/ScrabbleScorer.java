import java.util.Map;
import java.util.HashMap;

public class ScrabbleScorer {

    Map<Character, Integer> scores = new HashMap<Character, Integer>();
    int finalScore = 0;


    public Integer calculateScore(String input) {
        char[] word = input.toLowerCase().toCharArray();

        Character[] arr1 = {'a', 'e', 'i', 'o', 'u', 'l', 'n', 'r', 's', 't'};
        Character[] arr2 = {'d', 'g'};
        Character[] arr3 = {'b', 'c', 'm', 'p'};
        Character[] arr4 = {'f', 'h', 'v', 'w', 'y'};
        Character[] arr5 = {'k'};
        Character[] arr8 = {'j', 'x'};
        Character[] arr10 = {'q', 'z'};
       // scores.put(arr1, 1);
        for (Character chars : arr1) {
            scores.put(chars, 1);
        }
        for (Character chars : arr2) {
            scores.put(chars, 2);
        }
        for (Character chars: arr3) {
            scores.put(chars, 3);
        }
        for (Character chars : arr4) {
            scores.put(chars, 4);
        }
        for (Character chars: arr5) {
            scores.put(chars, 5);
        }
        for (Character chars : arr8) {
            scores.put(chars, 8);
        }
        for (Character chars : arr10) {
            scores.put(chars, 10);
        }

//        scores.put([''], 1);
        for (Character thing : word) {
            finalScore += scores.get(thing);
        }
        return finalScore;
    }
}
