package ru.techmeskills.homework10.task3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создайте строку:");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        System.out.println(text);
        Task3.findMinRepeatSymbol(text);
    }
}