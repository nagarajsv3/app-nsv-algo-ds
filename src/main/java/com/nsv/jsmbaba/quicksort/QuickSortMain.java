package com.nsv.jsmbaba.quicksort;

public class QuickSortMain {

    public static void main(String[] args) {

        int[] numbers = {20, -35, 10 , -50 , 25, 35, 45};

        quicksort(numbers, 0, numbers.length);


        System.out.println("******After Quick Sort********");
        for (int num: numbers) {
            System.out.println(num);
        }

    }

    //Recursive
    private static void quicksort(int[] numbers, int start, int end) {
        //Base Condition
        if((end - start) < 2){
            return;
        }

        int partitionIndex = partition(numbers, start, end);
        quicksort(numbers, start, partitionIndex);
        quicksort(numbers, partitionIndex+1, end);

    }


    private static int partition(int[] numbers, int start, int end) {
        int pivot = numbers[start];
        int i = start;
        int j = end;

        // As long as i and j did not cross over
        while(i < j){
            //Empty Loop
            while(i < j && numbers[--j] >=pivot);
            if(i<j){
                numbers[i] = numbers[j];
            }

            while(i<j && numbers[++i] <= pivot);
            if(i<j){
                numbers[j] = numbers[i];
            }
        }

        numbers[j] = pivot;
        return  j;
    }

}
