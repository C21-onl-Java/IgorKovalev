package ru.techmeskills.homework10.task2;

public class Task2 {
    public static void findShortEndLongWord(String text) {
        String[] string = text.split(" ");
        int minNumber = Integer.MIN_VALUE;
        int maxNumber = Integer.MAX_VALUE;
        String shortText = "";
        String longText = "";
        for (int i = 0; i <string.length ; i++) {
            if (minNumber <= string[i].length()) {
                longText = string[i];
                minNumber = string[i].length();
            }
            if (maxNumber >= string[i].length()) {
                shortText = string[i];
                maxNumber = string[i].length();
            }
        }
        System.out.printf("Самое длинное слово %s", longText);
        System.out.println();
        System.out.printf("Самое короткое слово %s", shortText);
    }
}
