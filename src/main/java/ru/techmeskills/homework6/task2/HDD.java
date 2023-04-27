package ru.techmeskills.homework6.task2;

public class HDD {
    private String model;
    private int capacity;
    private String type;
    public HDD() {}
    public HDD (String model, int capacity, String type) {
        this.model = model;
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return
                " model='" + model + '\'' +
                ", capacity=" + capacity + "Gb"+
                ", type='" + type + '\'' +
                '}';
    }
}
