package ru.techmeskills.homework3;

public class Task12 {
    public static void main(String[] args) {
        int numberOfSequence = 11;
        int first = -2;
        int second = -1;
        int number3;
        for (int i = 0; i < numberOfSequence; i++) {
            if(i == 1 || i == 0) {
                System.out.println(i);
                first++;
                second++;
                continue;
            }
            number3 = first + second;
            first = second;
            second = number3;
            System.out.println(number3);

        }
    }
}
