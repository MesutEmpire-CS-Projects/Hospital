package com.hospital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Hospital {
    //Create a New Instance Array that contains HashMap
    static ArrayList<HashMap<String, String>> listOfPatients = new ArrayList<>();

    //ArrayList holding the name of the Patients
    static ArrayList<String> namesPatients = new ArrayList<>();

    //ArrayList holding the name of the Patients Below 1 years
    static ArrayList<String> namesPatientsBelowOneYears = new ArrayList<>();

    //Display Function to show the Patients Present in the List
    public static ArrayList<String> displayPatients() {
        if (namesPatients.size() == 0) {
            for (int i = 0; i < listOfPatients.size(); i++) {
                namesPatients.add(listOfPatients.get(i).get("Name"));
            }
        }
//        else if (namesPatients.size()== listOfPatients.size()) {
//
//        }
        else if (namesPatients.size() < listOfPatients.size()) {

            for (int k = 0; k < listOfPatients.size(); k++) {
                if (k >= namesPatients.size()) {
                    namesPatients.add(listOfPatients.get(k).get("Name"));
                }
            }
        }
        return namesPatients;
    }

    //Display Function to show the Patients Present in the List Below One-year-Old.
    public static ArrayList<String> displayBelowOneYearOldPatients() {
        if (namesPatientsBelowOneYears.size() == 0) {
            for (int i = 0; i < listOfPatients.size(); i++) {
                if (Double.parseDouble(listOfPatients.get(i).get("Age")) <= 1) {
                    namesPatientsBelowOneYears.add(listOfPatients.get(i).get("Name"));
                }

            }

        } else if (namesPatientsBelowOneYears.size() <= listOfPatients.size()) {
            namesPatientsBelowOneYears.clear();
            for (int i = 0; i < listOfPatients.size(); i++) {
                if (Double.parseDouble(listOfPatients.get(i).get("Age")) <= 1) {
                    namesPatientsBelowOneYears.add(listOfPatients.get(i).get("Name"));
                }

            }

        }
        return namesPatientsBelowOneYears;
    }

    //Add Patient Function
    public static void addPatients() {

        Scanner createRecord = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Do you want to create a new patient record ?  (Yes/No) ");

        String response = createRecord.nextLine();  // Read user input
        System.out.println("Response  is: " + response);  // Output user input
        boolean no = Objects.equals(response, "No") || Objects.equals(response, "no") || Objects.equals(response, "NO");
        boolean yes = Objects.equals(response, "Yes") || Objects.equals(response, "yes") || Objects.equals(response, "YES");
        for (; ; ) {
            if (yes) {

                HashMap<String, String> patientInfo = new HashMap<>();

                Patients p1 = new Patients();
                Date patientDateRecords = new Date();
//                    Date dateOfDischarge = new Date();

                Scanner patientsName = new Scanner(System.in);  // Create a Scanner object
                System.out.println("What is the patients name ? ");
                String name = patientsName.nextLine();  // Read user input

                Scanner patientsAge = new Scanner(System.in);  // Create a Scanner object
                System.out.println("What is the patient's age ? ");
                double age = patientsAge.nextDouble();  // Read user input

                Scanner patientsDisease = new Scanner(System.in);  // Create a Scanner object
                System.out.println("What is the patient's disease ? ");
                String disease = patientsDisease.nextLine();  // Read user input


                Scanner dateOfAdm = new Scanner(System.in);  // Create a Scanner object
                System.out.println("What is the patient's Date Of Admission ? (dd/mm/yyyy)");
                String admDate = dateOfAdm.nextLine();  // Read user input


                Scanner dateOfDis = new Scanner(System.in);  // Create a Scanner object
                System.out.println("What is the patient's Date Of Discharge ?  (dd/mm/yyyy)");
                String disDate = dateOfDis.nextLine();  // Read user input


                patientDateRecords.setAdmissionDate(admDate);
                patientDateRecords.setDischargeDate(disDate);

                System.out.println(patientDateRecords.getAdmissionDate()); // here is where the bug is..............
                System.out.println(patientDateRecords.getDischargeDate()); // here is where the bug is..............


                p1.setPatient(name, age, disease, patientDateRecords.getAdmissionDate(), patientDateRecords.getDischargeDate());


                patientInfo.put("Name", p1.getName());
                patientInfo.put("Age", Double.toString(p1.getAge()));
                patientInfo.put("Disease", p1.getDisease());
                patientInfo.put("Date Of Admission", p1.getDateOfAdmission());
                patientInfo.put("Date Of Discharge", p1.getDateOfDischarge());


                listOfPatients.add(patientInfo);


            } else if (no) {
                System.out.println("This is the end");
                //Exit from the loop
                break;
            }
//                //Display the Patients Records
//                System.out.println(displayPatients());


            Scanner continueResponse = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Do you want to continue to create another patient record?  (Yes/No)");

            String continueCreate = continueResponse.nextLine();  // Read user input
            System.out.println("Response  is: " + continueCreate);  // Output user input

            if (Objects.equals(continueCreate, "No") || Objects.equals(continueCreate, "no") || Objects.equals(continueCreate, "NO")) {
//                    //Display the Patients Records
//                    System.out.println(displayPatients());
                //Exit from the loop
                break;

            }
        }

    }

    public static void removePatients() {
        Scanner patientIndex = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the Index Of the name of the patient you want to remove ? ");
        //Display the Patients in the Array
        System.out.println(displayPatients());
        int removePatientIndex = patientIndex.nextInt();  // Read user input

        listOfPatients.remove(removePatientIndex);
        namesPatients.remove(removePatientIndex);

        //Display the Patients in the Array After removal
        System.out.println(displayPatients());


    }


    public static void main(String[] args) {
        for (; ; ) {
            Scanner operation = new Scanner(System.in);  // Create a Scanner object that will ask the user which operation to carry out
            System.out.println("What Operation would you want to carry out ?(Use Integer Value to reply) \n 1. Add New Patient \n 2. Remove Patient \n 3. Display Patients  \n 4. Display Patients Below 1 years old ");
            int operationToDo = operation.nextInt();
            //Check which operation to do.
            if (operationToDo == 1) {
                addPatients();
            } else if (operationToDo == 2) {
                removePatients();
            } else if (operationToDo == 3) {
                System.out.println(displayPatients());
            } else if (operationToDo == 4) {
                System.out.println(displayBelowOneYearOldPatients());
            }
            Scanner nextOperation = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Do you want to continue to  another  Operation?  (Yes/No)");

            String goToNext = nextOperation.nextLine();  // Read user input
            System.out.println("Response  is: " + goToNext);  // Output user input

            if (Objects.equals(goToNext, "No") || Objects.equals(goToNext, "no") || Objects.equals(goToNext, "NO")) {
                //Display the Patients Records
                System.out.println(displayPatients());
                //Exit from the loop
                break;

            }
        }
    }
}