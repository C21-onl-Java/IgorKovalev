package ru.techmeskills.homework7.task2;

public class Main {
    public static void main(String[] args) {
        NameOfJob nameOfJob = new Accountant();

        nameOfJob.printNameOfJob();
        Accountant accountant = new Accountant();
        accountant.printNameOfJob();
        Worker worker = new Worker();
        worker.printNameOfJob();
    }
}
