package com.trimindtech.training.home03;

import java.util.Scanner;

public class Planet {
    private String pName;
    private int travelDays;

   /* public Planet()  //no-agr constructor
    {
        this.pName = "Earth";
        this.travelDays = 365;
    }*/

    public Planet(String pName, int travelDays) {
        this.pName = pName;
        this.travelDays = travelDays;
    }

   /* {
        System.out.println("enter the planet name");
        Scanner sc = new Scanner(System.in);
        this.pName = sc.nextLine();
        System.out.println("enter the travel days");
        //Scanner sc = new Scanner(System. in);
        this.travelDays = sc.nextInt();
    }*/

    public void printPlanet()
    {
        System.out.println("Name of the planet is"+" "+pName);
        System.out.println("No.Of Travel days"+" "+travelDays);

    }
    public void calculateAge(int age)
    {
        double result = (age*365)/travelDays;
        System.out.println("age is "+" "+result);

    }
}
