package ru.techmeskills.homework7.task1;

public class Circle extends Figures{
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double getSquare() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
