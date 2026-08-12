package com.morgachev.aleksey.algo.l09_greedy_intervals.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class T2_LeetCode_56 {
    public static void main(String[] args){
        int[][] intervals = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };

        System.out.println(Arrays.deepToString(merged(intervals)));
    }
        //Обьединить пересекающиеся
        public static int[][] merged(int[][] intervals) {
            //Обязательно отсортировать по первому
            Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
            //Создать результирующий массив
            List<int[]> result = new ArrayList<>();
            //Пройтись по всем с первого
            for (int[] in : intervals){
                //Если результирующий пуст или текущий массив НЕ пересекается с последним в результирующем
                if (result.isEmpty() || in[0] > result.getLast()[1]){
                    //Добавить в результирующий
                    result.add(in);
                }
                else {
                    //Перескаются - у последнего в результирующем подвинуть правую границу до максимума
                    result.getLast()[1] = Math.max(in[1], result.getLast()[1]);
                }
            }
            //Стандратное приведение к массиву
            return result.toArray(new int[0][]);
        }
}
