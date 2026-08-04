package com.morgachev.aleksey.algo.l09_greedy_intervals.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Слить перекрывающиеся интервалы
public class T1_MergeIntervals {
    public static void main(String[] args){
        int[][] example = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };

        System.out.println(Arrays.deepToString(mergeIntervals(example).toArray()));
        System.out.println(Arrays.deepToString(mergeIntervals2(example).toArray()));
    }

    //На отсортированном по началу
    public static List<int[]> mergeIntervals(int[][] arr){
        List<int[]> merged = new ArrayList<>();
        for (int[] interval : arr){
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]){ //Список ответов пуст либо последний в ответе НЕ пересекается с текущим
                merged.add(interval);
            }
            else{ //Интервалы перескаются, значит расширяем тот что в ответе до края текущего
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }
        return merged;
    }

    //Ручное управление текущим (2ой вариант реализации)
    public static List<int[]> mergeIntervals2(int[][] arr){
        //Проверка на пустой ввод
        if (arr == null || arr.length <= 1){
            return Arrays.asList(arr);
        }

        //1. Первый как текущий, оздаем список результатов, сразу добавляем первый(если пересекается, мутируем его в цикле)
        int[] current = arr[0];
        List<int[]> result = new ArrayList<>();
        result.add(current);

        //2. Проход
        for (int i = 1; i < arr.length; i++){
            int[] next = arr[i];
            if (current[1] >= next[0]){
                current[1] = Math.max(current[1], next[1]);
            }
            else{
                current = next;
                result.add(current);
            }
        }

        //3. Возврат
        return result;
    }
}
