package com.nsv.jsmbaba.list.singlylinkedlist;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeLinkedList {

    private EmployeeNode head;

    private int size;

    public void addToFront(Employee employee){
        EmployeeNode newHead = new EmployeeNode(employee);
        newHead.setNext(head);
        head = newHead;
        size++;
    }

    public EmployeeNode removeFromFront(){
        EmployeeNode nodeToRemoe = head;
        head = head.getNext();
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



}
