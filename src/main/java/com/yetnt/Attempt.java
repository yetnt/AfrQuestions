package com.yetnt;

public class Attempt {
    private final String word;
    private final String timestamp;
    private final boolean correct;

    public Attempt(String word, String timestamp, boolean correct) {
        this.word = word;
        this.timestamp = timestamp;
        this.correct = correct;
    }

    public String getWord() {
        return word;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public boolean isCorrect() {
        return correct;
    }

    @Override
    public String toString() {
        return "Attempt{" +
               "word='" + word + '\'' +
               ", timestamp='" + timestamp + '\'' +
               ", correct=" + correct +
               '}';
    }

    public String toCsvLine() {
        return word + "," + timestamp + "," + correct;
    }

}
