package ALL.dynamicProgramming.kadanes;

import java.util.Arrays;

public class T1_Kadanes {
    public static void main(String[] args) {
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (Math.random() * 21) - 10; //Генерация массива случайных в диапазоне -10 до 10
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(Kadens.maxSumm(arr));
    }

    //Формулировка задачи
    //Найти подмассив с максимальной суммой элементов
    public static class Kadens{
        public static double maxSumm(double[] arr) {
            //Проверить на пустой массив
            if (arr == null || arr.length == 0){
                System.out.println("Массив не должен быть пустым");
                return Double.NEGATIVE_INFINITY;
            }
            //Инициализировать текущую сумму и максимальную сумму
            double curSumm = arr[0];
            double maxSumm = arr[0];
            //Пройтись по массиву начиная с первого
            for (int i = 1; i < arr.length; i++){
                //Решаем что больше: текущий элемент или текущий элемент + текущий подмассив, если первое, то начинаем новый подмассив
                curSumm = Math.max(arr[i], arr[i] + curSumm);
                //Обновляем максимум
                maxSumm = Math.max(maxSumm, curSumm);
            }
            return maxSumm;
        }
    }
}
