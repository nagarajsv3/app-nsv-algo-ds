package com.nsv.jsmbaba.recursion;

public class EvenNumSumMain {

    public static void main(String[] args) {

        int num = 12;
        boolean evenNumSum = false;

        int recursiveNumberSum = recursiveNumbersSum(num, evenNumSum);
        System.out.println("recursiveNumberSum="+recursiveNumberSum);

        int iterativeNumberSum = iterativeNumbersSum(num , evenNumSum);
        System.out.println("iterativeNumberSum="+iterativeNumberSum);

    }

    private static int iterativeNumbersSum(int num, boolean evenNumSum) {
        if(num<=0){
            return 0;
        }
        int sum = 0;

        int reminder = -1;
        int i;
        if(evenNumSum) {
            reminder=0;
            i=2;

        }else{
            reminder=1;
            i=1;
        }

        if(num%2!=reminder){
            num = num-1;
        }

        for ( ;i <=num ; i=i+2) {
            sum = sum + i;
        }


        return sum;
    }

    private static int recursiveNumbersSum(int num, boolean evenNumSum) {
        if(num<=0){
            return 0;
        }

        int reminder = -1;
        if(evenNumSum){
            reminder = 0 ;
        }else{
            reminder = 1;
        }

        if(num % 2 !=reminder){
            num = num-1;
        }
        return num + recursiveNumbersSum(num-2, evenNumSum);

    }
}
