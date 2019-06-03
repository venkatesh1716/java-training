package com.trimindtech.training.day06;
import java.io.File;
import java.io.IOException;

public class Streams
{

    public static void main(String args[])throws Exception{

        /*

        program to read the data from the file
        FileReader fr=new FileReader("D:\\testout.txt");
        BufferedReader br=new BufferedReader(fr);

        int i;
        while((i=br.read())!=-1){
            System.out.print((char)i);
        }
        br.close();
        fr.close();*/


        //Reading data from console by InputStreamReader and BufferedReader
/*
                InputStreamReader r=new InputStreamReader(System.in);
                BufferedReader br=new BufferedReader(r);
                System.out.println("Enter your name");
                String name=br.readLine();
                System.out.println("Welcome "+name);

public class CreateFileDemo
{
   public static void main( String[] args )
   {
      try {
	     File file = new File("C:\\newfile.txt");
	     /*If file gets created then the createNewFile()
	      * method would return true or if the file is
	      * already present it would return false
	      */

                try {
                    File file = new File("D:\\newfile.txt");
                    /*If file gets created then the createNewFile()
                     * method would return true or if the file is
                     * already present it would return false
                     */
                    boolean fvar = file.createNewFile();
                    if (fvar){
                        System.out.println("File has been created successfully");
                    }
                    else{
                        System.out.println("File already present at the specified location");
                    }
                } catch (IOException e) {
                    System.out.println("Exception Occurred:");
                    e.printStackTrace();
                }
            }
        }



