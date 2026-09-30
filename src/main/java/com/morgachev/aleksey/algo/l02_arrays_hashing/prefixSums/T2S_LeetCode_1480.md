# Intuition
Задача требует принять массив элементов и вернуть массив префиксных сумм

# Approach
Строится по формуле: pref[i] = pref[i - 1] + nums[i] и отдельно обрабатывается нудевой индекс

# Complexity
- Time complexity:
  O(n)

- Space complexity:
  Так как массив не меняется на месте, а создается новый размера n, то если учитывать выходные данные - O(n)


# Code
```java []
class Solution {
    public int[] runningSum(int[] nums) {
        int[] pref = new int[nums.length];

        pref[0] = nums[0];
        for (int i = 1; i < nums.length; i++){
            pref[i] = pref[i - 1] + nums[i];
        }
        
        return pref;
    }
}
```