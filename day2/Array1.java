package com.trimindtech.training.day2;

public class Array1 {
    public static void main(String[] args) {
        int sum=0;
        int[] a = {2,3,5,4};
        for(int i=0;i<=a.length-1;i++){
            sum = sum+a[i];
            //System.out.println(sum);
        }
        System.out.println(sum);
    }
}
