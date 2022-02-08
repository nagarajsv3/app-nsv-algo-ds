package com.nsv.jsmbaba.mergesort;

public class MergeSortMain {

    public static void main(String[] args) {

        int[] inputArray = {20 , 35, -15, 7, 55, 1, -22};

        mergeSort(inputArray, 0, inputArray.length);
        System.out.println("*****After Merge Sort*****");
        for (int num: inputArray) {
            System.out.println(num);
        }

    }


    //{20 , 35, -15, 7, 55, 1, -22
    //Recursion involved
    public static void mergeSort(int[] input, int start, int end){

        //Base Condition
        if(end-start < 2){
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    //{20 , 35, -15, 7, 55, 1, -22
    private static void merge(int[] input, int start, int mid, int end) {
        if(input[mid-1] <= input[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] tempArray = new int[end-start];

        while(i < mid && j < end){
            tempArray[tempIndex++] = input[i] <=input[j] ? input[i++] : input[j++];
        }

        //Copy left over from left array to input array
        System.arraycopy(input, i, input, start + tempIndex, mid-i);

        //Copy tempArray to original Array
        System.arraycopy(tempArray, 0, input, start, tempIndex);
    }

}
