package com.demo;

import java.io.*;

//Serializing

public class Serializationdemo {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            student s1 = new student(200, "Morris");
            FileOutputStream fos = new FileOutputStream("C:\\Programs\\Java\\Arthematic\\Exceptionsdemo\\src\\com\\demo\\file.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.flush();
            oos.close();

            System.out.println("Success....");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
