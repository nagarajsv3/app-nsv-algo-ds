package com.nsv.jsmbaba.list.javajdklinkedlist;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class JavaJdkLinkedListMain {

    public static void main(String[] args) {

        Employee dhoni = new Employee("Mahendra Singh", "Dhoni", 1);
        Employee rohit = new Employee("Rohit", "Sharma", 2);
        Employee virat = new Employee("Virat", "Kohli", 3);
        Employee kane = new Employee("Kane", "Williamson", 4);

        LinkedList<Employee> list = new LinkedList<>();

        list.addFirst(dhoni);
        list.addFirst(rohit);

        Iterator<Employee> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("****addLast");
        list.addLast(virat);
        iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("****addLast / put");
        list.add(kane);
        iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("****removeFirst / remove");
        list.removeFirst();
        iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("****removeFirst / remove");
        list.remove();
        iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("****removeLast");
        list.removeLast();
        iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
