package com.nsv.jsmbaba.javajdkhashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {

    public static void main(String[] args) {

        Employee dhoni = new Employee("Mahendra Singh", "Dhoni", 1);
        Employee rohit = new Employee("Rohit", "Sharma", 2);
        Employee virat = new Employee("Virat", "Kohli", 3);
        Employee kane = new Employee("Kane", "Williamson", 4);

        Map<String, Employee> map = new HashMap<>();
        map.put(dhoni.getLastName(), dhoni);
        map.put(rohit.getLastName(), rohit);

        map.putIfAbsent(dhoni.getLastName(), virat);
        map.put(virat.getLastName(), virat);

        System.out.println("Print all map entries");

        map.forEach((key, value) -> {
            System.out.print("key "+key+" ;");
            System.out.println("value "+value);
        });

        System.out.println("Retrieve using key="+map.get(dhoni.getLastName()));

        System.out.println("Remove using key="+map.remove(dhoni.getLastName()));

        System.out.println("****After Remove");
        map.forEach((key, value) -> {
            System.out.print("key "+key+" ;");
            System.out.println("value "+value);
        });

        System.out.println("Iterate using for loop");

        for (Map.Entry<String, Employee> entry: map.entrySet()) {
            System.out.println(entry.getKey()+"    "+entry.getValue());
        }

        
        
        
    }
}
