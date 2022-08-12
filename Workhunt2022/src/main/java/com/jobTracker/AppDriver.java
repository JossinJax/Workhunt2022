package com.projects_2022;

import java.io.*;
import java.sql.SQLOutput;
import java.util.regex.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import static java.lang.System.exit;
import java.util.regex.Pattern;
import DateVa;o

public class AppDriver {

    public static void main(String[] args) throws IOException {

        //local variables

        int choice = 0;
        //Scanner scanner = new Scanner(System.in);
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

            try {

                choice = getInt();


                switch (choice) {
                    case 1:
                        Jobs currentJob = new Jobs();
                        String temp, temp2;
                        do {
                            System.out.print("Enter the company name: ");
                            currentJob.setCompanyName(getString());
                            System.out.print("Enter the position title: ");
                            currentJob.setCompanyName(getString());
                            System.out.println("Enter the application date in mm/dd/yyyy format");


                            temp = getString();
                            //                    System.out.print("Is " + temp + " correct? Enter \"Yes\" or \"No\" .");
                            //                    temp2 = getString();
                            if (temp.equalsIgnoreCase("Y") || temp.equalsIgnoreCase("Yes") ||
                                    temp.equalsIgnoreCase("Yeah") || temp.equalsIgnoreCase("Yea")) {
                                currentJob.setCompanyName(getString());
                            }
                        } while (temp.equalsIgnoreCase("No"));
                        break;

                    case 2:
                        String temp3, temp4;
                        System.out.print("Enter the name the company name: ");
                        temp3 = getString();
                        System.out.print("Is " + temp3 + " correct? Enter \"Yes\" or \"No\" .");
                        temp2 = getString();

                    case 3:
                        exit(0);

                    default:
                        System.out.println("\nPlease enter a valid choice: ");


                }//end of switch
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }//end catch for switch

        }while(choice != 3);
    }//end of main fxn

        /**
         *
         * @return
         * @throws IOException
         */
        public static String getString () throws IOException {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                return br.readLine();
            }

        /**
         *
         * @return
         */
        public static String getInput () {
                Scanner scanner = new Scanner(System.in);
                String myString = "";
                while (!scanner.hasNext()) {
                    System.out.println("Please enter a valid String");
                    scanner.next();
                }
                return scanner.nextLine();
            }

        /**
         *
         * @return
         * @throws IOException
         */
        public static int getInt () throws IOException {
                String s = getString();
                return Integer.parseInt(s);
            }
    }//end of class
