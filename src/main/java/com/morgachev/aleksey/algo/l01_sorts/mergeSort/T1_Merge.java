package com.morgachev.aleksey.algo.l01_sorts.mergeSort;

import java.util.Arrays;

//Даны два отсортированных массива - обьеденить в один
public class T1_Merge {
    //Вывод результатов
    public static void main(String[] args){
        int[] arr1 = {1, 4, 6};
        int[] arr2 = {2, 3, 5};
        System.out.println(Arrays.toString(mergeWithBuffer(arr1, arr2)));

        int[] arr3 = {1, 4, 6, 0, 0, 0};
        int[] arr4 = {2, 3, 5};
        int n = 3; //Колличество реальных элементов в первом массиве
        System.out.println(Arrays.toString(mergeInPlace(arr3, arr4, n)));
    }

    //Слияние с помощью буферного массива
    public static int[] mergeWithBuffer(int[] left, int[] right){
        int[] rez = new int[left.length + right.length];
        int i = 0; //Указатель для первого массива
        int j = 0; //Для второго
        int k = 0; //Для результирующего

        //Фактически два указателя
        while (i < left.length && j < right.length){
            if (left[i] <= right[j]){ //Обязательно <= для устойчивости!!
                rez[k] = left[i];
                i++;
            }
            else {
                rez[k] = right[j];
                j++;
            }
            k++;
        }

        //Если в первом массиве остались элементы
        while (i < left.length) {
            rez[k] = left[i];
            i++;
            k++;
        }

        //Если во втором массиве остались элементы
        while (j < right.length) {
            rez[k] = right[j];
            j++;
            k++;
        }

        return rez;
    }

    //Слияние in-place
    public static int[] mergeInPlace(int[] left, int[] right, int n ){ //Кол-во реальных элементов в первом массиве
        int i = n - 1;
        int j = right.length - 1;
        int k = left.length - 1;

        while (i >= 0 && j >= 0){
            if (left[i] >= right[j]){ //>= устойчивость
                left[k] = left[i];
                i--;
            }
            else{
                left[k] = right[j];
                j--;
            }
            k--;
        }

        while (j >= 0){
            left[k] = right[j];
            j--;
            k--;
        }

        return left;
    }
}
