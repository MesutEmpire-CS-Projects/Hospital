package com.hospital;

//CLass of com.hospital.Patients
public class Patients {
    //com.hospital.Patients Details
    private String name;
    private int age;
    private String disease;
    private int dateOfAdmission;
    private int dateOfDischarge;

    // Constructor Method
    public void setPatient(String name,int age,String disease){
        this.name = name;
        this.age = age;
        this.disease = disease;
    };

    //Accessor(setters)

    public void setDateOfAdmission(int dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    public void setDateOfDischarge(int dateOfDischarge) {
        this.dateOfDischarge = dateOfDischarge;
    }

    //Modifiers(Getters)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDisease() {
        return disease;
    }

    public int getDateOfAdmission() {
        return dateOfAdmission;
    }

    public int getDateOfDischarge() {
        return dateOfDischarge;
    }
}
