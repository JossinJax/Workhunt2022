package com.jobTracker;

import java.util.*;

import static java.lang.System.exit;

class Jobs {

    // local data fields
    String title = "";
    String companyName = "";
    String appDate = "";
    String salary = "";
    String location = "";
    String status = "";
    String statusDate = "";
    Boolean rejected = false;
    Boolean isRemote = false;

    private static int count = 0;
    static ArrayList<String> myJobsList = new ArrayList<>();
    static Map<String, ArrayList> myJobsMap = new HashMap<>();

    //Constructor


    public Jobs() {
        this.title = title;
        this.companyName = companyName;
        this.appDate = appDate;
        this.salary = salary;
        this.location = location;
        this.status = status;
        this.statusDate = statusDate;
        this.rejected = rejected;
        this.isRemote = isRemote;
        this.count = count;
    }

    //Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAppDate() {
        return appDate;
    }

    public void setAppDate(String appDate) {
        this.appDate = appDate;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if (location.equalsIgnoreCase("Remote"))
            this.isRemote = true;
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(String statusDate) {
        this.statusDate = statusDate;
    }

    public Boolean getRejected() {
        return rejected;
    }

    public void setRejected(Boolean rejected) {
        this.rejected = rejected;
    }

    public Boolean getRemote() {
        return isRemote;
    }



    //Class methods

    /**
     *
     * @param currentJob
     */
    static public void addJob(Jobs currentJob){
        if (currentJob == null) {
            System.out.println("Job is null");
            exit(-1);
        }else if(myJobsMap.containsKey(currentJob.appDate) && myJobsList.contains(currentJob.companyName))
            System.out.println("This job has already been added");
         else{
            count++;
            String myString = new String();
            myString.valueOf("Job ID: " + count + "; " + currentJob.companyName);
            myJobsList.add(myString);
            myJobsMap.put(currentJob.appDate, currentJob.myJobsList);
        }
    }

    /**
     *
     */
    static void printList(){
        System.out.println(myJobsList);
    }


    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return  "\t\n\nJob ID: " + count + 1 + '\n' +
                "Application date: " + this.appDate + '\n' +
                "Company name: " + this.companyName + '\n' +
                "Position title: " + this.title + '\n' +
                "Annual salary: " + this.salary + '\n' +
                "Job location: " + this.location + '\n' +
                "Status: " + this.status;
    }
}
