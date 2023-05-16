package ru.techmeskills.homework8.task2;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Ivanov Vladimir");
        patient1.addPlan(2);
        patient1.treat(patient1);
        System.out.println(patient1);

    }
}
