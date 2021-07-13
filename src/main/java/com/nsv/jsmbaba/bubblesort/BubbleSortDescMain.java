package com.nsv.jsmbaba.bubblesort;

public class BubbleSortDescMain {

    public static void main(String[] args) {

        int[] intArray = {20, 18 , 17 , 16 , -20 , 190 , 5 , 9 , 99, -120} ;

        for(int unsortedArrayLastIndex = intArray.length-1 ; unsortedArrayLastIndex > 0; unsortedArrayLastIndex--){

            for(int i=0; i<unsortedArrayLastIndex ; i++){
                if(intArray[i] < intArray[i+1]){
                    swap(intArray, i, i+1);
                }

            }
        }

        System.out.println("*****After Desc Sort******");

        for (int number: intArray) {
            System.out.println(number);
        }

    }

    private static void swap(int[] intArray, int i, int j) {
        int temp = intArray[i];
        intArray[i] = intArray[j] ;
        intArray[j] = temp;
    }
}
