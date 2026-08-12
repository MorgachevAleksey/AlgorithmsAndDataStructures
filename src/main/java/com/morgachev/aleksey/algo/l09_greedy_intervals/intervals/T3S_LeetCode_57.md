# Intuition
Очевидно это развитие задачи о слиянии пересекающихся интервалов

# Approach
Решение состоит из трех частей:
1) Добавить в результирующий массив все интервалы ДО нового
2) Слить с новым все пересекающиеся и добавить его
3) Добавить все интервалы ПОСЛЕ нового слитого
   Имеет смысл вести один индекс счетчика на все три цикла

# Complexity
- Time complexity:
  O(n) - Проходим каждый данный элемент единожды

- Space complexity:
  O(n) - Место на результирующий список

# Code
```java []
class Solution {
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
    }
}
```