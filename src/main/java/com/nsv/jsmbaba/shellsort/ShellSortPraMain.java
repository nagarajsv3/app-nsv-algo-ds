package com.nsv.jsmbaba.shellsort;

public class ShellSortPraMain {

    public static void main(String[] args) {

        //int[] numbers = { 20, 35 , -15 , 7 , 55 , 1, -22 };

        int[] numbers = { 70 , -20 , 30 , -5 , 2 , 1 , 96 , -128 , 256 , 20, 35 , -15 , 7 , 55 , 1, -22 };

        //Calculate Gap value using knuth formulae
        //k = (3^k - 1)/2
        //k less than length of array

        for(int gap = numbers.length/2 ; gap > 0; gap = gap/2){

            System.out.println("*********GAP="+gap);

            for(int iterator = gap ; iterator < numbers.length; iterator++){
                int newElement = numbers[iterator];
                System.out.println("i="+iterator+";newElement="+newElement);

                int newElementIndex= iterator;

                while(newElementIndex>=gap && numbers[newElementIndex-gap] > newElement){
                    numbers[newElementIndex] = numbers[newElementIndex-gap];
                    newElementIndex = newElementIndex-gap;
                }

                numbers[newElementIndex] = newElement;

            }


        }

        System.out.println("******After Sort");
        for (int num: numbers) {
            System.out.println(num);
        }


    }
}
