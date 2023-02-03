package com.demo;

import java.util.*;

public class Revlinkedlist {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.add("Morris");
        linkedList.add("Maruthi");
        linkedList.add("Kranthi");
        linkedList.add("Yeswanth");
        linkedList.add("Saksham");

       System.out.println("Size of the Linkedlist: " +linkedList.size());

        Iterator itr = linkedList.descendingIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());

        }


    }
}
