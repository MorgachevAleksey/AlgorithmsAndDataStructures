package com.morgachev.aleksey.algo.l00_codeWarsTasks;

public class T3_ArrayAverage {
    public static double findAverage(int[] array) {
        if (array.length == 0){
            return 0;
        }
        double sum = 0;
        for (int element : array){
            sum += element;
        }
        return sum / array.length;
    }
}
