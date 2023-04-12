package ru.techmeskills.homework3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите любое целое число");
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextInt() % 2 == 0) {
            System.out.println("Вы ввели чётное число");
        } else {
            System.out.println("Вы ввели нечётное число");
        }
    }
}
