package ru.techmeskills.homework10.task5;

import java.util.Scanner;

public class Task5 {
    public static int timesOfRepeat;
    public static String doubleChar(String text) {
        char[] sequense = text.toCharArray();
        String newString = "";

        for (int i = 0; i < sequense.length; i++) {
            timesOfRepeat = 2;
            while (timesOfRepeat > 0) {
                newString += String.valueOf(sequense[i]);
                timesOfRepeat--;
            }
        }
        return newString;
    }

    public static void main(String[] args) {
        System.out.println("Создайте строку:");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        System.out.println("Вы создали строку: " + text);
        System.out.println(doubleChar(text));
    }
}
