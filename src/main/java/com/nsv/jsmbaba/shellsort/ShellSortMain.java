package com.nsv.jsmbaba.shellsort;

public class ShellSortMain {

    public static void main(String[] args) {

        int[] numbers = {10 , -20 ,30, 5, 15, 80, -30, 40, 25};

        for(int gap = numbers.length/2 ; gap>0 ; gap = gap/2){

            for(int i=gap; i<numbers.length ; i++){
                int newElement = numbers[i];

                int j = i ;

                while(j >= gap && numbers[j-gap] > newElement){
                    numbers[j] = numbers[j-gap];
                    j = j-gap;
                }

                numbers[j] = newElement;

            }




        }

        System.out.println("******After Shell Sort*******");
        for (int num: numbers) {
            System.out.println(num);
        }


    }
}
