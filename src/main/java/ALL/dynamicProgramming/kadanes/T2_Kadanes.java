    package ALL.dynamicProgramming.kadanes;

    import java.util.Arrays;

    public class T2_Kadanes {
        public static void main(String[] args) {
            int[] arr = new int[10];
            for (int i = 0; i < arr.length; i++){
                arr[i] = (int)(Math.random() * 21) - 10; //Умножаем на 21, а не 20, потому что правое исключается
            }

            System.out.println(Arrays.toString(Kadanes.maxSumm(arr)));
        }

        //Реализация усложненной версии массива с отслеживаемыми индексами
        public static class Kadanes{
            public static int[] maxSumm(int[] arr){
                int[] rez = new int[2];
                if (arr == null || arr.length == 0){
                    System.out.println("Массив не может быть пустым");
                    return new int[]{0, 0};
                }
                int curMax = arr[0];
                int globalMax = arr[0];
                //Нужны переменые для хранения краев массива
                int tail = 0;
                int tailR = 0;
                int head = 0;
                int headR = 0;
                for (int i = 1; i < arr.length; i++){
                    if (arr[i] > curMax + arr[i]){
                        tail = i;
                        head = i;
                        curMax = arr[i];
                        if (globalMax < curMax){
                            tailR = i;
                            headR = i;
                            globalMax = curMax;
                        }
                    }
                    else{
                        head = i;
                        curMax = arr[i] + curMax;
                        if (globalMax < curMax){
                            headR = head;
                            tailR = tail;
                            globalMax = curMax;
                        }
                    }
                }
                rez[0] = tailR;
                rez[1] = headR;
                return rez;
            }
        }
    }

//    //TODO разобрать более компактную версию кода
//    public static int[] maxSumWithIndices(int[] arr) {
//        if (arr == null || arr.length == 0) return new int[]{0, 0, 0};
//        int currentSum = arr[0];
//        int globalMax = arr[0];
//        int start = 0, end = 0, tempStart = 0;
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > currentSum + arr[i]) {
//                currentSum = arr[i];
//                tempStart = i;
//            } else {
//                currentSum += arr[i];
//            }
//            if (currentSum > globalMax) {
//                globalMax = currentSum;
//                start = tempStart;
//                end = i;
//            }
//        }
//        return new int[]{globalMax, start, end};
//    }