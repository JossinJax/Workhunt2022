package com.jobTracker;

import com.myUtilities.DataValidation;

import java.io.*;
import java.util.Scanner;

import static java.lang.System.exit;



public class AppDriver {

    public static void main(String[] args) throws IOException {

        //local variables

        int choice = 0;
        String todaysDate = DataValidation.getTodaysDate();
                //"08/11/2022";


        System.out.println("Hello and welcome to Work Hunt, 2022 Edition.");

        do {
            try {
                System.out.print("Please choose from the following, \n\n" +
                        "1) Enter a new job application \n" +
                        "2) Update a job application \n" +
                        "3) Exit\n");
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }//end of catch for menu


            choice = DataValidation.getInt();

            switch (choice) {
                case 1:
                    try {
                        boolean jobEntryIsCorrect = false;
                        String temp, temp2;
                        Jobs currentJob = new Jobs();

                        while (!jobEntryIsCorrect) {
                            //user input for job object

                            System.out.print("Did you apply today? (Y/N): ");
                            if (DataValidation.getYes(DataValidation.getString())) {
                                currentJob.setAppDate(todaysDate);
                                currentJob.setStatusDate(todaysDate);
                                currentJob.setStatus(String.valueOf(AppStatus.APPLIED).toLowerCase());
                            } else {
                                System.out.print("Enter the application date in mm/dd/yyyy format: ");
                                currentJob.setAppDate(DataValidation.getDate(DataValidation.getString()));
                                currentJob.setStatusDate(DataValidation.getDate(DataValidation.getString()));
                                currentJob.setStatus(String.valueOf(AppStatus.APPLIED).toLowerCase());
                            }
                            System.out.print("Enter the company name: ");
                            currentJob.setCompanyName(DataValidation.getString());
                            System.out.print("Enter the position title: ");
                            currentJob.setTitle(DataValidation.getString());
                            System.out.print("Enter the salary in \"$xxk\" format (if known): ");
                            currentJob.setSalary(DataValidation.getString());
                            System.out.print("Is it a remote position? (Y/N): ");
                            if (DataValidation.getYes(DataValidation.getString())) {
                                currentJob.setLocation("Remote");
                            } else {
                                System.out.print("Enter the location: ");
                                currentJob.setLocation(DataValidation.getString());
                            }
                            System.out.println(currentJob.toString());
                            System.out.print("\nIs the above job entry correct? (Y/N): ");
                            if(DataValidation.getYes(DataValidation.getString())){
                                Jobs.addJob(currentJob);
                                System.out.println("\nThis Job has been entered.");
                                Jobs.printList();

                            }
                        }//end of while
                        System.out.print("Would you like to enter a new job application?: ");
                        if (DataValidation.getYes(DataValidation.getString()))
                            break;
                        else {
                            System.out.println("\nExiting the program. Have a nice day!");
                            exit(0);
                        }
                    }catch(Exception e){
                        e.printStackTrace(System.out);
                    }

                case 2:
                    try{
                        boolean jobEntryIsCorrect = false;
                        String temp, temp2;
                        Jobs currentJob = new Jobs();

                        while (!jobEntryIsCorrect) {
                            String temp3, temp4;

                            currentJob.toString();// is printint out just a squareBracket
                            System.out.print("Enter the name the company name: ");
                            temp3 = DataValidation.getString();


                            System.out.print("Would you like to enter a new job application?: ");
                            if (DataValidation.getYes(DataValidation.getString()))
                                break;
                            else {
                                System.out.println("\nExiting the program. Have a nice day!");
                                exit(0);
                            }
                        }
                    }catch(Exception e){
                        e.printStackTrace(System.out);
                    }

                    break;

                case 3:
                    System.out.println("\nExiting the program. Have a nice day!");
                    exit(0);

                default:
                    System.out.println("\nPlease enter a valid choice: ");


            }//end of switch
        }while(choice != 3);
    }//end of main fxn


}//end of class
