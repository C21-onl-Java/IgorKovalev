package ru.techmeskills.homework10.task4;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создайте строку:");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        System.out.println("Вы создали строку: " + text);
        System.out.println("Введите номер слова которое хотите проверить");
        int number = scan.nextInt();
        Palindrome.checkPalindrome(text,number);
    }
}
