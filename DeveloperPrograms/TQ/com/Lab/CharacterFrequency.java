package com.Lab;
public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "Rushikeshjadhav";
        int[] frequency = new int[256];  

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++;
        }

        System.out.println("Character frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println((char) i + ": " + frequency[i]);
            }
        }
    }
}

