package ru.techmeskills.homework4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < 5; i++) {
            array1[i] = random.nextInt(2);
            array2[i] = random.nextInt(2);
            sum1 += array1[i];
            sum2 += array2[i];
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        if (sum1 > sum2) {
            System.out.println("Cреднее арифмитическое значение первого массива больше второго");
        } else if (sum1 < sum2) {
            System.out.println("Cреднее арифмитическое значение второго массива больше первого");
        }else {
            System.out.println("Cредние арифмитические равны");
        }
    }
}
