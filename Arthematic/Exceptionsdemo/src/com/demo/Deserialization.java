package com.demo;
import java.io.*;
public class Deserialization {

    public static void main(String[] args) {
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("C:\\Programs\\Java\\Arthematic\\Exceptionsdemo\\src\\com\\demo\\file.txt"));
            student s = (student)is.readObject();

            System.out.println(s.id+" "+s.name);
            is.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
