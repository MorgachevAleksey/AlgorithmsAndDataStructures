package ALL.sorts;

//Сортировка слиянием в общем виде

import java.util.Arrays;

public class Task1_mergeSort {
    public static void main(String[] args) {
        int[] u = {2, 4, 1, 3};
        System.out.println("Before" + Arrays.toString(u)); //Конкатенация
        mergeSort(u);
        System.out.println("After" + Arrays.toString(u));
    }

    //Входная точка, поэтому public
    public static void mergeSort(int[] arr){
        //Защита от некорректных вводных данных
        if (arr ==  null || arr.length < 2){
            return;
        }
        //Запускаем рекурсирвную сортировку по всему массиву
        mergeSort(arr, 0, arr.length - 1);
    }

    //Перегружаем метод, делаем основную логику функции
    private static void mergeSort(int[] arr, int left, int right){
        //Условие выхода из рекурсии
        if (left >= right){
              return;
        }
        int mid = left + (right - left) / 2; //Расчет середины без переполнения
        mergeSort(arr, left, mid); //Сортируем левую половину
        mergeSort(arr, mid + 1, right); //Сортируем правую половину
        merge(arr, left, mid, right); //Сливаем в один массив
    }

    //Метод слияния
    private static void merge(int[] arr, int left, int mid, int right){
        //Временный массив для хранения результатов слияния
        int[] temp = new int[right - left + 1];

        //Три указателя
        int i  = left; //Бежит по левой половине
        int j = mid + 1; //По правой
        int k = 0; //По временному

        //Главный цикл слияния пока в обеих массивах есть элементы
        while (i <= mid && j <= right){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        //Два случая - если одна полвинка закончилась, а во второй остались элементы
        while (i <= mid){ //Это если в левой половине остались
            temp[k++] = arr[i++];
        }
        while (j <= right){ //Если в правой
            temp[k++] = arr[j++];
        }

        //Копируем временный массив в исходный встроенным метод
        System.arraycopy(temp, 0, arr, left, temp.length);
    }
}