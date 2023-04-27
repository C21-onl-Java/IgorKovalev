package ru.techmeskills.homework6.task2;

public class MainComputer {
    public static void main(String[] args) {
        Computer computer1 = new Computer("HP", 250.5);
        System.out.println(computer1);
        Computer computer2 = new Computer("Asus", 750, new HDD("Toshiba",500, "Внешний" ),
                new RAM("Kingston",8));
        System.out.println(computer2);
    }
}
