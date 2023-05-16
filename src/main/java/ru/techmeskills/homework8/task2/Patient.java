package ru.techmeskills.homework8.task2;

public class Patient {
    private int numberOfPlan = 0;
    private String name;
    private Doctor doctor;


    public Patient(String name) {
        // this.numberOfPlan = numberOfPlan;
        this.name = name;
    }

    public void setNumberOfPlan(int numberOfPlan) {
        this.numberOfPlan = numberOfPlan;
    }

    public int getNumberOfPlan() {
        return numberOfPlan;
    }

    public void treat(Patient patient) {
        //Doctor doctor = null;
        switch (patient.getNumberOfPlan()) {
            case 1:
                doctor = new Surgeon();
                break;
            case 2:
                doctor = new Dentist();
                break;
            case 3:
                doctor = new Therapist();
                break;
            default:
                System.out.println("План лечения не задан");

        }
        if (doctor != null) {
            doctor.treat();
            showPatientInfo();
        }


    }

    public void addPlan(int numberOfPlan) {
        if (numberOfPlan < 0 || numberOfPlan > 3) {
            System.out.println("Такого плана лечения не существует");
        }
        else{
            setNumberOfPlan(numberOfPlan);
        }
    }


    public void showPatientInfo() {

        System.out.println("Patient{" +
                "numberOfPlan=" + numberOfPlan +
                ", name='" + name + '\'' +
                '}'+"\n" + "Ваш доктор " + doctor.getClass().getSimpleName());



    }
}
