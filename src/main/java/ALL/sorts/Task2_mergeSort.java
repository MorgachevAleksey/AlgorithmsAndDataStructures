package ALL.sorts;

//Отработка кода сортировки слиянием:


import java.util.Arrays;

public class Task2_mergeSort {
    public static void main(String[] args) {
        //Дан массив - задача отсортировать
        int[] u = {5, 1, 4, 2, 8};

        System.out.println(Arrays.toString(u));
        mergeSort(u);
        System.out.println(Arrays.toString(u));

    }

    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2){
            return;
        }
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int left, int right){
        if (left >= right){
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid - 1);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);

    }

    private static void merge(int[] arr, int left, int mid, int right){
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= right){
            if (arr[i] <= arr[j]){
                temp[k] = arr[i];
                k++;
                i++;
            } else {
                temp[k] = arr[j];
                k++;
                j++;
            }
        }

        //TODO добить если массив обработался несимметрично, копирование временного массива
    }
}

