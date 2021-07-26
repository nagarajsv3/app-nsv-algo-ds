package com.nsv.jsmbaba.recursion;

public class SumMain {

    public static void main(String[] args) {

        int num = 5;
        int recursiveSum = recursiveSum(5);
        System.out.println("recursiveSum="+recursiveSum);

        int iterativeSum = iterativeSum(5);
        System.out.println("iterativeSum="+iterativeSum);

    }

    private static int iterativeSum(int num) {
        if(num==0){
            return 0;
        }

        int sum = 0;

        for(int i=1;i<=num;i++){
            sum = sum+i;
        }

        return sum;

    }

    private static int recursiveSum(int num) {
        if(num ==0){
            return 0;
        }

        return num + recursiveSum(num-1);
    }
}
