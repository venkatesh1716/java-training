package com.trimindtech.training.day03;

public class ForEachExample {
    static void printNames( String[] arr){
             for(String num:arr){
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
       /* String[] arr = {"hello","world","hai"};
        for(String num:arr) //for each loop
        {
            System.out.println(num);
        }*/
       String[] arr = {"hai","hello"};
        printNames(arr);
    }
}
