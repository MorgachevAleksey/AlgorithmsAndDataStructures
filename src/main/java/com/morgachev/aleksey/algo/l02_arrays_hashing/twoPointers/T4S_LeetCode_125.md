# Intuition
Чтобы проверить является ли строка палиндромом - нужно использовать два встречных указателя

# Approach
Два встречных указателя начинаю движение с концов строки. На каждой итерации с каждой стороны пропускаются символы, не являющиеся буквой или цифрой. Если найдено несовпадение символов - возвращем ложь. Если дошли до конца - палиндром, возвращаем правду

# Complexity
- Time complexity:
  O(n)

- Space complexity:
  O(1) - коонстантная, дополнительная память не используется
  (из-за особенностей Java O(n), так как метод .toLowerCase, использованный для унификации входящих строк, создает новую строку, длиной n)

# Code
```java []
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        s = s.toLowerCase();
        
        while (left < right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }

            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if (s.charAt(left++) != s.charAt(right--)){
                return false;
            }
        }
        
        return true;
    }
}
```