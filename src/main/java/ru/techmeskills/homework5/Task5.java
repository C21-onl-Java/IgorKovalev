package ru.techmeskills.homework5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите число для двумерного массива");
        int number = scanner.nextInt();
        int[][] array = new int[number][number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                array[i][j] = random.nextInt(10);
            }
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("Диагональ 1 массива:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][i] + " ");
        }
        System.out.println();
        System.out.println("Диагональ 2 массива:");
        for (int i = 0, l = array.length - 1; i < array.length; i++, l--) {
            System.out.print(array[i][l] + " ");

        }

    }
}
