package com.nsv.jsmbaba.hashtable;

public class SimpleHashTableMain {

    public static void main(String[] args) {

        Employee dhoni = new Employee("Mahendra Singh", "Dhoni", 1);
        Employee rohit = new Employee("Rohit", "Sharma", 2);
        Employee virat = new Employee("Virat", "Kohli", 3);
        Employee kane = new Employee("Kane", "Williamson", 4);

        SimpleHashTable hashTable = new SimpleHashTable();

        hashTable.put(dhoni.getLastName(), dhoni);
        hashTable.put(rohit.getLastName(), rohit);
        hashTable.put(virat.getLastName(), virat);
        hashTable.put(kane.getLastName(), kane);

        hashTable.print();

        System.out.println("***********");
        System.out.println(hashTable.get(dhoni.getLastName()));
        System.out.println(hashTable.get(rohit.getLastName()));
        System.out.println(hashTable.get(virat.getLastName()));
        System.out.println(hashTable.get(kane.getLastName()));

        System.out.println("*****remove******");
hashTable.remove(virat.getLastName());
hashTable.remove(dhoni.getLastName());

hashTable.print();

    }
}

