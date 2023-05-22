package ru.techmeskills.homework10.task3;


public class Task3 {
    public static void findMinRepeatSymbol(String text) {

        String[] string  = text.split(" ");
        String minRepeat = "";


        int temp = string[0].length();


        for (int i = 0; i < string.length; i++) {
            int count = 0;
            String first = String.valueOf(string[i].charAt(0));

            for (int j = 0; j < string[i].length() - 1; j++) {
                String second = String.valueOf(string[i].charAt(j+1));
                if (!first.equals(second)) {
                    count++;
                }
            }

            if (count < temp ) {
                minRepeat = string[i];
                temp = count;
            }

        }
        System.out.println(minRepeat);
    }
}
