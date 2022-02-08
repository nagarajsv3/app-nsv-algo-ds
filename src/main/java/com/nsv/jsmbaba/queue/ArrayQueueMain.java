package com.nsv.jsmbaba.queue;

public class ArrayQueueMain {

    public static void main(String[] args) {

        Employee dhoni = new Employee("Mahendra Singh", "Dhoni", 1);
        Employee rohit = new Employee("Rohit", "Sharma", 2);
        Employee virat = new Employee("Virat", "Kohli", 3);
        Employee kane = new Employee("Kane", "Williamson", 4);

        ArrayQueue arrayQueue = new ArrayQueue(5);
        arrayQueue.add(dhoni);
        arrayQueue.add(rohit);
        arrayQueue.add(virat);
        arrayQueue.add(kane);

        arrayQueue.printQueue();

        System.out.println("*****Remove");
        arrayQueue.remove();
        arrayQueue.remove();

        arrayQueue.printQueue();

        System.out.println("****peek");
        System.out.println(arrayQueue.peek());

        arrayQueue.printQueue();
        System.out.println("****remove remove");
        arrayQueue.remove();
        //arrayQueue.remove();

        arrayQueue.printQueue();

        System.out.println("*****put 1 item");
        arrayQueue.add(dhoni);
        arrayQueue.printQueue();

        arrayQueue.add(virat);
        arrayQueue.printQueue();

        arrayQueue.add(rohit);
        arrayQueue.printQueue();

        arrayQueue.add(rohit);
        arrayQueue.printQueue();

        arrayQueue.add(rohit);
        arrayQueue.printQueue();
    }
}
