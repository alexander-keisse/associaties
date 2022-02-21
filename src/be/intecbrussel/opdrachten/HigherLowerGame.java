package be.intecbrussel.opdrachten;

import java.util.Random;

public class HigherLowerGame {

    private int value;

    private final int MAX;
    private final Random RANDOM;

    public HigherLowerGame(int max) {
        this.MAX = max;
        RANDOM = new Random();
        reset();
    }

    public void reset() {
        value = RANDOM.nextInt(MAX + 1);
    }

    public int guess(int guessValue) {

        return Integer.compare(guessValue, value);
    }

}
