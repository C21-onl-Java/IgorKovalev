package ru.techmeskills.homework5;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] arrayOne = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] arrayTwo = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int[][] arrayThree = new int[3][3];
        for (int i = 0; i < arrayOne.length; i++) {
            for (int l = 0; l < arrayThree.length; l++) {
                int number = 0;
                for (int j = 0; j < arrayTwo.length; j++) {
                    number += arrayOne[i][j] * arrayTwo[j][l];
                }
                arrayThree[i][l] = number;
            }
        }
        System.out.println(Arrays.deepToString(arrayThree));
    }

}


