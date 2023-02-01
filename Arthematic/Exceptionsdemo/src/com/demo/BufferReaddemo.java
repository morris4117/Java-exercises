package com.demo;

import java.io.*;

public class BufferReaddemo {
    public static void main(String args[])throws Exception {
        InputStreamReader r = new InputStreamReader(System.in);
        FileReader fr = new FileReader("C:\\Programs\\Java\\Arthematic\\Exceptionsdemo\\src\\com\\demo\\testout.txt");
        BufferedReader br = new BufferedReader(fr);
        int i; //Declaring a local variable
        while ((i = fr.read()) != -1) // when it reaches end of line (-1 [End of line])
            System.out.print((char)i);
        fr.close(); //To remove the unused memory.
        br.close();
    }
}
