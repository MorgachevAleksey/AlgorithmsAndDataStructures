package com.morgachev.aleksey.algo.l02_arrays_hashing.twoPointers;

//Отзеркалить массив
//Встречные указатели
public class T1_Reverse {
    public static void main(String[] args){
        char[] arr = {'1', 'a', 'b', '2'};
        reverse(arr);
        System.out.println(arr);
    }

    public static void reverse(char[] arr){
        //Инициализация двух указателей
        int left = 0;
        int right = arr.length - 1;
        char temp;
        //Знак строгий, чтобы указатели не смотрели на один и тот же еэлемент
        while (left < right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            //Если бы массив был int[] и не имел нулевых значений
            //То с помощью ^= трижды, можно было бы вовсе не затрачивать доп память на temp
            //И так, и так  - память константная
            left++;
            right--;
        }
    }
}