package ALL.dynamicProgramming.kadanes;

public class T5_LeetCode918 {
    public static void main(String[] args) {
        int[] arr = {1,-2,3,-2};

        System.out.println(Kadanes.maxSumCircular(arr));
    }

    public static class Kadanes{
        public static int maxSumCircular(int[] arr){
            int curMax = 0;
            int globalMax = 0;
            //Todo подумать как должен будет выглядеть цикл для прохода кольцевого массива
            return 0;
        }
    }
}
