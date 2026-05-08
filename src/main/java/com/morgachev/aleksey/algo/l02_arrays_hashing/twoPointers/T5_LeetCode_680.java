package com.morgachev.aleksey.algo.l02_arrays_hashing.twoPointers;

//Проверить на палиндром после удаления не более одного символа
public class T5_LeetCode_680 {
    public static void main(String[] args){
        String s1 = "aba";
        String s2 = "abca";
        String s3 = "abab";
        System.out.println(validPalindrome(s1));
        System.out.println(validPalindrome(s2));
        System.out.println(validPalindrome(s3));
    }

    public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right){
            if (s.charAt(left) != s.charAt(right)){
                if (!palindromeCheck(s, left + 1, right) && !palindromeCheck(s, left, right - 1)){
                    return false;
                }
                else {
                    return true;
                }
                //Можно красиво упростить оператор:
                //return palindromeCheck(s, left + 1, right) || palindromeCheck(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean palindromeCheck(String s, int left, int right){
        while (left < right){
            if (s.charAt(left++) != s.charAt(right--)){
                return false;
            }
        }
        return true;
    }
}
