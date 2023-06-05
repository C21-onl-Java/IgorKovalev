package ru.techmeskills.homework9.task1;



import java.util.Random;

public class Vector3D {
    public static final String VECTOR_INFO = "Это вектор для трёхмерной системы координат.";
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double length() {
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2));
    }
    public double scalarProduct(Vector3D vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }
    public Vector3D additionOfVectors(Vector3D vector) {
        return new Vector3D(vector.x + this.x, vector.y +y, vector.z + z);
    }
    public Vector3D subtractionOfVectors(Vector3D vector) {
        return new Vector3D(vector.x - this.x, vector.y - y, vector.z - z);
    }
    public static Vector3D[] generateMassive(int n) {
        Vector3D[] massive = new Vector3D[n];
       Random random = new Random();
        for (int i = 0; i < massive.length; i++) {
            massive[i] = new Vector3D(Math.round(Math.random() * 10),Math.round(Math.random() * 10), random.nextInt(5));

        }
        return massive;
    }
    public void showInfo (Vector3D vector) {
        System.out.println(VECTOR_INFO);
        System.out.println(vector);
    }
    public static void compareVector(Vector3D v1, Vector3D v2) {
        if (v1.length() == v2.length()) {
            System.out.printf("Вектора равны, так как длинна 1-го %.2f, 2-го %.2f", v1.length(), v2.length());

        }else {
            System.out.printf("Вектора не равны, так как длинна 1-го %.2f, 2-го %.2f", v1.length(), v2.length());
        }
        System.out.println();
    }
       @Override
    public String toString() {
          return  "{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
