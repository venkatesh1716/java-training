package com.trimindtech.training.day2;

import java.util.Scanner;

public class Taxes {
    public static double cal_Single(double salary) {

        if (salary <= 6000) {
            salary = (10.0 / 100)*salary;
        } else if (salary > 6001) ;
        {
            salary = (15.0 / 100)*salary;

        }
        return salary;
    }
    public static double cal_Married(double salary){
        //int tax;
        if (salary <= 12000) {
            salary = (10.0 / 100)*salary;

        }
        else if (salary > 12001){
            salary = (15.0 / 100)*salary;
        }
        return salary;
    }
    public static double cal_Married_Seperated(double salary) {
               if (salary <= 6000) {
            salary = (10.0 / 100)*salary;
        } else if (salary > 6001){
            salary = (15.0 / 100)*salary;
        }
        return salary;
    }

        public static double cal_Owner(double salary){
            int tax;
            if (salary <= 10000) {
                salary = (10.0 / 100)*salary;
            } else if (salary > 10001){
                salary = (15.0 / 100)*salary;
            }
            return salary;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the salary");
        int salary = sc.nextInt();
        System.out.println("choose 1 for Single");
        System.out.println("choose 2 for married");
        System.out.println("choose 3 for married but seperated");
        System.out.println("choose 4 for owner of household");
        int fs = sc.nextInt();
        switch (fs){
            case 1:

                System.out.println(cal_Single(salary));
                break;
            case 2:

                System.out.println(cal_Married(salary));
                break;
            case 3:
                System.out.println(cal_Single(salary));
                break;
            case 4:

                System.out.println(cal_Single(salary));
                break;
                   }


            }
}
