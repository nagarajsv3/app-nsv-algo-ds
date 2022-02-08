package com.nsv.jsmbaba.selectionsort;

public class SelectionSortMain {

    public static void main(String[] args) {

        int[] numbers =  {20, 35 , -15, 7, 55, 1, -22};

        for(int unsortedPartitionLastIndex = numbers.length - 1 ; unsortedPartitionLastIndex > 0; unsortedPartitionLastIndex --){

            int largestIndex = 0;

            for(int i=1; i<=unsortedPartitionLastIndex ; i++){
                if(numbers[i] > numbers[largestIndex]){
                    largestIndex = i;
                }
            }

            swap(numbers, largestIndex, unsortedPartitionLastIndex);

        }

        System.out.println("**********After Sort***********");
        for (int num: numbers) {
            System.out.println(num);
        }

    }


    public static void swap(int[] numbers, int i, int j){
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

}
