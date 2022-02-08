package com.nsv.jsmbaba.linearsearch;

public class LinearSearchMain {

    public static void main(String[] args) {

        int[] numbers = {20 , 10 , -15 , 6 , -65 , 24 , 6};

        System.out.println(linearSearch(numbers, -15));
        System.out.println(linearSearch(numbers, 6));
        System.out.println(linearSearch(numbers, 99999));

    }

    private static int linearSearch(int[] numbers, int searchNum) {

        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == searchNum){
                return i;
            }
        }

        return -1;
    }
}
