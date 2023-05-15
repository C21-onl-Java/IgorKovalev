package ru.techmeskills.homework6.task2;

public class Computer {
    private String model;
    private double price;
    private HDD hdd;
    private RAM ram;

    public Computer(String model, double price) {
        this.model = model;
        this.price = price;
    }
    public Computer(String model, double price, HDD hdd, RAM ram) {
        this.model = model;
        this.price = price;
        this.hdd = hdd;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model:'" + model + '\'' +
                ", price:" + price +
                ", HDD:" + hdd +
                ", RAM:" + ram +
                '}';
    }
}
