package com.trimindtech.training.day2;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        int n;
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
       /* for(int i=0;n<100;i++) {
            System.out.println("value is in between 1 - 100");
        }
*/
       if((n>0) && (n<100)){
           System.out.println("value is in between 1 - 100");
       }
       else{
           System.out.println("not in b/w  range");
       }
    }
}
