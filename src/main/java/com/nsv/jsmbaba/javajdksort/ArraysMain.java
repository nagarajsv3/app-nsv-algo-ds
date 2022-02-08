package com.nsv.jsmbaba.javajdksort;

import java.util.Arrays;

public class ArraysMain {

    public static void main(String[] args) {

        int[] numbers = {-20 , 50 , -100, 75, 100, 60, -50};

        Arrays.sort(numbers);

        System.out.println("****Arrays.sort - DualPivotQuickSort ******");
        for (int num: numbers) {
            System.out.println(num);
        }

        System.out.println("****Arrays.parallelSort - MergeSort + Parallel Threads******");

        int[] numbers1 = {-20 , 50 , -100, 75, 100, 60, -50};

        Arrays.parallelSort(numbers1);

        for (int num: numbers1) {
            System.out.println(num);
        }

    }

}
