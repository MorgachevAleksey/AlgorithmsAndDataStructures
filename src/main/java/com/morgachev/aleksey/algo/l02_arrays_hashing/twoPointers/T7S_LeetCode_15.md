# Intuition
Основная сложность задачи состоит в том что таргету должны равнятся три числа, и тройки не должны повторятся. Подход для решения вложеный в цикл перебора первого элемента тройки метод двух указателей для двух оставшихся элементов.

# Approach
Необходимо создать результирующий двумерный массив
затем:
- организовать цикл с первого элемента до длины массива -2 цикл перебора первого элемента тройки
- сразу проверить первый элемент на уникалность, если равен предыдущему - пропустить
- реализовать метод двух встречных указателей для правого подоторезка
- первым шагом на каждой итерации цикла двух указателей проверять второй и третий элемент тройки на уникальность (неравеснтво с предудщим для них элементом в массиве)

# Complexity
- Time complexity:
  O(n^2) - два вложенных цикла

- Space complexity:
  O(n) - создается результирующий массив, в худшем случае длиною n
  (Но O(1), если не считать выходных данных - сортировка + несколько переменных)

# Code
```java []
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); //Обязательно, так как метод двух указателей работает только на отсортированном списке

        for (int i = 0; i <= nums.length - 2 - 1; i++) {
            if (i > 0 && nums[i] == nums[i - 1]){ //Сначала проверка на i > 0 иначе ошибка
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                if (left > i + 1 && nums[left] == nums[left - 1]){
                    left++;
                    continue;
                }
                if (right < nums.length - 1 - 1 && nums[right] == nums[right + 1]){
                    right--;
                    continue;
                }
                if (nums[i] + nums[left] + nums[right] == 0) {
                    List<Integer> res = new ArrayList<>(3);
                    res.add(0, nums[i]);
                    res.add(1, nums[left]);
                    res.add(2, nums[right]);
                    result.add(res);
                    left++;
                    right--;
                }

                if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                }
                else if (nums[i] + nums[left] + nums[right] > 0){
                    right--;
                }
            }
        }

        return result;
    }
}
```