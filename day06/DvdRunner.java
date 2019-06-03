package com.trimindtech.training.day06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.exit;

public class DvdRunner {
    public static void main(String[] args) {
        Dvd dvd1 = new Dvd("iron man", 3.15);
        Dvd dvd2 = new Dvd("Sherk 2", 3.00);
        Dvd dvd3 = new Dvd("Terminator", 4.15);
        Dvd dvd4 = new Dvd("Gladiator", 5.15);
        Map<String, Dvd> dvdMap = new HashMap<>();
        dvdMap.put("ironman", dvd1);
        dvdMap.put("Sherk 2", dvd2);
        dvdMap.put("Terminator", dvd3);
        dvdMap.put("Gladiator", dvd4);
        int i=0;
         Scanner sc = new Scanner(System.in);
        do{

        System.out.println("enter the movie name");
        String movieName = sc.nextLine();
        if (!dvdMap.containsKey(movieName)) {
            System.out.println("movie not available");
            return;
        }
        Dvd dvd = dvdMap.get(movieName);
        System.out.println("a)renting dvd" + "\n");
        System.out.println("b)returning dvd" + "\n");
        System.out.println("c)info of all dvds" + "\n");
        System.out.println("d)exit " + "\n");
        char choice = sc.next().charAt(0);

        switch (choice) {
            case 'a':
                if (dvd.getMovieStatus() == MovieStatus.IN) {
                    System.out.println("renting the dvd" + dvd.toString());
                    dvd.setMovieStatus(MovieStatus.OUT);
                } else {
                    System.out.println("it is not available,already rented");
                }
                break;
            case 'b':
                if (dvd.getMovieStatus() == MovieStatus.IN) {
                    System.out.println("Add to inventory" + dvd.toString());
                }
                break;
            case 'c':
                for (String movieTitle : dvdMap.keySet()) {
                    System.out.println(dvdMap.get(movieTitle.toString()));
                }
                break;
            case 'd':
                exit(0);
        }
            System.out.println("enter 1 to exist");
            System.out.println("enter 0 to continue");
            i = sc.nextInt();
            sc.nextLine();

        }while(i==0);
    }
}
