package com.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filereaderdemo {
    public static void main(String args[])throws Exception {
        try {
            FileReader fr = new FileReader("C:\\Programs\\Java\\Arthematic\\Exceptionsdemo\\src\\com\\demo\\testout.txt");
            int i; //Declaring a local variable
            while ((i = fr.read()) != -1) // when it reaches end of line (-1 [End of line])
                System.out.print((char) i);
            fr.close(); //To remove the unused memory.
        } catch (FileNotFoundException fn) {
            fn.getMessage();
        } catch (IOException ie) {
            ie.getMessage();
        }
    }
}



