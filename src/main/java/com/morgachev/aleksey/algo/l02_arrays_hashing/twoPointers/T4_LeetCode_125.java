package com.morgachev.aleksey.algo.l02_arrays_hashing.twoPointers;

public class T4_LeetCode_125 {
    public static void main(String[] args){
        String s1 = "hello";
        String s2 = "UWU";
        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        //Обязательно привести к одному регистру!
        s = s.toLowerCase();

        while (left < right){
            //Обязательно пропускать не буквы и не цифры слева!
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }

            //И справа!
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if (s.charAt(left++) != s.charAt(right--)){
                return false;
            }
        }

        return true;
    }
}
