package com.nsv.jsmbaba.javajdksort;

import java.util.Arrays;

public class ArraysPracMain {

    public static void main(String[] args) {

        int[] numbers = {-20, 50, 60, -50, 65, 20, 100 , 5};

        System.out.println("****Arrays.sort - DualPivotQuickSort ******");
        Arrays.sort(numbers);

        for (int num: numbers) {
            System.out.println(num);
        }

        System.out.println("****Arrays.parallelSort - MergeSort + Parallel Threads******");

        int[] numbers1 = {-20, 50, 60, -50, 65, 20, 100 , 5};

        Arrays.parallelSort(numbers1);

        for (int num: numbers1) {
            System.out.println(num);
        }



    }
}
