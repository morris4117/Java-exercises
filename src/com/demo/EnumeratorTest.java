package com.demo;

public class EnumeratorTest {
    public static void main(String args[]) {
        Enumerator enumerator = new Enumerator();
        enumerator.size = Enumerator.EnumeratorSize.MEDIUM ;
        System.out.println("Size: " + enumerator.size);
    }
}
