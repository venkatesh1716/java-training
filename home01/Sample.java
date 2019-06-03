package com.trimindtech.training.home01;

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
            int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        n = sc.nextInt();
        if(n<0){
            System.out.println("-ve number");
        }
            else{
                System.out.println("+ve number");
            }
        }
}
