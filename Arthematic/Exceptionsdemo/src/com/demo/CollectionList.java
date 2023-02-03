package com.demo;

import java.util.*;
public class CollectionList {

    public static void main(String[] args) {
        try {
            List ArrayList = new ArrayList<String>();
            ArrayList.add("Kranthi");
            ArrayList.add("Anthi");
            ArrayList.add("Yeswantha");
            ArrayList.add("Aniljat");
            ArrayList.add("Morris");

        Iterator itr = ArrayList.iterator();
        while (itr.hasNext()){

        }
            System.out.println(ArrayList);
            System.out.println(ArrayList.size());
            System.out.println(ArrayList.isEmpty());
            List secondArrayList = new ArrayList<>();
            secondArrayList.addAll(ArrayList);
            System.out.println();
            secondArrayList.add("newItem");

            System.out.println("contains the arraylist" +secondArrayList);
            System.out.println("contains the arraylist" +secondArrayList.contains(ArrayList));


            ArrayList.clear();

            System.out.println("ArrayList Clear Successfully" +ArrayList.size());


            //Creating Terminoary operator to see xyz is threr in the list
            System.out.println((ArrayList.contains("xyz")) ? "True" : "False");
            ArrayList.remove("xyz");
            //getting arraylist through index
            System.out.println(ArrayList.get(0));
        }catch (IndexOutOfBoundsException ie){
            System.out.println("Index out of bound" +ie.getMessage());
        }
        System.out.println("Exception Sccessful...");
    }
}
