package com.demo;

public class add {

    public int ad(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int div(int a, int b){
        return a/b;
    }
    public int mul(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        add a = new add();
        System.out.println("Addition "+a.ad(5,10));
        System.out.println("Subtraction "+a.sub(15,10));
        System.out.println("Division "+a.sub(5,10));
        System.out.println("Multiplication "+a.mul(5,10));
    }
}

