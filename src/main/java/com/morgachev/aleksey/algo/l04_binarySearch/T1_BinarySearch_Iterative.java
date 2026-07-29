package com.morgachev.aleksey.algo.l04_binarySearch;

//Вернуть идекс таргета или -1, итеративная
public class T1_BinarySearch_Iterative {
    public static void main(String[] args){
        int[] arr = {1,3,4,4,5,7,9,10};
        int target = 9;

        System.out.println(binaryIterative(arr, target));
    }

    //Бинарный поиск, итеративная реализация
    public static int binaryIterative(int[] arr, int target){
        //Инициализация двух указателей
        int left = 0;
        int right = arr.length - 1; //! -1))

        //Итераций log(arr length)
        while (left <= right){
            //Середина без переполнения
            int mid = left + (right - left) / 2;

            //Пойман таргет - сразу вернуть
            if (arr[mid] == target){
                return mid;
            }
            //Расчитанная середина > таргета - искать нужно в левой половине, середина - новый правый конец невключиетльно (потому что нет смысла рассматривать старый мид, он не подходит и воизбежание бесконечного цикла)
            else if (arr[mid] > target){
                right = mid - 1;
            }
            //Расчитанная середина < таргета - искать нужно в правой половине, середина теперь - новый левый конец, невключительно
            else if (arr[mid] < target) {
                left = mid + 1;
            }
        }

        //Таргет не пойман циклом
        return -1;
    }
}
