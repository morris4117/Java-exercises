package com.demo;

public class EmployeeTest {
    public static void main(String args[]) {
        Employee empOne = new Employee("James Smith");
        Employee empTwo = new Employee("Mary Anne");
        Employee empTwo = new Employee("Mary Jones");

        empOne.empAge(26);
        empOne.empDesignation("Senior Software Engineer");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("Software Engineer");
        empTwo.empSalary(500);
        empTwo.printEmployee();

        empTwo.empAge(26);
        empTwo.empDesignation("Software Engineer");
        empTwo.empSalary(5000);
        empTwo.printEmployee();
    }
}
