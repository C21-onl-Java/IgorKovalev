package ru.techmeskills.homework10.task1;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

public class StringTest {
    public static final String TEXT = "1554-aBc-3477-dft-1N4M";
    public static final int SECOND_NUMBER = 1;
    public static final int FORTH_NUMBER = 3;


    public static String showTwoDigitalBlock(String text) {
        char[] string = text.toCharArray();
        String textNew = "";
        System.out.println(Arrays.toString(string));
        for (int i = 0; i < TEXT.length(); i++) {
            if (i < 4 || (i >= 9 && i < 13)) {
                textNew += string[i];
            }

        }
        return textNew;
    }

    public static String changeLettersForStars(String text) {
        String[] text1 = text.split("-");
        String newText = text.replace(text1[SECOND_NUMBER], "***");
        newText = newText.replace(text1[FORTH_NUMBER], "***");

        return newText;

    }

    public static String chooseLetters(String text) {
        String[] strings = text.split("-");
        String newText = strings[SECOND_NUMBER].toLowerCase() + "/"
                + strings[FORTH_NUMBER].toLowerCase() + "/"
                + strings[strings.length - 1].substring(1, 2).toLowerCase() + "/"
                + strings[strings.length - 1].substring(3, 4).toLowerCase();
        return newText;

    }

    public static StringBuilder chooseLettersBuilder(String text) {
        StringBuilder stringBuilder = new StringBuilder("Letters:" + chooseLetters(TEXT).toUpperCase());


        return stringBuilder;

    }

    public static StringBuilder chooseLettersBuilder2(String text) {
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                newText += text.charAt(i);
            }

        }
        newText = newText.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(newText);
        stringBuilder.insert(3, "/");
        stringBuilder.insert(stringBuilder.length() - 1, "/");
        stringBuilder.insert(stringBuilder.length() - 3, "/");
        stringBuilder.insert(0, "Letters:");

        return stringBuilder;

    }

    public static void checkSequence(String text, String text2) {

        if(text.toLowerCase().contains(text2.toLowerCase())) {
            System.out.println("Номер документа содержит последовательность: " + text2);
        } else {
            System.out.println("Номер документа не содержит последовательность: " + text2);
        }
    }
    public static Boolean startWith(String text) {

        return text.startsWith("555");
    }

    public static Boolean endsWith(String text) {

        return text.endsWith("1N4M");
    }

    public static void main(String[] args) {
        System.out.println("Название докусмента: " + TEXT);
        System.out.println(showTwoDigitalBlock(TEXT));

        System.out.println(changeLettersForStars(TEXT));

        System.out.println(chooseLetters(TEXT));
        System.out.println(chooseLettersBuilder(TEXT));
        System.out.println(chooseLettersBuilder2(TEXT));
        checkSequence(TEXT, "aBC");
        System.out.println(startWith(TEXT));
        System.out.println(endsWith(TEXT));



    }


}
