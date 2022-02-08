package com.nsv.jsmbaba.bubblesort;

public class BubbleSortMain {

    public static void main(String[] args) {

        int[] numbers = {20, 35 , -15, 7, 55, 1, -22};

        for(int unsortedPartitionLastIndex = numbers.length-1 ; unsortedPartitionLastIndex > 0; unsortedPartitionLastIndex--){

            for(int i=0; i < unsortedPartitionLastIndex ; i++){

                if(numbers[i] > numbers[i+1]){
                    swap(numbers, i, i+1);
                }

            }

        }

        System.out.println("*******After Sort*******");

        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }


    }


    public static void swap(int[] numbers, int i, int j){
        if(i == j){
            return;
        }

        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;

    }


}
