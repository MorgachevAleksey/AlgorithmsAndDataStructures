package com.morgachev.aleksey.algo.l02_arrays_hashing.prefixSums;

//Класс для работы с префиксными суммами
public class T3_LeetCode_303 {
    //Поле массива префиксных сумм
    int[] pref;

    //Конструктор с заполнением массива префиксных сумм
    public T3_LeetCode_303(int[] nums) {
        this.pref = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++){
            pref[i + 1] = pref[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        int result = this.pref[right + 1] - this.pref[left];
        return result;
    }

    //Метод расчета суммы диапазона левой и правой границы включительно
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        T3_LeetCode_303 obj = new T3_LeetCode_303(nums);
        int param_1 = obj.sumRange(0, 2);
        System.out.println(param_1);

        /**
         * Your NumArray object will be instantiated and called as such:
         * NumArray obj = new NumArray(nums);
         * int param_1 = obj.sumRange(left,right);
         */
    }
}


