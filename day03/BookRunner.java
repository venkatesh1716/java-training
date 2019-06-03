package com.trimindtech.training.day03;
public class BookRunner {

    public static void printBookDetails(Book book) {
        System.out.println(book.author);
        System.out.println(book.cost);
        System.out.println(book.edition);
        System.out.println(book.noOfPages);
        System.out.println(book.publisher);
    }
    public static void main(String[] args) {
        Book java = new Book("java",150,5,540,"falcon");
                printBookDetails(java);
        /*
        Book java =  new Book();
        java.author = "james";
        java.cost = 450;
        java.edition = 4;
        java.noOfPages = 500;
        java.publisher = "Sum micro sys";
        printBookDetails(java);
        System.out.println("\n");*/

        /*System.out.println(java.author);
        System.out.println(java.cost);
        System.out.println(java.edition);
        System.out.println(java.noOfPages);
        System.out.println(java.publisher);*/



        /*Book cpp  =  new  Book();
        cpp.author = "henry";
        cpp.cost = 120;
        cpp.edition = 2;
        cpp.noOfPages = 800;
        cpp.publisher = "sun ms";
        printBookDetails(cpp);
        System.out.println("\n");*/


        /*System.out.println(cpp.author);
        System.out.println(cpp.cost);
        System.out.println(cpp.edition);
        System.out.println(cpp.noOfPages);
        System.out.println(cpp.publisher);*/



        /*Book html =  new Book();
        html.author = "mark";
        html.cost = 630;
        html.edition = 4;
        html.noOfPages = 300;
        html.publisher = "falcon";
        printBookDetails(html);
        System.out.println("\n");*/


        /*System.out.println(html.author);
        System.out.println(html.cost);
        System.out.println(html.edition);
        System.out.println(html.noOfPages);
        System.out.println(html.publisher);*/

        }
    }
