package com.nsv.jsmbaba.queue;

import java.util.NoSuchElementException;

public class ArrayQueue {

    private Employee[] queue;

    private int front;

    private int back;

    public ArrayQueue(int capacity) {
        this.queue = new Employee[capacity];
    }

    public void add(Employee employee) {
        if (back == queue.length) {
            //Resize the array
            Employee[] newQueue = new Employee[2 * queue.length];
            System.arraycopy(queue, 0, newQueue, 0, queue.length);
            queue = newQueue;
        }

        queue[back] = employee;
        back++;
    }

    public Employee remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        Employee itemToRemove = queue[front];
        front++;
        queue[front-1] = null;

        if(size()==0){
            front = 0;
            back = 0;
        }
        return itemToRemove;
    }

    public Employee peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    public int size() {
        return back - front;
    }

    public void printQueue(){
        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }


}
