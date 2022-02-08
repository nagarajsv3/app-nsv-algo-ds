package com.nsv.jsmbaba.recursion;

public class FactorialMain {

    public static void main(String[] args) {


        //0! = 1
        //1! = 1 * 0!
        //2! = 2 * 1!
        //3! = 3 * 2!
        //4! = 4 * 3!

        int num = 4;
        int recursiveFactorial = recursiveFactorial(num);

        int iterativeFactorial= iterativeFactorial(num);

        System.out.println("recursiveFactorial="+recursiveFactorial);
        System.out.println("iterativeFactorial="+iterativeFactorial);


    }

    private static int iterativeFactorial(int num) {
        if(num==0){
            return 1;
        }

        int factorial = 1;
        for(int i=1; i<=num; i++){
            factorial = factorial * i;
        }
        return factorial;
    }

    private static int recursiveFactorial(int num) {
        if(num == 0){
            return 1;
        }

        return num * recursiveFactorial(num-1);
    }


}
