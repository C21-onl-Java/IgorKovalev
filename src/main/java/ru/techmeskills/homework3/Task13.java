package ru.techmeskills.homework3;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        System.out.println("Введите сумму вклада:");
        Scanner scaner = new Scanner(System.in);
        float sum = scaner.nextFloat();
        System.out.println("Введите количество месяцев:");
        int month = scaner.nextInt();
        //float endSum = 0;
        //int persentage = 7;

        for (int i = 0; i < month; i++) {
            //endSum = sum + sum * persentage / 100;
            //sum = endSum;
            sum += sum * 0.07f;
        }

        System.out.println(sum);
    }
}
