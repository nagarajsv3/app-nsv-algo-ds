package com.nsv.jsmbaba.mergesort;

public class MergeSortPracMain {

    public static void main(String[] args) {

        int numbers[] = {10, -20 , 30 , -40 , 50, 60, 70};

        mergeSort(numbers, 0, numbers.length);

        System.out.println("******After Merge Sort******");
        for (int num : numbers) {
            System.out.println(num);
        }

    }

    //Recursion involved
    public static void mergeSort(int[] inputArray, int start , int end){

        //Base Condition
        if(end - start < 2){
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(inputArray, start, mid);
        mergeSort(inputArray, mid, end);
        merge(inputArray, start , mid, end);

    }

    //Actual Sorting and Merging
    private static void merge(int[] inputArray, int start, int mid, int end) {
        if(inputArray[mid-1] <= inputArray[mid]){
            return;
        }

        int i = start;
        int j = mid ;
        int tempIndex = 0;
        int[] tempArray = new int[end-start];

        while(i < mid && j < end){
            tempArray[tempIndex++] = inputArray[i] <= inputArray[j] ? inputArray[i++] : inputArray[j++];
        }

        //Copy left over from left array
        System.arraycopy(inputArray, i, inputArray, start + tempIndex, mid-i);

        //Copy tempArray to original array
        System.arraycopy(tempArray, 0, inputArray, start, tempIndex);


    }
}
