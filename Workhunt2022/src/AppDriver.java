import java.io.*;
import java.util.*;
import static java.lang.System.exit;

public class AppDriver {

    public static void main(String[] args) throws IOException {

        //local variables

        int choice = 0;
        //Scanner scanner = new Scanner(System.in);



        try {
            System.out.print("Hello and welcome to Work Hunt, 2022 Edition. Please choose from the following, \n\n" +
                    "1) Enter a new job application \n" +
                    "2) Update a job application \n" +
                    "3) Exit\n");
        }catch(Exception e){
            e.printStackTrace(System.out);
        }//end of catch for menu

        try{

            choice = getInt();

            switch (choice) {
                case 1:
                    Jobs currentJob = new Jobs();
                    String temp, temp2;
                    System.out.print("Enter the name the company name: ");
                    temp = getString();
                    System.out.print("Is " + temp + " correct? Enter \"Yes\" or \"No\" .");
                    temp2 = getString();
                    if(temp2.equalsIgnoreCase("Y") || temp2.equalsIgnoreCase("Yes") ||
                            temp2.equalsIgnoreCase("Yeah") || temp2.equalsIgnoreCase("Yea")){
                        currentJob.setCompanyName(getString());

                    }
                    break;

                case 2:
                    String temp3, temp4;
                    System.out.print("Enter the name the company name: ");
                    temp3 = getString();
                    System.out.print("Is " + temp3 + " correct? Enter \"Yes\" or \"No\" .");
                    temp2 = getString();

                case 3:
                    exit(0);




            }//end of switch

        }catch(Exception e){
            e.printStackTrace(System.out);
        }//end catch for switch




    }//end of main fxn

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
//        while(!scanner.hasNext()){
//            System.out.println("Please enter a valid String");
//            scanner.next();
//        }
        return br.readLine();
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}//end of class
