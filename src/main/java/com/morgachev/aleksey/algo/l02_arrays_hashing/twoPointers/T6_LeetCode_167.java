package com.morgachev.aleksey.algo.l02_arrays_hashing.twoPointers;

import java.util.Arrays;

//Найти два числа, дающие в сумме таргет в отсортированном массиве
//Всегда есть ровно одно решение, по условию задачи
public class T6_LeetCode_167 {
    public static void main (String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right){ //т.к. в условии прописано что индексы должны быть 2 разных, не проверяю условие == когда элемент уже является таргетом
            if (numbers[left] + numbers[right] == target){
                return new int[] {left + 1, right + 1}; //Индексация от одного
            }

            if ((numbers[left] + numbers[right]) < target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[] {}; //Недостижимо т.к. решение есть и будет возвращено раньше
    }
}
