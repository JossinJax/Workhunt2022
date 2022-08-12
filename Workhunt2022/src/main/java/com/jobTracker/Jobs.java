package com.projects_2022;

import java.util.*;

import static java.lang.System.exit;

public class Jobs {

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

    static int count = 0;
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
        //this.count = count;
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

    public void setRemote(Boolean remote) {
        isRemote = remote;
    }

    //Class methods

    /**
     *
     * @param currentJob
     */
    static void addJob(Jobs currentJob){
        if (currentJob == null) {
            System.out.println("Job is null");
            exit(-1);
        }else if(myJobsMap.containsKey(currentJob.appDate) && myJobsList.contains(currentJob.companyName))
            System.out.println("This job has already been added");
         else{
            myJobsList.add(currentJob.companyName);
            myJobsMap.put(currentJob.appDate, currentJob.myJobsList);
        }
    }

    /**
     *
     */
    void printList(){
        System.out.println(myJobsList);
    }


}
