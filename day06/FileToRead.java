package com.trimindtech.training.day06;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileToRead {


        public static void main(String[] args) {
            try {
                File file = new File("D:\\djfile.txt");

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
            BufferedWriter bw = null;
            try {
                String mycontent = "After file is created.This is the data in the file";

                String mycontent1 = "\n"+"After append";

                //Specify the file name and path here
                File file = new File("D:/djfile.txt");


                if (!file.exists()) {
                    file.createNewFile();
                }

                FileWriter fw = new FileWriter(file);
                bw = new BufferedWriter(fw);
                bw.write(mycontent);
                bw.append("\n"+mycontent1);
                System.out.println("File written Successfully");

            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
            finally
            {
                try{
                    if(bw!=null)
                        bw.close();
                }catch(Exception ex){
                    System.out.println("Error in closing the BufferedWriter"+ex);
                }
            }
        }
    }
