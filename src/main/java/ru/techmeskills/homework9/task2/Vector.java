package ru.techmeskills.homework9.task2;

import java.util.Arrays;

public class Vector {

    private double[] valuesOfCoordinate;
    public static final String VECTOR_INFO = "Это вектор для системы координат.";
    public Vector(double[] valuesOfCoordinate) {
        this.valuesOfCoordinate = valuesOfCoordinate;
    }
    public double lengthOfVector() {
        double sum = 0;
        for (int i = 0; i < valuesOfCoordinate.length; i++) {
            sum += valuesOfCoordinate[i] * valuesOfCoordinate[i];
        }
        return Math.sqrt(sum);
    }
    public double scalarProduct(Vector vector) {
        double multiple = 0;
        for (int i = 0; i < vector.valuesOfCoordinate.length; i++) {
            multiple += valuesOfCoordinate[i] * vector.valuesOfCoordinate[i];

        }
        return multiple;
    }
    public Vector add(Vector vector) {
        double[] another = new double[valuesOfCoordinate.length];

        for (int i = 0; i < valuesOfCoordinate.length; i++) {
            another[i] = valuesOfCoordinate[i] + vector.valuesOfCoordinate[i];
        }
        return new Vector(another);
    }

    public Vector subtract(Vector vector) {
        double[] another = new double[valuesOfCoordinate.length];

        for (int i = 0; i < valuesOfCoordinate.length; i++) {
            another[i] = valuesOfCoordinate[i] - vector.valuesOfCoordinate[i];
        }
        return new Vector(another);
    }

    public static Vector[] generate(int n, int dimension) {
        double[] values = new double[dimension];
        for (int i = 0; i < dimension; i++) {
            values[i] = Math.random();
        }
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector(values);
        }
        return vectors;

    }

    public static void showInfo (Vector[] vectors ) {
        for (Vector v: vectors) {
            System.out.println(v);

        }

    }

    @Override
    public String toString() {
        return "Vector{" +
                "valuesOfCoordinate=" + Arrays.toString(valuesOfCoordinate) +
                '}';
    }
}
