package com.nsv.jsmbaba.stack;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedStack {

    private LinkedList<Employee> stack;

    public LinkedStack(){
        stack = new LinkedList<>();
    }

    public void push(Employee emp){
        stack.push(emp);
    }

    public Employee pop(){
        return stack.pop();
    }

    public Employee peek(){
        return stack.peek();
    }

    public void printStack(){
        Iterator<Employee> iterator = stack.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
