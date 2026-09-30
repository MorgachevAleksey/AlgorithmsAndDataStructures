# Intuition
Задача требует запрограммировать класс для работы с префиксными суммами

# Approach
Очевидно, нужно добавить поле с массивом префиксных сумм и метод для построения такого массива по переданному массиву. Так же второй метод, который возвращает сумму диапазона по левой и правой границе включенно по формуле: R+1 - L.

# Complexity
- Time complexity:
  O(n) - в момент построения массива префиксных сумм
+
O(1) - в момент расчета суммы диапазона

- Space complexity:
  O(n) - на поле массива префиксных сумм

# Code
```java []
class NumArray {
    int[] pref;

    public NumArray(int[] nums) {
        this.pref = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++){
            pref[i + 1] = pref[i] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        int result = this.pref[right + 1] - this.pref[left];
        return result;
    }
}

```