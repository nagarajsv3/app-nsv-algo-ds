package com.nsv.jsmbaba.list.doublelinkedlist;


public class DoublyLinkedListMain {

    public static void main(String[] args) {

        Employee dhoni = new Employee("Mahendra Singh", "Dhoni", 1);
        Employee rohit = new Employee("Rohit", "Sharma", 2);
        Employee virat = new Employee("Virat", "Kohli", 3);
        Employee kane = new Employee("Kane", "Williamson", 4);

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.getSize());
        System.out.println(list.isEmpty());
        list.printList();

        list.addToFront(dhoni);
        list.addToFront(rohit);
        list.addToFront(virat);


        System.out.println(list.getSize());
        System.out.println(list.isEmpty());

        list.printList();

        System.out.println("*****AddToEnd*****");
        list.addToEnd(kane);

        System.out.println(list.getSize());
        System.out.println(list.isEmpty());

        list.printList();

        System.out.println("******RemoveFromFront******");
        list.removeFromFront();

        System.out.println(list.getSize());
        System.out.println(list.isEmpty());

        list.printList();
        System.out.println("******RemoveFromEnd******");
        list.removeFromEnd();

        System.out.println(list.getSize());
        System.out.println(list.isEmpty());

        list.printList();
    }

}
