package com.hospital;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Hospital {
    static ArrayList<String> listOfPatients = new ArrayList<>();

    public static ArrayList<String> displayPatients() {
        return listOfPatients;
    }

    public static ArrayList<String> displayBelowOneYearOldPatients() {
        return listOfPatients;
    }

    public static void addPatients() {

        Scanner createRecord = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Do you want to create a new patient record ?  (Yes/No) ");

        String response = createRecord.nextLine();  // Read user input
        System.out.println("Response  is: " + response);  // Output user input
        boolean no = Objects.equals(response, "No") || Objects.equals(response, "no") || Objects.equals(response, "NO");
        boolean yes = Objects.equals(response, "Yes") || Objects.equals(response, "yes") || Objects.equals(response, "YES");
        for (; ; ) {
            if (yes) {

                Patients p1 = new Patients();
                Scanner patientsName = new Scanner(System.in);  // Create a Scanner object
                System.out.println("What is the patients name ? ");
                String name = patientsName.nextLine();  // Read user input

                Scanner patientsAge = new Scanner(System.in);  // Create a Scanner object
                System.out.println("What is the patient's age ? ");
                int age = patientsAge.nextInt();  // Read user input

                Scanner patientsDisease = new Scanner(System.in);  // Create a Scanner object
                System.out.println("What is the patient's disease ? ");
                String disease = patientsDisease.nextLine();  // Read user input

                p1.setPatient(name, age, disease);
                listOfPatients.add(p1.getName());


            } else if (no) {
                System.out.println("This is the end");
                //Exit from the loop
                break;
            }
            //Display the Patients Records
            System.out.println(displayPatients());


            Scanner continueResponse = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Do you want to continue to create another patient record?  (Yes/No)");

            String continueCreate = continueResponse.nextLine();  // Read user input
            System.out.println("Response  is: " + continueCreate);  // Output user input

            if (Objects.equals(continueCreate, "No") || Objects.equals(continueCreate, "no") || Objects.equals(continueCreate, "NO")) {
                //Display the Patients Records
                System.out.println(displayPatients());
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

        //Display the Patients in the Array After removal
        System.out.println(displayPatients());


    }

    public static void main(String[] args) {
        for (; ; ) {
            Scanner operation = new Scanner(System.in);  // Create a Scanner object that will ask the user which operation to carry out
            System.out.println("What Operation would you want to carry out ?(Use Integer Value to reply) \n 1. Add New Patient \n 2. Delete Patient \n 3. Display Patients  \n 4. Display Patients Below 1 years old ");
            int operationToDo = operation.nextInt();
            //Check which operation to do.
            if (operationToDo == 1) {
                addPatients();
            } else if (operationToDo == 2) {
                removePatients();
            } else if (operationToDo == 3) {
                System.out.println(displayPatients());
            }
            else if (operationToDo == 4) {
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

