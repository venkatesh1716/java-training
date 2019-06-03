package com.trimindtech.training.day04;

public class Imaging {
    private String groupName;
    private  String projectTitle;
    private  int noOfMembers;
    private double feePerMember;

    public Imaging(String groupName, String projectTitle, int noOfMenbers, double feePerMember) {

        this.groupName = groupName;
        this.projectTitle = projectTitle;
        this.noOfMembers = noOfMenbers;
        this.feePerMember = feePerMember;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public int getNoOfMenbers() {
        return noOfMembers;
    }

    public void setNoOfMenbers(int noOfMenbers) {
        this.noOfMembers = noOfMenbers;
    }

    public double getFeePerMember() {
        return feePerMember;
    }

    public void setFeePerMember(double feePerMember) {
        this.feePerMember = feePerMember;
    }

    public Imaging() {
        System.out.println("This is from no-arg constructor");
        this.feePerMember = 20.00;
       this.groupName = "Arvedha";
       this. projectTitle = "AirLine Projet";
        this.noOfMembers = 3;
    }
    public  void calcCollectionPerGroup(){
        double collection = feePerMember +noOfMembers;
        System.out.println("collection is"+collection);

    }

    @Override
    public String toString() {
        return "Imaging{" +
                "groupName='" + groupName + '\'' +
                ", projectTitle='" + projectTitle + '\'' +
                ", noOfMenbers=" + noOfMembers +
                ", feePerMember=" + feePerMember +
                '}';
    }
}
