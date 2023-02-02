package com.demo;

import java.util.*;
public class CollectionList {

    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<String>();
        list.add("Kranthi");
        list.add("Anthi");
        list.add("Yeswantha");
        list.add("Aniljat");
        list.add("Morris");

        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
