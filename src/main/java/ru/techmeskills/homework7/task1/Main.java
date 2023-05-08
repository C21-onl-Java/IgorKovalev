package ru.techmeskills.homework7.task1;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setTriangle(3, 4, 5);
        Circle circle = new Circle();
        circle.setRadius(1);
        Rectangle rectangle = new Rectangle();
        rectangle.setRectangle(4, 5);
        Figures[] massive = new Figures[5];
        massive[0] = triangle;
        massive[1] = triangle;
        massive[2] = circle;
        massive[3] = circle;
        massive[4] = rectangle;
        double sum = 0;
        for (Figures figure : massive) {
            sum += figure.getPerimeter();
            System.out.println(figure.getPerimeter());
        }
        System.out.println("Сумма периметра всех фигур: " + sum);
    }
}
