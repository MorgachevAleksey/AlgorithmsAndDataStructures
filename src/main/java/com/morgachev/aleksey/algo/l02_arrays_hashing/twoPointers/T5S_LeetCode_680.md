# Intuition
Развитие задачи проверки на палиндром, с использованием паттерна двух указателей. Задача осложнена условием что можно убрать любой элемент строки. Сразу приходит мысль добавить на каждом шаге проверки нна палинндром подстрок без "неправильного" символа слева или справа.

# Approach
Сложность задачи в логике проверки:
- нужно реализовать стандартную проверку на палиндром через два указателя отдельным методом
- создать метод проверки на палиндром с рассмотрением случая не совпадения противоположных элементов: поочередно вызвать в таком случае проверку на палиндром для подстрок без левого и правого символов, результаты проверки вернуть: если хотя бы одна подстрока палиндром - вернуть правду, иначе - ложь

# Complexity
- Time complexity:
  O(n) - Так как циклы проверки при несовпадении элементов вызываются максимум единожды каждый, сложность остается линейной

- Space complexity:
  O(1)

# Code
```java []
class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right){
            if (s.charAt(left) != s.charAt(right)){
                if (!palindromeCheck(s, left+1, right) && !palindromeCheck(s, left, right-1)){
                    return false;
                }
                else {
                    return true;
                }
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean palindromeCheck(String s, int left, int right){
        while (left < right){
            if (s.charAt(left++) != s.charAt(right--)){
                return false;
            }
        }
        return true;
    }
}
```