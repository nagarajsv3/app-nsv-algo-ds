package com.nsv.jsmbaba.quicksort;

public class QuickSortPracMain {

    public static void main(String[] args) {

        int[] numbers = {21, 33, -15, 18, 24, 66, 99, -12};

        quickSort(numbers, 0, numbers.length);

        System.out.println("*****After Quick Sort*****");

        for (int num: numbers) {
            System.out.println(num);
        }

    }

    //Recursive
    private static void quickSort(int[] numbers, int start, int end) {
        //Base Condition
        if((end-start) < 2){
            return;
        }

        int partitionIndex = partition(numbers, start, end);
        quickSort(numbers , start, partitionIndex);
        quickSort(numbers, partitionIndex+1  , end);

    }

    private static int partition(int[] numbers, int start, int end) {
        int pivot = numbers[start];
        int i = start;
        int j = end;

        while(i < j){

            //Empty Loop
            while(i < j && numbers[--j] >= pivot);
            if(i < j){
                numbers[i] = numbers[j];
            }

            //Empty Loop
            while(i<j && numbers[++i] <= pivot);
            if(i<j){
                numbers[j] = numbers[i];
            }

        }


        numbers[j] = pivot;
        return j;
    }
}
