import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 1/2/18.
 */
public class ScrabbleScorerTest {
    @Test
    public void calculateScore_returnsScoreForSingleLetter_1() throws Exception {
        ScrabbleScorer testScrabble = new ScrabbleScorer();
        Integer expected = 1;
        assertEquals(expected, testScrabble.calculateScore("a"));
    }

    @Test
    public void calculateScore_returnsScoreForMultipleLetters_15() throws Exception {
        ScrabbleScorer testScrabble = new ScrabbleScorer();
        Integer expected = 15;
        assertEquals(expected, testScrabble.calculateScore("zaps"));
    }

    @Test
    public void calculateScore_returnsScoreForUpperCaseLetters_15() throws Exception {
        ScrabbleScorer testScrabble = new ScrabbleScorer();
        Integer expected = 15;
        assertEquals(expected, testScrabble.calculateScore("ZaPs"));
    }
}