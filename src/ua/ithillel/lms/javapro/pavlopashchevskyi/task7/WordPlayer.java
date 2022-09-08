package ua.ithillel.lms.javapro.pavlopashchevskyi.task7;

import java.util.Random;

public class WordPlayer {

    private static final String[] possibleWords = {
            "apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
            "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
            "pineapple", "pumpkin", "potato"
    };

    private String guess;

    public WordPlayer() {
        Random rnd = new Random();
        int wordNumber = rnd.nextInt(possibleWords.length);
        this.guess = possibleWords[wordNumber];
    }

    public String getHint() {
        StringBuilder sb = new StringBuilder();
        sb.append(guess.substring(0, 2));
        for (int i = 0; i < 13; i++) {
            sb.append("#");
        }

        return sb.toString();
    }

    public boolean isWordGuessed(String attemptToGuess) {
        return attemptToGuess.equals(guess);
    }
}