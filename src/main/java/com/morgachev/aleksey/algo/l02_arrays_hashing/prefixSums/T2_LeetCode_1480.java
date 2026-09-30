package com.morgachev.aleksey.algo.l02_arrays_hashing.prefixSums;

public class T2_LeetCode_1480 {
    //Построение префиксных сумм
    public static int[] runningSum(int[] nums) {
        int[] pref = new int[nums.length]; //В идеале делать long[], чтобы сумма точно уместилась

        pref[0] = nums[0]; //Т.к. по условию без смещения - нужно обработать первый индекс
        for (int i = 1; i < nums.length; i++){
            pref[i] = pref[i - 1] + nums[i];
        }

        return pref;
    }
}
