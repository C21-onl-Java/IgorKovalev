package ru.techmeskills.homework9.task1;

public class MainVector3D {

        public static void main(String[] args) {
            //System.out.println(Arrays.toString(Vector3D.generateMassive(5)));
            Vector3D[] massive = Vector3D.generateMassive(4);

            for (int i = 0; i < massive.length; i++) {
                massive[i].showInfo(massive[i]);
            }
            System.out.println("//////"); // Вывод через foreach
            for (Vector3D vector3D: massive) {
                vector3D.showInfo(vector3D);
            }
            Vector3D vector = new Vector3D(4, 9,6);
            Vector3D vector2 = new Vector3D(3, 9,8);
            Vector3D.compareVector(vector,vector2);
            Vector3D.compareVector(massive[1], massive[0]);


        }
    }



