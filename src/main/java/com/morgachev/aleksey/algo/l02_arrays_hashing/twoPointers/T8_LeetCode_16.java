package com.morgachev.aleksey.algo.l02_arrays_hashing.twoPointers;

import java.util.Arrays;

//Вернуть сумму трех элементов массива, ближайшую к таргету
public class T8_LeetCode_16 {
    public static void main(String[] args){
        int[] nums = {-84,92,26,19,-7,9,42,-51,8,30,-100,-13,-38};
        int target = 78;
        System.out.println(threeSumClosest(nums, target));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int closest = nums[0] + nums[1] + nums[2];

        for (int i = 0; i <= nums.length - 1 - 2; i++){
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right){
                if ((nums[i] + nums[left] + nums[right]) == target){
                    return target;
                }

                //Проверка на "близость" к таргет
                if (Math.abs(target - (nums[i] + nums[left] + nums[right])) < Math.abs(target - closest)){
                    closest = nums[i] + nums[left] + nums[right];
                }

                if ((nums[i] + nums[left] + nums[right]) < target){
                    left++;
                }
                else if(((nums[i] + nums[left] + nums[right]) > target)) {
                    right--;
                }
            }
        }
        return closest;
    }
}
