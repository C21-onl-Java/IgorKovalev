package ru.techmeskills.homework3;


public class Task12 {
    public static void main(String[] args) {
        int numberOfSequence = 11;
        int first = 0;
        int second = 1;
        System.out.println(first);
        System.out.println(second);
        int number3;
        for (int i = 0; i < numberOfSequence - 2; i++) {
            number3 = first + second;
            first = second;
            second = number3;
            System.out.println(number3);

        }
    }
}
