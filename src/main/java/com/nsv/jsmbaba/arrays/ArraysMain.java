package com.nsv.jsmbaba.arrays;

public class ArraysMain {

    public static void main(String[] args) {

        int[] numbers=new int[7];

        numbers[0] = 21;
        numbers[1] = -10;
        numbers[2] = 30;
        numbers[3] = -20;
        numbers[4] = 40;
        numbers[5] = 8;
        numbers[6] = 9;

        System.out.println("Time Complexity : Retrieval when we know the index : O(1) : Constant Time Complexity ");

        int searchElemIndex = -1;
        for (int index=0; index < numbers.length ; index++){
            System.out.println(numbers[index]);

            if(numbers[index] == 9){
                searchElemIndex = index;
                break;
            }

        }
        System.out.println("******************");
        System.out.println("searchElemIndex="+searchElemIndex);
        System.out.println("Time Complexity : Retrieval when we dont know the index : O(n) : Linear Time Complexity ");
        System.out.println("Time Complexity : Retrieval when we need to search for an element : O(n) : Linear Time Complexity ");
        System.out.println("Time Complexity : Add an element to the full array : O(n) : Linear Time Complexity ");
        System.out.println("Time Complexity : Add an element to the end of the array : O(1) : Constant Time Complexity ");
        System.out.println("Time Complexity : Insert / Update / Delete an element at an specific index : O(1) : Constant Time Complexity ");
        System.out.println("Time Complexity : Delete an element by shifting elements : O(n) : Linear Time Complexity ");



    }
}
