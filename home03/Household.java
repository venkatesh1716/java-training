package com.trimindtech.training.home03;

public class Household {
    public Household()
    {
        int noOccupants;
        int annualIncome;
    }


    public Household(int noOccupant1)
    {
        this.noOccupants = noOccupant1;
        //System.out.println(noOccupants);
    }
    public void houseP(int noOccupants1)
    {
        System.out.println("number of Occupencies after modified");
        System.out.println("noOccupants"+" "+noOccupants1);
    }

    public Household(int noOccupants, int annualIncome) {
        this.noOccupants = noOccupants;
        this.annualIncome = annualIncome;
    }
    public void houseparam(int noOccupants,int annualIncome)
    {
        System.out.println("values after modified");
        System.out.println("numbrer of Occupants"+noOccupants);
        System.out.println("annual Income"+annualIncome);
    }
    public void calAverageIncome(int noOccupants,int annualIncome) {
        int avgIncome = noOccupants * annualIncome;
        System.out.println("average Income"+" "+avgIncome);
    }

    public int noOccupants;
    public int annualIncome;
     public void house(){
         System.out.println("household1");
         noOccupants=1;
         annualIncome=0;
         System.out.println("no of occupencies"+" "+noOccupants);
         System.out.println("Annual Income"+" "+annualIncome);
     }

}
