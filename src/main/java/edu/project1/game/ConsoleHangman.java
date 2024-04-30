package edu.project1.game;

import edu.project1.dictionary.RandomWord;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SuppressWarnings("MultipleStringLiterals")
public class ConsoleHangman {
    private static final Logger LOGGER = LogManager.getLogger("ConsoleHangman");

    public void run() {
        String randomWord = new RandomWord().getRandomWord();
        Session session = new Session(randomWord, randomWord.length());
        Scanner scanner = new Scanner(System.in);
        LOGGER.info("Guess a letter:");
        GuessResult guessResult;
        while (scanner.hasNext()) {
            String input = scanner.nextLine().toLowerCase();
            if (input.equalsIgnoreCase("end")) {
                guessResult = session.giveUp();
                printState(guessResult);
                break;
            }
            guessResult = tryGuess(session, input);
            if (guessResult instanceof GuessResult.Defeat || guessResult instanceof GuessResult.Win) {
                break;
            }
            LOGGER.info("Guess a letter:");
        }
    }

    private GuessResult tryGuess(Session session, String input) {
        GuessResult guessResult = null;
        if (input.length() == 1) {
            guessResult = session.guess(input.charAt(0));
            printState(guessResult);
        }
        return guessResult;
    }

    private void printState(GuessResult guess) {
        if (guess instanceof GuessResult.Defeat && guess.attempt() < guess.maxAttempts()) {
            LOGGER.info("You lost!");
        } else {
            for (String message : guess.message()) {
                LOGGER.info(message);
            }
        }
    }
}
