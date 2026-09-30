package com.morgachev.aleksey.algo.l02_arrays_hashing.prefixSums;

//Шаблон кода префиксной суммы
public class T1_PrefixSums {
    //Построение массива префиксной суммы
    public static long[] buildPrefix(int[] a){
        int n = a.length;
        long[] pref = new long[n + 1];
        for (int i = 0; i < n; i++){
            pref[i + 1] = pref[i] + a[i];
        }
        return pref;
    }

    //Сумма на отрезке [L; R] включительно
    public static long sum(long[] pref, int l, int r){
        return pref[r + 1] - pref[l];
    }

    //Тестирование
    public static void main(String[] args) {
        int[] transactions = {500, -200, 1000, -300, 700};
        long[] pref = buildPrefix(transactions);

        System.out.println(sum(pref, 1, 3));
        System.out.println(sum(pref, 0, 4));
        System.out.println(sum(pref, 0, 0));
    }
}
