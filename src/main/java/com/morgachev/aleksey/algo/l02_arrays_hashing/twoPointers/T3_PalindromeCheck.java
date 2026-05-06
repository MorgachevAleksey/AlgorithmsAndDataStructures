package com.morgachev.aleksey.algo.l02_arrays_hashing.twoPointers;

//Проверить на палиндром
//Встречные указатели
public class T3_PalindromeCheck {
    public static void main(String[] args){
        String string1 = "Hello";
        String string2 = "UWU";
        System.out.println(palindromeChecker(string1));
        System.out.println(palindromeChecker(string2));
    }

    //Чувствителен к регистру и учитывает все символы
    public static boolean palindromeChecker(String string){
        int left = 0;
        int right = string.length() - 1;
        while (left < right) {
            if (string.charAt(left++) != string.charAt(right--)){
                return false;
            }
        }
        return true;
    }
}
