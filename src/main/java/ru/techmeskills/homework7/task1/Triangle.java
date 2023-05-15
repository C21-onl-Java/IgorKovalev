package ru.techmeskills.homework7.task1;

public class Triangle extends Figures{
    private int a;
    private int b;
    private int c;

    public void setTriangle(int a, int b, int c) {
        if (a + b > c && b + c  > a && a + c  >b) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        else {
            System.out.println("ОШИБКА! Такого треугольника не существует");
        }
    }

    public double getSquare() {
        double halfOfPerimeter = getPerimeter() / 2;
        double square = Math.sqrt(halfOfPerimeter * (halfOfPerimeter - a)  * (halfOfPerimeter - b) *
                (halfOfPerimeter - c));
        return square;
    }
    public double getPerimeter() {
        return a + b + c;
    }

}
