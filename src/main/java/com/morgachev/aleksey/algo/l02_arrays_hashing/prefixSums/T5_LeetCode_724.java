package com.morgachev.aleksey.algo.l02_arrays_hashing.prefixSums;

public class T5_LeetCode_724 {
    //Реализация с доп массивом
    public static int pivotIndex1(int[] nums) {
        int n = nums.length;
        int[] pref = new int[n + 1];
        int left_sum, right_sum;
        for (int i = 0; i < n; i++){
            pref[i+1] = pref[i] + nums[i];
        }
        for (int i = 0; i < n; i++){
            left_sum = pref[i];
            right_sum = pref[n] - pref[i+1];
            if (left_sum == right_sum){
                return i;
            }
        }
        return -1;
    }

    //За O(1) по памяти - вместо доп массива -  2 переменные сумм
     public static int pivotIndex2(int[] nums) {
        int left_sum = 0;
        int total_sum = 0;
        for(int x : nums){
            total_sum += x;
        }
        for (int i = 0; i < nums.length; i++){
            if (left_sum == total_sum - left_sum - nums[i]){
                return i;
            }
            left_sum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex1(nums));
        System.out.println(pivotIndex2(nums));
    }
}
