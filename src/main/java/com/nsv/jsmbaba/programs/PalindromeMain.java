package com.nsv.jsmbaba.programs;

import java.util.LinkedList;

public class PalindromeMain {

    public static void main(String[] args) {

        String dad = "Dad";
        String didi = "Did I,  !! I Did ???";
        String hello = "hellO";
        String raceCar = "raceCAR";

        System.out.print(dad);
        System.out.print(" is palindrome = ");
        System.out.println(isPalindrome(dad));

        System.out.print(didi);
        System.out.print(" is palindrome = ");
        System.out.println(isPalindrome(didi));

        System.out.print(hello);
        System.out.print(" is palindrome = ");
        System.out.println(isPalindrome(hello));

        System.out.print(raceCar);
        System.out.print(" is palindrome = ");
        System.out.println(isPalindrome(raceCar));



    }

    private static boolean isPalindrome(String data) {
        LinkedList<Character> queue = new LinkedList<>();
        LinkedList<Character> stack = new LinkedList<>();
        String checkString = data.toLowerCase();

        for(int i=0;i<checkString.length();i++){
            char character = checkString.charAt(i);

            if(character >= 'a' && character <= 'z'){
                queue.addLast(character);
                stack.push(character);
            }
        }

        while(!stack.isEmpty()){
            if(stack.pop() != queue.removeFirst()){
                return false;
            }
        }

        return true;
    }
}
