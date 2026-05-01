# Intuition
Отсортировать массив по времени O(n*log 2(n)) - очевидно, сортировкой слиянием.

# Approach
Базовая реализация сортировки слиянием:
- расчет тукущей середины отрезка (начинаем со свего массива)
- рекурсивный запуск сортировки для (отрезков  от начала до текущей середины и от текущей середины до конца)
- слить отсортированные отрезки
- функция слияния поочередно сравнивает элементы исходного массива, скопированные в буферный массив и вставляет меньший (устойчиво) в исходный

# Complexity
- Time complexity:
  O(n*log 2(n))

- Space complexity:
  O(n)

# Code
```java []
class Solution {
    public int[] sortArray(int[] nums) {
      int[] temp = new int[nums.length];
        mergeSort(nums, temp, 0, nums.length - 1);
        return nums;
    }

    public static void mergeSort(int[] arr, int[] temp, int left, int right){
        if (left >= right){
            return;
        }
        int mid = left + (right - left)/2;
        mergeSort(arr, temp, left, mid);
        mergeSort(arr, temp, mid + 1, right);
        merge(arr, temp, left, mid, right);
    }

    public static void merge(int[] arr, int[] temp, int left, int mid, int right){
        for (int i = left; i <= right; i++){
            temp[i] = arr[i];
        }
        int i = left;
        int j = mid + 1;
        int k = left;
        while (i <= mid && j <= right){
            if (temp[i] <= temp[j]){
                arr[k++] = temp[i++];
            }
            else{
                arr[k++] = temp[j++];
            }
        }
        while (i <= mid){
            arr[k++] = temp[i++];
        }
        while (j <= right){
            arr[k++] = temp[j++];
        }
    }
}
```