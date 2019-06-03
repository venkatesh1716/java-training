package com.trimindtech.training.day04;

public class HouseRunner {
    public static void main(String[] args) {
        House h = new House();
        h.setType("Floor");
        h.setZone('V');
        h.setPrice(156);
        h.setFreehold(false);
        h.setNumberOfBedrooms(2);
        System.out.println(h.getType());
        System.out.println(h.getZone());
        System.out.println(h.getPrice());
        System.out.println(h.getNumberOfBedrooms());
        System.out.println(h.toString());
        House[] a = new House[3];
        a[0] = new House("Apartment",'B',5000,6,true);
        a[1] = new House("Apartment1",'C',6000,6,true);
        a[2] = new House("Apartment2",'D',9000,3,true);
        for (House hos:a){
            System.out.println(hos.toString());
        }
    }


    }