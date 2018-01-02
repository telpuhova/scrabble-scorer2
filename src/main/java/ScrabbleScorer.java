import java.util.Map;
import java.util.HashMap;

public class ScrabbleScorer {

    Map<Character, Integer> scores = new HashMap<Character, Integer>();
    int finalScore = 0;


    public Integer calculateScore(String input) {
        char[] word = input.toLowerCase().toCharArray();
//        scores.put('a', 1);
//        scores.put('b', 3);
//        scores.put('c', 3);
//        scores.put('d', 2);
//        scores.put('e', 1);
//        scores.put('f', 4);
//        scores.put('g', 2);
//        scores.put('h', 4);
//        scores.put('i', 1);
//        scores.put('j', 8);
//        scores.put('k', 5);
//        scores.put('l', 1);
//        scores.put('m', 3);
//        scores.put('n', 1);
//        scores.put('o', 1);
//        scores.put('p', 3);
//        scores.put('q', 10);
//        scores.put('r', 1);
//        scores.put('s', 1);
//        scores.put('t', 1);
//        scores.put('u', 1);
//        scores.put('v', 4);
//        scores.put('w', 4);
//        scores.put('x', 8);
//        scores.put('y', 4);
//        scores.put('z', 10);
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