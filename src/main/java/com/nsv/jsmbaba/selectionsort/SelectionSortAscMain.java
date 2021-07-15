package com.nsv.jsmbaba.selectionsort;

public class SelectionSortAscMain {

    public static void main(String[] args) {

        int[] numbers = {-9 , 20 , -10 , -50 , 50 , 80 , 100 , -200 , 20};

        for(int lastIndexUnsortedPartition = numbers.length-1 ; lastIndexUnsortedPartition > 0 ; lastIndexUnsortedPartition--){

            int largestElementIndex = 0;
            for(int i=1 ; i<= lastIndexUnsortedPartition ; i++){

                if(numbers[i] > numbers[largestElementIndex]){
                    largestElementIndex = i;
                }
            }
            swap(numbers, largestElementIndex, lastIndexUnsortedPartition);

        }

        for (int number: numbers) {
            System.out.println(number);
        }

    }

    private static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

}
