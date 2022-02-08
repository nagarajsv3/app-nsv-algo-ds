package com.nsv.jsmbaba.countingsort;


public class CountingSortPracMain {

    public static void main(String[] args) {

        int[] numbers = {10, 9, 7, 5, 5, 8, 9, 1, 2, 2, 8, 7, 9};

        countingSort(numbers, 1, 10);

        System.out.println("*****After Counting Sort******");
        for (int num: numbers) {
            System.out.println(num);
        }

    }

    //{10, 9, 7, 5, 5, 8, 9, 1, 2, 2, 8, 7, 9};
    //{1, 2, 0, 0, 2}
    private static void countingSort(int[] numbers, int minRange, int maxRange) {
        //Initialize Counting Array
        int[] countingArray = new int[(maxRange-minRange)+1];

        //Populate Counting Array
        for (int i = 0; i < numbers.length; i++) {
            //Translate value in original array to position in counting array
            countingArray[numbers[i] - minRange]++;
        }

        System.out.println("*****After Creating Counting Array******");
        for (int num: countingArray) {
            System.out.println(num);
        }

        //Populate Original Array
        int j=0;
        for(int i=minRange; i<=maxRange; i++){
            //Translate positions in counting array to values in original array
            while( countingArray[ i - minRange]> 0){
                numbers[j++] = i;
                countingArray[ i - minRange]--;
            }
        }
    }
}
