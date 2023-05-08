package ru.techmeskills.homework7.task1;

public class Rectangle extends Figures{
    private int a;
    private int b;

    public void setRectangle (int a, int b) {
        this.a = a;
        this.b = b;
    }
    public double getSquare() {
        return a * b;
    }
    public double getPerimeter() {
        return (a + b) * 2;
    }
}
