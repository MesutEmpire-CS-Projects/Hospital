package com.hospital;

//CLass of com.hospital.Date
public class Date {
    //com.hospital.Date Details
    private String admDate;
    private String disDate;

    //Mutator(Getters)
    public String getDischargeDate() {

        return this.disDate;
    }

    // Constructor Method
    public void setDischargeDate(String newDisDate) {
        this.disDate = newDisDate;
    }

    //Mutator(Getters)
    public String getAdmissionDate() {
        return this.admDate;
    }

    // Constructor Method
    public void setAdmissionDate(String newAdmDate) {
        this.admDate = newAdmDate;
    }

}
