package com.nsv.jsmbaba.binarysearch;

public class BinarySearchMain {

    public static void main(String[] args) {

        int[] inputArray = {-20, -10, 0, 5, 10, 21, 33};

        /*System.out.println(iterativeBinarySearch(inputArray, -10));
        System.out.println(iterativeBinarySearch(inputArray, 21));
        System.out.println(iterativeBinarySearch(inputArray, 8888));
        System.out.println(iterativeBinarySearch(inputArray, 33));*/

        System.out.println(recursiveBinarySearch(inputArray, -10));
        System.out.println(recursiveBinarySearch(inputArray, 21));
        System.out.println(recursiveBinarySearch(inputArray, 8888));
        System.out.println(recursiveBinarySearch(inputArray, 33));

    }

    private static int recursiveBinarySearch(int[] inputArray, int searchValue) {
        return recursiveBinarySearch(inputArray, 0, inputArray.length, searchValue);
    }

    private static int recursiveBinarySearch(int[] inputArray, int start, int end, int searchValue) {
        if(start >= end){
            return -1;
        }

        int mid = (start+end)/2;
        System.out.println("Mid="+mid);
        if(inputArray[mid] == searchValue){
            return mid;
        }else if(inputArray[mid] < searchValue){
            return recursiveBinarySearch(inputArray, mid+1, end, searchValue);
        }else{
            return recursiveBinarySearch(inputArray, start, mid, searchValue);
        }

    }

    private static int iterativeBinarySearch(int[] inputArray, int searchValue) {
        int start = 0;
        int end = inputArray.length;

        while(start < end){
            int mid = (start + end) / 2;
            System.out.println("Mid="+mid);
            if(inputArray[mid] == searchValue){
                return mid;
            }else if(inputArray[mid] < searchValue){
                start = mid+1;
            }else{
                end = mid;
            }
        }



        return -1;
    }
}
