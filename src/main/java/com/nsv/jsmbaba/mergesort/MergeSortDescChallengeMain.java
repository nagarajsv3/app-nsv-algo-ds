package com.nsv.jsmbaba.mergesort;

public class MergeSortDescChallengeMain {

    public static void main(String[] args) {

        int[] numbers = {10, -20, 30 , -40 , 5, 15 , 25 , -45};

        mergeSort(numbers, 0, numbers.length);


        System.out.println("*****Merge Sort - Desc*****");
        for (int num: numbers) {
            System.out.println(num);
        }

    }

    //10, -20, 30 , -40 , 5, 15 , 25 , -45
    //Recursion
    public static void mergeSort(int[] numbers, int start, int end){
        //Base Condition
        if(end-start <2){
            return;
        }

        int mid = (start + end) / 2 ;

        mergeSort(numbers, start, mid);
        mergeSort(numbers, mid, end);
        merge(numbers, start, mid, end);
    }


    //10, -20, 30 , -40 , 5, 15 , 25 , -45
    private static void merge(int[] numbers, int start, int mid, int end) {
        if(numbers[mid-1] > numbers[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] tempArray = new int[end - start];

        //20 10   40 30
        //40 30  20 10
        while(i < mid && j <end){
            tempArray[tempIndex++] = numbers[i] >= numbers[j] ? numbers[i++] : numbers[j++];
        }

        System.arraycopy(numbers, i, numbers, start+tempIndex, mid - i);
        System.arraycopy(tempArray, 0, numbers, start, tempIndex);

    }

}
