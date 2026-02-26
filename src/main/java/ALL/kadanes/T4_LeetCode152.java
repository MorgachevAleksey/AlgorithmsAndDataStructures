package ALL.kadanes;

public class T4_LeetCode152 {
    public static void main(String[] args){
        int arr[] = {-1,-2,-9,-6};

        System.out.println(Kadens.maxSum(arr));
    }

    public static class Kadens{
        public static int maxSum(int[] nums){
            int currentMax = nums[0];
            int currentMin = nums[0];
            int globalMax = nums[0];
            for (int i = 1; i < nums.length; i++){
                //Оч важный момент:
                //после расчета текущего максимума, он заменяется, поэтому далее
                //нужно использовать переменную для хранения текущего максимума до расчета нового
                //чтобы потом использовать его в расчете текущего минимума
                int currentM = currentMax;
                currentMax = Math.max(currentM * nums[i], Math.max(currentMin * nums[i], nums[i]));
                currentMin = Math.min(currentMin * nums[i], Math.min(currentM * nums[i], nums[i]));
                globalMax = Math.max(globalMax, currentMax);
            }
            return globalMax;
        }
    }
}
