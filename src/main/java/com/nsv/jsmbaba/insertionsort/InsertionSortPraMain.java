package com.nsv.jsmbaba.insertionsort;

public class InsertionSortPraMain {

    public static void main(String[] args) {

        int[] numbers = {20, 30, -15, 7, 10, -15, 33, -5, 80};

        for (int unsortedPartitionFirstIndex = 0; unsortedPartitionFirstIndex < numbers.length; unsortedPartitionFirstIndex++) {
            int newElement = numbers[unsortedPartitionFirstIndex];
            System.out.println("newElement=" + newElement);

            int insertionIndex;

            for (insertionIndex = unsortedPartitionFirstIndex; insertionIndex > 0 && numbers[insertionIndex - 1] > newElement; insertionIndex--) {
                numbers[insertionIndex] = numbers[insertionIndex - 1];
            }

            numbers[insertionIndex] = newElement;

        }

        System.out.println("*****After Sort*****");
        for (int num : numbers) {
            System.out.println(num);
        }

    }
}
