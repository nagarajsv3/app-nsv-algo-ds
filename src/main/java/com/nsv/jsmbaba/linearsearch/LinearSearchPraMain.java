package com.nsv.jsmbaba.linearsearch;

public class LinearSearchPraMain {

    public static void main(String[] args) {


        String data = "DNIT1234567890" ;
        System.out.println(data.hashCode());

        String data1 = "DNIT1234567sd" ;

        int[] numbers = {90, 20, -15, 25, 9, -40, 9};

        System.out.println(linearSearch(numbers, -15));
        System.out.println(linearSearch(numbers, 9));
        System.out.println(linearSearch(numbers, -1));
        System.out.println(linearSearch(numbers, 999));


    }

    public static int linearSearch(int[] inputArray, int searchValue){

        for(int i=0; i<inputArray.length; i++){
            if(inputArray[i] == searchValue){
                return i;
            }
        }

        return -1;

    }


}
