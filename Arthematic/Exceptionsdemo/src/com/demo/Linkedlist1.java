package com.demo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist1 {
    public static void main(String[] args) {

        List linkedList = new LinkedList();
        linkedList.add("Morris");
        linkedList.add("Maruthi");
        linkedList.add("Kranthi");
        linkedList.add("Yeswanth");
        linkedList.add("Saksham");

        System.out.println("Size of the Linkedlist: " +linkedList.size());

        Iterator itr = linkedList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());


        }


    }
}