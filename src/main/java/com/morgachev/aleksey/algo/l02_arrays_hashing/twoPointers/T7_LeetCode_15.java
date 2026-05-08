package com.morgachev.aleksey.algo.l02_arrays_hashing.twoPointers;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

//По условию, таргет для тройки == 0
public class T7_LeetCode_15 {
    public static void main(String[] args){
        int[] numbers = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(numbers));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); //Обязательно, так как метод двух указателей работает только на отсортированном списке

        //Цикл для перебора первого элемента тройки
        for (int i = 0; i <= nums.length - 2 - 1; i++) {
            //Проверка на неравенство с предыдущим для первого
            if (i > 0 && nums[i] == nums[i - 1]){ //Сначала проверка на i > 0 иначе ошибка
                continue;
            }

            //Инициализация двух указателей для второго и третьего элемента тройки
            int left = i + 1;
            int right = nums.length - 1;

            //Реализация метода двух указателей
            while (left < right) {
                //Проверка на неравенство с предыдущим для второго
                if (left > i + 1 && nums[left] == nums[left - 1]){
                    left++;
                    continue;
                }
                //Проверка на неравенство с предыдущим для третьего
                if (right < nums.length - 1 - 1 && nums[right] == nums[right + 1]){
                    right--;
                    continue;
                }

                if (nums[i] + nums[left] + nums[right] == 0) {
                    List<Integer> res = new ArrayList<>(3);
                    res.add(0, nums[i]);
                    res.add(1, nums[left]);
                    res.add(2, nums[right]);
                    result.add(res);
                    //Так как решение не иденственное - нужно проеверитьь весь подотрезок
                    left++;
                    right--;
                }
                if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                }
                else if (nums[i] + nums[left] + nums[right] > 0){
                    right--;
                }
            }
        }

        return result;
    }
}
