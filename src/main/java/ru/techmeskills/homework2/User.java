package ru.techmeskills.homework2;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        System.out.println("Введите имя пользователя:");
        Scanner scaner = new Scanner(System.in);
        String str = scaner.nextLine();
        System.out.println("Имя пользователя: " + str);
    }
}
