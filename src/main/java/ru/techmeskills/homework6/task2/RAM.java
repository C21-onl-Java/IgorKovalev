package ru.techmeskills.homework6.task2;

public class RAM {
    private String model;
    private int capacity;
    public RAM() {}
    public RAM (String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return
                " model='" + model + '\'' +
                ", capacity=" + capacity + " Gb" +
                '}';
    }
}
