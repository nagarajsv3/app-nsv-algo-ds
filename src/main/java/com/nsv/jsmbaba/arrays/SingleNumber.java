package com.nsv.jsmbaba.arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public int singleNumber(int[] numbers){
        int singleNumber = 0;

        Map<Integer, Integer> numbersMap = new HashMap<>();

        for(Integer num : numbers){

            if(numbersMap.containsKey(num)){
                int occurences = numbersMap.get(num);
                occurences++;
                numbersMap.put(num, occurences);
            }else{
                numbersMap.put(num, 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry: numbersMap.entrySet()){
            if(entry.getValue() == 1){
                singleNumber =entry.getKey();
                break;
            }
        }

        return singleNumber;
    }

}
