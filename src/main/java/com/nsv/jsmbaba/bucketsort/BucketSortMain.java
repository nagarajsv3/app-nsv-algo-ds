package com.nsv.jsmbaba.bucketsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSortMain {

    public static void main(String[] args) {

        int[] numbers = {32 , 25, 43, 78 , 70 , 96, 69, 93 , 95};

        bucketSort(numbers);

        for (int num: numbers) {
            System.out.println(num);
        }

    }

    private static void bucketSort(int[] numbers) {
        List<Integer>[] buckets = new ArrayList[10];

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }

        //Distribution
        for (int num :numbers) {
            int bucket = hashCode(num);
            buckets[bucket].add(num);
        }

        //Sort
        for (List<Integer> bucket: buckets) {
            Collections.sort(bucket);
        }

        //Merge
        int j=0; //used as index of parent input array
        for (List<Integer> bucket: buckets) {
            for (int i=0; i< bucket.size(); i++) {
                numbers[j++]= bucket.get(i);
            }
        }

    }

    //bucketid - 10's position
    private static int hashCode(int num) {
        return num / 10;
    }

}
