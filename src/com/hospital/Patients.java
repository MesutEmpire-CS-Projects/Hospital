package com.hospital;

//CLass of com.hospital.Patients
public class Patients {
    // com.hospital.Patients Details
    private String name;
    private double age;
    private String disease;
    private String dateOfAdmission;
    private String dateOfDischarge;

    // Constructor Method
    public void setPatient(String name, double age, String disease, String dateAdmin, String dateDisc) {
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.dateOfAdmission = dateAdmin;
        this.dateOfDischarge = dateDisc;
    }

    // Mutator(Getters)
    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public String getDisease() {
        return disease;
    }

    public String getDateOfAdmission() {
        return dateOfAdmission;
    }

    public String getDateOfDischarge() {
        return dateOfDischarge;
    }
}
