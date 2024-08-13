package com.booleanuk;

import java.util.HashMap;

public class Scrabble {
    String word;
    HashMap<String, Integer> points = new HashMap<>();

    public void getValues() {
        // 1 point
        points.put("A", 1); points.put("E", 1); points.put("I", 1);
        points.put("O", 1); points.put("U", 1); points.put("L", 1);
        points.put("N", 1); points.put("R", 1); points.put("S", 1);
        points.put("T", 1);

        // 2 points
        points.put("D", 2); points.put("G", 2);

        // 3 ponts
        points.put("B", 3); points.put("C", 3);
        points.put("M", 3); points.put("P", 3);

        // 4 points
        points.put("F", 4); points.put("H", 4);
        points.put("V", 4); points.put("W", 4);
        points.put("Y", 4);

        // 5 points
        points.put("K", 5);

        // 8 points
        points.put("J", 8); points.put("X", 8);

        // 10 points
        points.put("Q", 10); points.put("Z", 10);

    }

    public Scrabble(String word) {
        this.word = word.toUpperCase();
        getValues();
    }

    public int score() {
        int result = 0;
        if(!word.isEmpty()) {
            for (int i = 0; i < word.length(); i++) {
                if(Character.isWhitespace(word.charAt(i))) {
                    return 0;
                }
                result += points.get(String.valueOf(word.charAt(i)));
            }
        }

        return result;
    }



}