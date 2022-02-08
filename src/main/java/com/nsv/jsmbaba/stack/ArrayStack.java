package com.nsv.jsmbaba.stack;

import lombok.*;

import java.util.Arrays;
import java.util.EmptyStackException;

@Getter
@Setter
@ToString
public class ArrayStack {

    private Employee[] stack;

    private int top;

    public ArrayStack(){
        stack = new Employee[10];
    }

    public void push(Employee employee){
        if(top == stack.length){
            //resize the array
            Employee[] newStack = new Employee[2 * stack.length];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }

        stack[top++] = employee;

    }

    public Employee pop(){
        if(top == 0){
            throw new EmptyStackException();
        }

        Employee poppedEmployee = stack[--top];
        return poppedEmployee;
    }

    public Employee peek(){
        if(top == 0){
            throw new EmptyStackException();
        }

        Employee peekedEmployee = stack[top - 1];
        return peekedEmployee;
    }

    public int size(){
        return top;
    }

    public void printStack(){
        for (int i = top-1 ; i >=0 ; i--) {
            System.out.println(stack[i].toString());
        }
    }

}
