package ru.techmeskills.homework7.task1;

public class Circle extends Figures{
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double getSquare() {
        return 3.14 * radius * radius;
    }
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }
}
