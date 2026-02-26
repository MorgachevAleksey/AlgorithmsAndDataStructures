package ALL.kadanes;

//Решение 53 задачи ЛитКод
public class T3_LeetCode53 {
    public static void main(String[] args){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(Kadens.maxSubArray(arr));
    }

    public static class Kadens{
        public static int maxSubArray(int[] nums) {
            //Проверка на пустой массив не нужна, по условию
            int currSumm = nums[0];
            int maxSumm = nums[0];
            for (int i = 1; i < nums.length; i++){
                currSumm = Math.max(nums[i], nums[i] + currSumm);
                maxSumm = Math.max(maxSumm, currSumm);
            }
            return maxSumm;
        }
    }
}
