package edu.project1.game;

import org.jetbrains.annotations.NotNull;

@SuppressWarnings("MultipleStringLiterals")
public interface GuessResult {
    char[] state();

    int attempt();

    int maxAttempts();

    @NotNull
    String[] message();

    record Defeat(char[] wordChars, int attempts, int maxAttempts) implements GuessResult {
        @Override
        public char[] state() {
            return wordChars;
        }

        @Override
        public int attempt() {
            return attempts;
        }

        @Override
        public int maxAttempts() {
            return maxAttempts;
        }

        @Override
        public @NotNull String[] message() {
            return new String[]{"Missed, mistake " + attempts() + " out of " + maxAttempts() + ".", "The word: "
                    + new String(wordChars), "You lost!"};
        }
    }

    record Win(char[] wordChars, int attempts, int maxAttempts) implements GuessResult {
        @Override
        public char[] state() {
            return wordChars;
        }

        @Override
        public int attempt() {
            return attempts;
        }

        @Override
        public int maxAttempts() {
            return maxAttempts;
        }

        @Override
        public @NotNull String[] message() {
            return new String[]{"Hit!", "The word: " + new String(wordChars), "You won!"};
        }
    }

    record SuccessfulGuess(char[] wordChars, int attempts, int maxAttempts) implements GuessResult {
        @Override
        public char[] state() {
            return wordChars;
        }

        @Override
        public int attempt() {
            return attempts;
        }

        @Override
        public int maxAttempts() {
            return maxAttempts;
        }

        @Override
        public @NotNull String[] message() {
            return new String[]{"Hit!", "The word: " + new String(wordChars)};
        }
    }

    record FailedGuess(char[] wordChars, int attempts, int maxAttempts) implements GuessResult {
        @Override
        public char[] state() {
            return wordChars;
        }

        @Override
        public int attempt() {
            return attempts;
        }

        @Override
        public int maxAttempts() {
            return maxAttempts;
        }

        @Override
        public @NotNull String[] message() {
            return new String[]{"Missed, mistake " + attempts() + " out of " + maxAttempts() + ".", "The word: "
                    + new String(wordChars)};
        }
    }
}
