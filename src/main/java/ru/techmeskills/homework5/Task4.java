package ru.techmeskills.homework5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int[][] array;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размерность двумерного массива:");
        int hight = scanner.nextInt();
        int width = scanner.nextInt();
        array = new int[hight][width];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(5);
                sum += array[i][j];
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println("Сумма всех чисел массива: " + sum);
    }
}
