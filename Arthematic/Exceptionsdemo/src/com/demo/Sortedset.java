package com.demo;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    int id;
    String name;
    int age, marks;

    Student(int id, String name, int age, int marks){
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student s) {
        if (age==s.age){
            return 0;
        } else if (age>s.age) {
            return 1;
        }else {
            return -1;
        }

    }
}

public class Sortedset {
    public static void main(String args[]) {
        ArrayList<Student> sr = new ArrayList<Student>();

        //Creating Students Details

        sr.add(new Student(209, "Morris", 21, 908));
        sr.add(new Student(167, "Saksham", 16, 467));
        sr.add(new Student(680, "Rishi", 34, 680));
        sr.add(new Student(218, "Mahitha", 22, 689));

        Collections.sort(sr);
        for (Student s:sr){

            System.out.println(s.id+" "+s.name+" "+s.age+" "+s.marks);

        }


    }



}