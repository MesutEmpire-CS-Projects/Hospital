package com.hospital;

public class Date {

    private String admDate;


    private String disDate;

    public String getAdmissionDate() {

        return this.admDate;
    }

    public void setAdmissionDate(String newAdmDate) {
        this.admDate = newAdmDate;
    }

    public String getDischargeDate() {

        return this.disDate;
    }

    public void setDischargeDate(String newDisDate) {
        this.disDate = newDisDate;
    }
}
