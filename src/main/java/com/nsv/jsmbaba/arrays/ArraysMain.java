package com.nsv.jsmbaba.arrays;

public class ArraysMain {

    public static void main(String[] args) {

        int[] intArray = new int[7];

        intArray[0] = 5;
        intArray[1] = -10;
        intArray[2] = 30;
        intArray[3] = 6;
        intArray[4] = -6;
        intArray[5] = 40;
        intArray[6] = 40;

        int index = -1;
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("iteration="+i+";Value="+intArray[i]);

            if(intArray[i] ==30){
                index=i;
                break;
            }

        }

        System.out.println("index="+index);

    }
}
