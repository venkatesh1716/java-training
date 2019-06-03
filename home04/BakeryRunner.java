package com.trimindtech.training.home04;

import java.util.Scanner;

public class BakeryRunner {
    public static void main(String[] args) {
        Bakery bak = new Bakery();
       // bak.getCake();
        /*Bakery bak1 = new Bakery();
        bak1.getCake();*/

        //System.out.println(bak1.toString());
        System.out.println("enter how many times to repeat");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            bak.getCake();
            System.out.println(bak.toString());

        }
            }

    }

