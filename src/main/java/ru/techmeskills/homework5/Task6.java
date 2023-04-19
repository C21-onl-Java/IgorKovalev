package ru.techmeskills.homework5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размерность двумерного массива:");
        int hight = scanner.nextInt();
        int width = scanner.nextInt();
        int[][] array = new int[hight][width];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(5);
            }
        }
        System.out.println(Arrays.deepToString(array));
       /* for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }*/
        for (int[] a: array) {
            Arrays.sort(a);

        }
        System.out.println(Arrays.deepToString(array));
    }
}
