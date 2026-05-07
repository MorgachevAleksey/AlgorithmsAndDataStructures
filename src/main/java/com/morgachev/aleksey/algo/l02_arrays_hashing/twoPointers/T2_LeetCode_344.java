package com.morgachev.aleksey.algo.l02_arrays_hashing.twoPointers;

//Развернуть массив
public class T2_LeetCode_344 {
    public static void main(String[] args){
        char[] s = {'1', 'a', 'b', '2'};
        reverse(s);
        System.out.println(s);
    }

    public static void reverse(char[] s){
        int left = 0;
        int right = s.length - 1;
        char temp;
        while (left < right){
            temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }
}
