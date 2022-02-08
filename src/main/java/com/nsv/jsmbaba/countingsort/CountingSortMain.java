package com.nsv.jsmbaba.countingsort;

public class CountingSortMain {

    public static void main(String[] args) {

        int[] numbers = { 2, 2 , 9 , 3 , 6 , 8 , 6 , 8 , 6 , 1 , 7 , 5} ;

        countingSort(numbers, 1, 10);

        System.out.println("*****After CountingSort******");
        for (int num: numbers) {
            System.out.println(num);
        }

    }

    //Original Array { 2, 2 , 9 , 3 , 6 , 8 , 6 , 8 , 6 , 1 , 7 , 5} ;
    //Counting Array { 1, 2 , 1 , 0 , 1 , 3 , 1 , 2 , 1 , 0} ;

    //{ 12, 12 , 19 } ;
    //{ 0, 2 , 0 , 0, 0, 0, 0, 0, 1 ,0 }
    private static void countingSort(int[] numbers, int minRange, int maxRange) {
        //Initialize Counting Array
        int[] countingArray = new int[(maxRange-minRange) + 1];

        //Populate Counting Array with number of occurences
        for (int i = 0; i < numbers.length; i++) {
            //Translate original array to position in the counting array
            countingArray[numbers[i] - minRange]++;
        }

        //Populate Original array using counting array
        int j=0;
        for(int i=minRange; i<=maxRange; i++){
            //Translate Position in counting array to Value in original array
            while(countingArray[i - minRange] > 0){
                numbers[j++] = i;
                countingArray[i - minRange]--;
            }
        }

    }

}
