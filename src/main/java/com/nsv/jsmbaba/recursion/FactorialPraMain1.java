package com.nsv.jsmbaba.recursion;

public class FactorialPraMain1 {

    public static void main(String[] args) {

        System.out.println(iterativeFactorial(5));
        System.out.println(recursiveFactorial(5));

    }

    private static int recursiveFactorial(int num) {

        //Base Condition
        if(num == 0 ){
            return 1;
        }

        return num * recursiveFactorial(num-1);
    }

    private static int iterativeFactorial(int num) {
        if(num ==0){
            return 1;
        }

        int factorial = 1;
        for(int i=1; i<=num ; i++){
            factorial = factorial * i;
        }
        return factorial;
    }

}
