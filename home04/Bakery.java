package com.trimindtech.training.home04;

import java.util.Scanner;

public class Bakery {
          private String flavour;
          private  int weight;
          private int quntity;
          private double totalPrice;
          private double unitPrice;
          static {
              System.out.println("MIcky house");
              System.out.println("flavors....");
              System.out.println("1.Chocolate");
              System.out.println("2.Straberry");
              System.out.println("3.BlueBerry");
              System.out.println("4. Cheesy cake");
              System.out.println("5.American choc");

              System.out.println("price per 1kg is 25");
          }

    public Bakery(String flavour, int weight, int quntity) {
        this.flavour = flavour;
        this.weight = weight;
        this.quntity = quntity;
    }

    public Bakery() {
        this.flavour = "Chocolate Moist";
        this.weight = 2;
        this.quntity = 2;
    }

    @Override
    public String toString() {
        return "Bakery{" +
                "flavour='" + flavour + '\'' +
                ", weight=" + weight +
                ", quntity=" + quntity +
                ", totalPrice=" + totalPrice +
                ", unitPrice=" + unitPrice +
                '}';
    }
    public void getCake(){
        System.out.println("choose flavor from 1-5");
        Scanner sc = new Scanner(System.in);
        int fav = sc.nextInt();
        switch (fav){
            case 1:
                System.out.println("Chocoalate Moist");
                break;
            case 2:
                System.out.println(" Staberry");
                break;
            case 3:
                System.out.println(" BlueBerry");
                break;
            case 4:
                System.out.println("cheesy cake ");
                break;
            case 5:
                System.out.println("American Chocolate ");
                break;
        }
        System.out.println("enter the weight of the cake");
        this.weight = sc.nextInt();
        System.out.println("enter the no.of quantity");
        this.quntity = sc.nextInt();
        this.unitPrice = this.weight*25;
        this.totalPrice = this.quntity * this.unitPrice;
    }
}

