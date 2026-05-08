# Intuition
Вариация задачи 3Sum - нужно найти ближайшее к таргету. Действовать стоит так же как и с 3Sum - внешний цикл для первого и внутренний для второго и третьего

# Approach
- Т.к. массив не остортирован - необходимо сразу отсортировать, иначе метод двух указателей непременим
- Реализовать характерный для 3Sum проход массива
- На дубликаты проверять не нужно, но на каждом шаге нужно прверять на ближайшую к таргету сумму - если текущая ближе сохраненной, обновить
- В случае полного совпадения вернуть сам таргет

# Complexity
- Time complexity:
  O(n^2) - стандартный для 3Sum

- Space complexity:
  O(1)

# Code
```java []
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int closest = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++){
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right){
                if ((nums[i] + nums[left] + nums[right]) == target){
                    return target;
                }
                if (Math.abs(target - (nums[i] + nums[left] + nums[right])) < Math.abs(target - closest)){
                    closest = nums[i] + nums[left] + nums[right];
                }
                
                if ((nums[i] + nums[left] + nums[right]) < target){
                    left++;
                }
                else if ((nums[i] + nums[left] + nums[right]) > target){
                    right--;
                }
            }
        }
        return closest;
    }
}
```