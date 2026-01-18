package com.yetnt;

public class Word {
    private final String afrikaans;
    private final String english;

    public Word(String afrikaans, String english) {
        this.afrikaans = afrikaans;
        this.english = english;
    }

    public String getAfrikaans() {
        return afrikaans;
    }

    public String getEnglish() {
        return english;
    }

    @Override
    public String toString() {
        return "Word{" +
               "afrikaans='" + afrikaans + '\'' +
               ", english='" + english + '\'' +
               '}';
    }

    public String toCsvLine() {
        return afrikaans + "," + english;
    }

}
