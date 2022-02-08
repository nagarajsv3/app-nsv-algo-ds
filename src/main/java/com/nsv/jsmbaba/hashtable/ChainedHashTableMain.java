package com.nsv.jsmbaba.hashtable;

public class ChainedHashTableMain {

    public static void main(String[] args) {

        Employee dhoni = new Employee("Mahendra Singh", "Dhoni", 1);
        Employee rohit = new Employee("Rohit", "Sharma", 2);
        Employee virat = new Employee("Virat", "Kohli", 3);
        Employee kane = new Employee("Kane", "Williamson", 4);

        ChainedHashTable hashTable = new ChainedHashTable();

        hashTable.put(dhoni.getLastName(), dhoni);
        hashTable.put(rohit.getLastName(), rohit);
        hashTable.put(virat.getLastName(), virat);
        hashTable.put(kane.getLastName(), kane);

        hashTable.print();

        System.out.println("*****************");

        System.out.println("Retrieve using key : "+hashTable.get(virat.getLastName()));

        hashTable.remove(virat.getLastName());

        hashTable.print();




    }
}
