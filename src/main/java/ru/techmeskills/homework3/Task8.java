package ru.techmeskills.homework3;


import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Введите любое целое положительное число");
        Scanner scanner = new Scanner(System.in);
        int number;

        if (scanner.hasNextInt() && (number = scanner.nextInt()) >= 0) {
            int sum = 0;
            for (int i = 1; i < number; i++) {
                sum += i;
            }
            System.out.println(sum);
        } else {
            System.out.println("Ошибка, введите целое положительное число");
        }
    }
}
