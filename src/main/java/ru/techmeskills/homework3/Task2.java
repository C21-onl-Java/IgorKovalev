package ru.techmeskills.homework3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер месяца от 1 до 12");
        int numberOfMonth = scan.nextInt();

        if(numberOfMonth == 12 || numberOfMonth == 1 || numberOfMonth == 2) {
            System.out.println("Пора года: \"Зима\"");
        } else if (numberOfMonth > 2 && numberOfMonth <= 5) {
            System.out.println("Пора года: \"Весна\"");
        } else if (numberOfMonth > 5 && numberOfMonth <= 8) {
            System.out.println("Пора года: \"Лето\"");
        } else if (numberOfMonth > 8 && numberOfMonth < 12) {
            System.out.println("Пора года: \"Осень\"");
        }else {
            System.out.println("Проверьте введенное значение номера месяца от 1 до 12");
        }
    }
}
