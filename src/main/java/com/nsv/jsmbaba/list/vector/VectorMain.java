package com.nsv.jsmbaba.list.vector;


import java.util.List;
import java.util.Vector;

public class VectorMain {

    public static void main(String[] args) {

        List<Employee> employees = new Vector<>(); //creates backing array of length 10
        employees.add(new Employee("Mahendra","Dhoni",7));
        employees.add(new Employee("Steve","Smith",1));
        employees.add(new Employee("Virat","Kohli",3));
        employees.add(new Employee("Rohit","Sharma",2));

        employees.forEach(employee -> {
            System.out.println(employee.toString());
        });

        System.out.println("*****Print 2nd employee*****");
        System.out.println(employees.get(1)); //Time Complexity O(1) - Constant

        System.out.println("*****is list empty*****");
        System.out.println(employees.isEmpty());

        System.out.println("*****Replace an item at specific position");
        employees.set(1,new Employee("Kane","Williamson",1));  //Time Complexity O(1) - Constant

        employees.forEach(employee -> {
            System.out.println(employee.toString());
        });

        System.out.println("*****Number of items");
        System.out.println(employees.size());

        System.out.println("*****Add an item at specific position");
        employees.add(2,new Employee("KL","Rahul",5)); //Time Complexity O(n) - Linear - Shifting is involved

        employees.forEach(employee -> {
            System.out.println(employee.toString());
        });

        System.out.println("*****Convert list to array");
        Employee[] employeeArray = employees.toArray(new Employee[employees.size()]);
        for (Employee employee: employeeArray) {
            System.out.println(employee);
        }

        System.out.println("*****list contains an employee");
        System.out.println(employees.contains(new Employee("Rohit","Sharma",2)));

        System.out.println("****IndexOf employee");
        System.out.println(employees.indexOf(new Employee("Rohit","Sharma",2)));

        System.out.println("*****Remove item from list");
        employees.remove(3);

        employees.forEach(employee -> {
            System.out.println(employee.toString());
        });

    }

}
