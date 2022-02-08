package com.nsv.jsmbaba.stack;

public class ArrayStackMain {

    public static void main(String[] args) {

        Employee dhoni = new Employee("Mahendra Singh", "Dhoni", 1);
        Employee rohit = new Employee("Rohit", "Sharma", 2);
        Employee virat = new Employee("Virat", "Kohli", 3);
        Employee kane = new Employee("Kane", "Williamson", 4);

        ArrayStack stack = new ArrayStack();

        stack.push(dhoni);
        stack.push(rohit);
        stack.push(virat);


        stack.printStack();

        System.out.println("****After peek");
        System.out.println("Peek"+stack.peek());
        stack.printStack();

        System.out.println("****After pop");
        System.out.println("Popped Value"+stack.pop());
        System.out.println(stack.size());
        stack.printStack();



    }
}
