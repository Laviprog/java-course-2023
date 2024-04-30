package edu.project1;

import edu.project1.game.GuessResult;
import edu.project1.game.Session;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class TestProject {
    @ParameterizedTest
    @CsvSource({
            "apple",
            "zzzzz",
            "rot",
            "gdjhgbjhsdgfd"
    })
    void testSessionDefeat(String word) {
        Session session = new Session(word, word.length());
        session.setAttempts(word.length());
        assertInstanceOf(GuessResult.Defeat.class, session.guess('z'));
    }


    @Test
    void testWin() {
        Session session = new Session("app", 3);
        GuessResult guessResult = session.guess('z');
        assertInstanceOf(GuessResult.FailedGuess.class, guessResult);
        assertEquals(1, session.getAttempts());
        assertEquals("***", new String(session.getUserAnswer()));
        guessResult = session.guess('a');
        assertInstanceOf(GuessResult.SuccessfulGuess.class, guessResult);
        assertEquals(1, session.getAttempts());
        assertEquals("a**", new String(session.getUserAnswer()));
        guessResult = session.guess('p');
        assertInstanceOf(GuessResult.Win.class, guessResult);
        assertEquals(1, session.getAttempts());
        assertEquals("app", new String(session.getUserAnswer()));
    }

    @Test
    void testLose() {
        Session session = new Session("app", 3);
        GuessResult guessResult = session.guess('z');
        assertInstanceOf(GuessResult.FailedGuess.class, guessResult);
        assertEquals(1, session.getAttempts());
        assertEquals("***", new String(session.getUserAnswer()));
        guessResult = session.guess('e');
        assertInstanceOf(GuessResult.FailedGuess.class, guessResult);
        assertEquals(2, session.getAttempts());
        assertEquals("***", new String(session.getUserAnswer()));
        guessResult = session.guess('r');
        assertInstanceOf(GuessResult.Defeat.class, guessResult);
        assertEquals(3, session.getAttempts());
        assertEquals("***", new String(session.getUserAnswer()));
    }
}
