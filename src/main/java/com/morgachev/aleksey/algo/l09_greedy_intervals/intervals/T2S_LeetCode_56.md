# Intuition
Можно использовать жадный подход:
- Отсортировать по первому
- Сливать пересекающиеся в один

# Approach
Предварительная сортировка с компаратором по первому
Пройти for-each по каждому интервалу:
- Если не пересекается с предыдущим - добавить в ответ
- Если пересекается с предыдущим - мутировать предыдущий

# Complexity
- Time complexity:
  O(n log n) - из-за сортировки, проход O(n)

- Space complexity:
  O(n) - на создание нового результирующего массива

# Code
```java []
class Solution {
    public static int[][] merge(int[][] intervals) {
            Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
            List<int[]> result = new ArrayList<>();
            for (int[] in : intervals){
                if (result.isEmpty() || in[0] > result.getLast()[1]){
                    result.add(in);
                }
                else {
                    result.getLast()[1] = Math.max(in[1], result.getLast()[1]);
                }
            }
            return result.toArray(new int[0][]);
        }
}
```