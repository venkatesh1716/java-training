package com.trimindtech.training.day2;

import java.util.Scanner;

public class SumOfNatural {
    public static void main(String[] args) {
        int n,i=0,s=0;
        System.out.println("enter the n value");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(i<=n){
            s=s+i;
            i++;
        }
        /*for(int i=0;i<=n;i++){
            s=s+i;
           // System.out.println(sum);
        }*/
        System.out.println(s);
    }
}
