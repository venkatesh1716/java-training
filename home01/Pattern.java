package com.trimindtech.training.home01;

public class Pattern {
    public static void main(String[] args) {
        /*
        for (int i=1;i<=6;i++)
        {
           // System.out.println(i+"\n");
            for(int j=1;j<=i;j++){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
*/
        for (int i=1;i<=6;i++)
        {
            int num=1;
            // System.out.println(i+"\n");
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println(" ");
        }

    }
}
