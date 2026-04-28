package ALL.l01_sorts.mergeSort;

import java.util.Arrays;

//Полная реализация сортировки слиянием
public class T3_MergeSort {
    public static void main(String[] args){
        int[] arr = {38, 27, 43, 3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //Основной, публичный метод сортировки
    public static void sort(int[] arr){
        //Сразу проверка что массив пустой или содержит одинн элемент
        if (arr == null || arr.length < 2){
            return;
        }
        //Врмеменный массив создается один раз - поэтому здесь
        int[] temp = new int[arr.length];
        //Запускам рекурсивный метод сортировки
        mergeSort(arr, temp, 0, arr.length - 1);
    }

    //Рекурсивный метод сортировки отрезка от left до right включительно
    private static void mergeSort(int[] arr, int[] temp, int left, int right){
        //Базовый случай: в отрезке 0 или 1 элемент - уже отсортирован
        if (left >= right){ //Фактически можно прописать left == right, >= для подстраховки
            return;
        }
        //Находим середину без переполнения
        int mid = left + (right - left)/2;
        //Рекурсивно сортируем левую половину
        mergeSort(arr, temp, left, mid);
        //Рекурсивно сортируем правую половину
        mergeSort(arr, temp, mid + 1, right);
        //Сливаем обе половины
        merge(arr, temp, left, mid, right);
    }

    //Метод слияния
    private static void merge(int[] arr, int[] temp, int left, int mid, int right){
        //Сразу скопировать в буфер, только нужный отрезок
        for (int i = left; i <= right; i++){
            temp[i] = arr[i];
        }

        //Стандартная реализация слияния
        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right){
            if (temp[i] <= temp[j]){
                arr[k] = temp[i];
                i++;
            }
            else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        while (i <= mid){
            /*arr[k] = temp[i];
            i++;
            k++;*/
            arr[k++] = temp[i++]; //Синтаксический сахар - сначала присвоение, потом инекремент
        }

        while (j <= right){
            arr[k] = temp[j];
            j++;
            k++;
        }
    }
}
