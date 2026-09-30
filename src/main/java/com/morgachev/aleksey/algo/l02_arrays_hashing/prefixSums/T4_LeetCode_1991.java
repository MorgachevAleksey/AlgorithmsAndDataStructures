package com.morgachev.aleksey.algo.l02_arrays_hashing.prefixSums;

//!Можно бахнуть по О(1) по памяти!:
//Просто завести две переменные для левой и правой суммы, сравнивать и двигать их в цикле!
public class T4_LeetCode_1991 {
    public static int findMiddleIndex(int[] nums) {
        long[] pref = new long[nums.length + 1];
        for (int i = 0; i < nums.length; i++){
            pref[i + 1] = pref[i] + nums[i];
        }
        for (int i = 0; i < nums.length; i++){
            long left_sum = pref[i];
            long right_sum = pref[pref.length - 1] - pref[i + 1];
            if (left_sum == right_sum){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,-1, 8,4};
        System.out.println(findMiddleIndex(nums));
    }
}
