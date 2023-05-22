package ru.techmeskills.homework10.task4;

public class Palindrome {
    public static void checkPalindrome(String text, int number) {
        String[] string = text.split(" ");
        if (number > string.length || number <= 0) {
            System.out.println("Ошибка, проверьте введеный номер");
        } else {
            System.out.println(CheckPalindrome.checking(string[number - 1]));
            if (CheckPalindrome.checking(string[number - 1])) {
                System.out.println("Слово " + string[number - 1] + " является палиндромом!");
            } else {
                System.out.println("Слово " + string[number - 1] + " не является палиндромом!");
            }

        }

    }
}


    class CheckPalindrome {
        public static boolean checking(String text) {
            StringBuilder sb1 = new StringBuilder(text);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(sb1);
            sb1.reverse();
            return sb1.toString().equals(sb2.toString());

        }
    }
