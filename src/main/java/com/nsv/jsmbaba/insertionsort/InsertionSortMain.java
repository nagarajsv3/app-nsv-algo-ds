package com.nsv.jsmbaba.insertionsort;

public class InsertionSortMain {

    public static void main(String[] args) {

        int[] numbers = {-20, 10 , 20 , 5 , 15 , 25 , -50};

        //outer for loop to iterate through all elements in unsorted partition
        for(int unsortedPartition = 1; unsortedPartition < numbers.length ; unsortedPartition++){
            int valueToBeInserted = numbers[unsortedPartition];

            //to identify the insertion index
            int insertionIndex;
            for(insertionIndex=unsortedPartition ; insertionIndex > 0 && numbers[insertionIndex - 1] > valueToBeInserted ; insertionIndex--){
                numbers[insertionIndex] = numbers[insertionIndex-1];
            }
            numbers[insertionIndex] = valueToBeInserted;
        }


        System.out.println("******After Insertion Sort*******");
        for (int num: numbers) {
            System.out.println(num);
        }

    }

}
