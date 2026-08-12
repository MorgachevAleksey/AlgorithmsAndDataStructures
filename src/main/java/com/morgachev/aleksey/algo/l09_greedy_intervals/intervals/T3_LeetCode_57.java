    package com.morgachev.aleksey.algo.l09_greedy_intervals.intervals;

    import java.nio.channels.ClosedSelectorException;
    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.List;

    public class T3_LeetCode_57 {
        public static void main(String[] args){
            int[][] intervals = {
                    {1, 2},
                    {3, 5},
                    {6, 7},
                    {8, 10},
                    {12, 16}
            };
            int[] intrval = {4, 8};

            System.out.println("answer: " + Arrays.deepToString(insert(intervals, intrval)));
        }

        public static int[][] insert(int[][] intervals, int[] newInterval) {
            List<int[]> result = new ArrayList<>();
            int i = 0;
            int n = intervals.length;

            //Все ДО
            while (i < n && intervals[i][1] < newInterval[0]) {
                result.add(intervals[i]);
                i++;
            }
            //Сливаем все ПЕРЕСЕКАЮЩИЕСЯ(в конце добавить)
            while (i < n && intervals[i][0] <= newInterval[1]) {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
                i++;
            }
            result.add(newInterval); // добавляем слитый интервал
            //Все ПОСЛЕ
            while (i < n) {
                result.add(intervals[i]);
                i++;
            }

            return result.toArray(new int[0][]);
    }}
