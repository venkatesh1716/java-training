package com.trimindtech.training.day04;

public class FriutRunner {


    public static void makeJuice(Fruit fruit)
    {
        if (fruit instanceof Apple){
            ((Apple) fruit).removeSeeds();
        }else{


            }
            fruit.makeJuice();
        }
        public static void main(String[] args) {
        Apple apple = new Apple();
        Fruit orange = new Orange();

        makeJuice(apple);
        makeJuice(orange);



    }
    }
