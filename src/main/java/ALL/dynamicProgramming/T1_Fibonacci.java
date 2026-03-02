package ALL.dynamicProgramming;

import java.time.Duration;
import java.time.Instant;

//Реализация 4ёх описаннных в теоритическом файле подходов к нахождению n-ого числа фибоначчи
public class T1_Fibonacci {
    public static void main(String[] args) {
        long start1 = System.nanoTime();
        System.out.println(Fibonacci_NaiveRecursion(20));
        long end1 = System.nanoTime();
        System.out.println("Time: " + (end1 - start1));

        long start2 = System.nanoTime();
        System.out.println(Fibonacci_MemoRecursion.func_1(20));
        long end2 = System.nanoTime();
        System.out.println("Time: " + (end2 - start2));

        long start3 = System.nanoTime();
        System.out.println(Fibonacci_Iterative(20));
        long end3 = System.nanoTime();
        System.out.println("Time: " + (end3 - start3));

        long start4 = System.nanoTime();
        System.out.println(Fibonacci_IterativeOptimized(20));
        long end4 = System.nanoTime();
        System.out.println("Time: " + (end4 - start4));
    }

    //Наивная рекурсия - O(2^n) по времени, O(n) по пространству
    public static int Fibonacci_NaiveRecursion(int n){
        if (n <= 1) {
            return n;
        }
        return Fibonacci_NaiveRecursion(n - 1) + Fibonacci_NaiveRecursion(n - 2);
    }

    //Рекурсия с мемоизацией - O(n) время, O(n) пространство
    public static class Fibonacci_MemoRecursion {
        public static int func_1(int n) {
            int[] memo = new int[n + 1]; //заполнен нулями
            memo[0] = 0;
            memo[1] = 1;
            return func_2(n, memo);
        }

        public static int func_2(int n, int[] memo) {
            if (n <= 1) {
                return n;
            }
            if (memo[n] != 0) {
                return memo[n];
            }
            else {
                memo[n] = func_2(n - 1, memo) +  func_2(n - 2, memo);
            }
            return memo[n];
        }
    }

    //Итеративный подход, с сохранением значений в массив - O(n) время, O(n) пространство
    public static int Fibonacci_Iterative(int n) {
        if (n <= 1) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    //Итеративный оптимизированный подход - O(n) время, O(1) пространство
    public static int Fibonacci_IterativeOptimized(int n){
        if (n <= 1) {
            return n;
        }
        int prev2 = 0;
        int prev1 = 1;
        int current = 0;
        for (int i = 2; i <= n; i++){
            current = prev2 + prev1;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }
}