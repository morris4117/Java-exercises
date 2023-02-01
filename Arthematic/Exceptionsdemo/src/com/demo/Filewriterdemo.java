package com.demo;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Filewriterdemo {

    public static void main(String args[]){
        try {
            FileWriter fw = new FileWriter("C:\\Programs\\Java\\Arthematic\\Exceptionsdemo\\src\\com\\demo\\testout1.txt");
            fw.write("Welcome to Java Learning with Nexturn Private Limited. ");
            fw.close(); //To remove the unused memory.
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("FileWrite is Successfull....");
    }
}
