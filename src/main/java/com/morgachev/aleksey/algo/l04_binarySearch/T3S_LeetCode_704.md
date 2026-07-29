# Intuition
Выбрал итеративную реализацию с помощью двух указателей

# Approach
Расчитывается середина отрезка, которая в каждой итерации цикла сравнивается с таргетом
Если элемент по середине больше таргета - рассматривается левый подотрезок, иначе правый

# Complexity
- Time complexity:
  O(log n)

- Space complexity:
  O(1)

# Code
```java []
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if (nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else if(nums[mid] > target){
                right = mid - 1;
            }
        }

        return -1;
    }
}
```