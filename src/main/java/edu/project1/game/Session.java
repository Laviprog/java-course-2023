package edu.project1.game;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

public class Session {
    private final String answer;
    private final char[] userAnswer;
    private final int maxAttempts;
    private int attempts;

    public Session(String answer, int maxAttempts) {
        this.answer = answer;
        this.userAnswer = new char[answer.length()];
        initUserAnswer();
        this.maxAttempts = maxAttempts;
    }

    private void initUserAnswer() {
        Arrays.fill(userAnswer, '*');
    }

    @NotNull
    public GuessResult guess(char guess) {
        if (contains(answer, guess) && attempts < maxAttempts) {
            addCharInUserAnswer(guess);
            return Arrays.equals(userAnswer, answer.toCharArray())
                    ? new GuessResult.Win(userAnswer, attempts, maxAttempts)
                    : new GuessResult.SuccessfulGuess(userAnswer, attempts, maxAttempts);
        }
        return ++attempts >= maxAttempts
                ? new GuessResult.Defeat(userAnswer, attempts, maxAttempts)
                : new GuessResult.FailedGuess(userAnswer, attempts, maxAttempts);
    }

    @NotNull
    public GuessResult giveUp() {
        return new GuessResult.Defeat(userAnswer, attempts, maxAttempts);
    }

    private boolean contains(String str, char c) {
        return str.indexOf(c) >= 0;
    }

    private void addCharInUserAnswer(char c) {
        for (int i = 0; i < answer.length(); i++) {
            if (answer.charAt(i) == c) {
                userAnswer[i] = c;
            }
        }
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public String getAnswer() {
        return answer;
    }

    public char[] getUserAnswer() {
        return userAnswer;
    }

    public int getMaxAttempts() {
        return maxAttempts;
    }

    public int getAttempts() {
        return attempts;
    }
}
