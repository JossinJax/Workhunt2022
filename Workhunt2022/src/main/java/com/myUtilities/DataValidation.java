package com.myUtilities;

import org.w3c.dom.ranges.Range;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class DataValidation {


    static int currentYear = 2022;

    //Pattern
    private static final Pattern datePat = Pattern.compile("^\\d{2}/\\d{2}/\\d{4}$");
    private static final Pattern datePat1 = Pattern.compile("^(0?[1-9]|1[012])/(0?[1-9]|[12][0-9]|3[01])/2022$");


    //class methods

    /**
     *
     * @param dateStr
     * @return
     */
    public static boolean isValidDateFormat(String dateStr) {
        Matcher matcher = datePat1.matcher(dateStr);
        if (matcher.matches()){
            int month = Integer.parseInt(dateStr.substring(0, 2));
            int day = Integer.parseInt(dateStr.substring(3, 5));
            int year = (Integer.parseInt(dateStr.substring(6, 9)));
            if((month > 0 || month <= 12) && (day > 0 || day <= 31) && (year == currentYear)) {
                return (month == 2 && day <= 29) || (month == 4 && day <= 30) || (month == 6 && day <= 30) || (month == 9 && day <= 30) || (month == 11 && day <= 30);
            }
        }
        return false;
    }

    /**
     *
     * @return
     */
    public static String getDate(String testDate) throws IOException {
        if(isValidDateFormat(testDate))
            return testDate;

        System.out.println("The date entered was: " + testDate);
        System.out.println(isValidDateFormat(testDate));

        while(!isValidDateFormat(testDate)){
                System.out.println("Please enter a valid date: ");
                testDate = getDate(getString());
            }
        return "Can't get date";
    }

    /**
     *
     * @return
     */
    public static String getTodaysDate(){
        LocalDate todaysDate = LocalDate.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
//        return todaysDate.format(formatter);

        String formattedDate = todaysDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        return formattedDate;

    }

    /**
     *
     * @return
     * @throws IOException
     */
    public static boolean getYes(String response) throws IOException {
        String temp = response;
        boolean isValid = false;
        while (!isValid) {
            if (response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("Yes") ||
                    response.equalsIgnoreCase("Yeah") || response.equalsIgnoreCase("Yea"))
                return true;
            else if (response.equalsIgnoreCase("N") || response.equalsIgnoreCase("No"))
                isValid = true;
            else {
                System.out.println("Please enter a valid response: ");
                response = getString();
            }
        }
        return false;
    }

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
