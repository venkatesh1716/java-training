package com.trimindtech.training.day04;

public class House {
    public House() {
        this.type = "Apartment";
        this.zone = 'A';
        this.price = 68000;
        this.numberOfBedrooms =3;
        this.freehold = false;
    }

    public House(String type, char zone, double price, int numberOfBedrooms, boolean freehold) {
        this.type = type;
        this.zone = zone;
        this.price = price;
        this.numberOfBedrooms = numberOfBedrooms;
        this.freehold = freehold;
    }

    private String type;
    private char zone;
    private double price;
    private int numberOfBedrooms;
    private  boolean freehold;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public char getZone() {
        return zone;
    }

    public void setZone(char zone) {
        this.zone = zone;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public boolean isFreehold() {
        return freehold;
    }
    public void setFreehold(boolean freehold) {
        this.freehold = freehold;

    }
    @Override
    public String toString() {
        return "House{" +
                "type='" + type + '\'' +
                ", zone=" + zone +
                ", price=" + price +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", freehold=" + freehold +
                '}';
    }


}
