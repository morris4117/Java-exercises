package com.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Inputstreambr {
    public static void main(String args[])throws Exception {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        System.out.println("Enter Name: ");
        String name = br.readLine();
        System.out.println("Welcome " +name);
    }
}
