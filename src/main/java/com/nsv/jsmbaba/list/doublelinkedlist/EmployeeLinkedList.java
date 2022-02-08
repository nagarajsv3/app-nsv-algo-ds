package com.nsv.jsmbaba.list.doublelinkedlist;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeLinkedList {

    private EmployeeNode head;

    private EmployeeNode tail;

    private int size;

    public void addToFront(Employee employee){
        EmployeeNode newNode = new EmployeeNode(employee);
        //No Elements in List
        if(head==null){
            tail = newNode;
        }else{
            newNode.setNext(head);
            head.setPrevious(newNode);
        }
        head = newNode;
        size++;
    }



    public EmployeeNode removeFromFront(){
        if (head == null) {
            return null;
        }

        EmployeeNode nodeToRemoe = head;

        if(head == tail){
            head = null;
            tail = null;
        }else{
            head.getNext().setPrevious(nodeToRemoe.getPrevious());
            head = head.getNext();
        }

        nodeToRemoe.setNext(null);
        size--;
        return nodeToRemoe;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public void printList(){
        if(head==null){
            System.out.println("null");
            return;
        }

        EmployeeNode currentNode = head;
        while(currentNode!=null){
            System.out.println(currentNode.toString());
            currentNode = currentNode.getNext();
        }
    }


    public void addToEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        if(tail == null){
            head = node;
        }else{
            node.setPrevious(tail);
            tail.setNext(node);
        }

        tail = node;
        size++;
    }

    public EmployeeNode removeFromEnd() {
        if (head == null) {
            return null;
        }

        EmployeeNode toremove = tail;
        if(head == tail){
            head = null;
            tail = null;
        }else{
            tail.getPrevious().setNext(tail.getNext());
            tail = tail.getPrevious();
        }

        size--;
        return toremove;

    }
}
