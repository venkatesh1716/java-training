package com.trimindtech.training.day03;

public class Animal {
    public Animal(String color, int livingspan, String name, boolean isCornivor, boolean isWild) {
        this.color = color;
        this.livingspan = livingspan;
        this.name = name;
        this.isCornivor = isCornivor;
        this.isWild = isWild;
    }

    /*public  Animal(String color1,String name1,boolean isWild1,boolean isCornivor1){
             this.color=color1;
             this.name=name1;
             this.isCornivor=isCornivor1;
             this.isWild=isWild1;
        }*/
    private   String color;
    private   int livingspan;
    private   String name;
    private   boolean isCornivor;
    private   boolean isWild;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLivingspan() {
        return livingspan;
    }

    public void setLivingspan(int livingspan) {
        this.livingspan = livingspan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCornivor() {
        return isCornivor;
    }

    public void setCornivor(boolean cornivor) {
        isCornivor = cornivor;
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    /*

    public  void Livingspan(){
        System.out.println("living span");
    }
    public void  isEating(){
        System.out.println("eating");
    }
    public void  isSleaoing(){
        System.out.println("sleeping");
*/

    }


