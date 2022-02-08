package com.nsv.jsmbaba.insertionsort;

public class InsertionSortAscMain {

    public static void main(String[] args) {

        int[] numbers = {20, 35, -15, 7, 55, 1, -22};

        //for each element in the unsorted partition
        for(int unsortedPartitionIndex = 1 ; unsortedPartitionIndex < numbers.length ; unsortedPartitionIndex++){

            System.out.println(numbers[unsortedPartitionIndex]);

            int itemToInsert = numbers[unsortedPartitionIndex];

            int insertionIndex;

            //for each element in the sorted partition starting highest value compare newElement with each value and get insertionIndex
            /*for(int sortedPatitionLastIndex = unsortedPartitionIndex-1 ; sortedPatitionLastIndex>=0; sortedPatitionLastIndex--){

                if(itemToInsert > numbers[sortedPatitionLastIndex]){
                    insertionIndex = sortedPatitionLastIndex+1;
                    break;
                }else{
                    numbers[sortedPatitionLastIndex+1] = numbers[sortedPatitionLastIndex];
                }

                if(sortedPatitionLastIndex==0){
                    insertionIndex = sortedPatitionLastIndex;
                }
            }*/

            //Shift right as long as value is greater
            for(insertionIndex = unsortedPartitionIndex ; insertionIndex>0 && numbers[insertionIndex-1] > itemToInsert ; insertionIndex--){
                numbers[insertionIndex] = numbers[insertionIndex-1];
            }

            numbers[insertionIndex] = itemToInsert;

        }

        System.out.println("******After Sorting******");
        for (int number: numbers) {
            System.out.println(number);
        }

    }
}
