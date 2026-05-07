# Intuition
Классическая задача на паттерн "два указателя"

# Approach
Два встречных указателя начинают с концов массива на одинаковой скорости и на каждой итерации обменивают значения элементов массива с помощью буферной переменной

# Complexity
- Time complexity:
  O(n)

- Space complexity:
  O(1)

# Code
```java []
class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        char temp;
        while (left < right){
            temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }
}
```