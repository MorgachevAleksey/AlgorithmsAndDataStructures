package com.morgachev.aleksey.algo.l02_arrays_hashing.prefixSums;

public class T6_LeetCode_2559 {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] count = new int[words.length + 1];
        for (int i = 0; i < words.length; i++){
            boolean fciv = "aeiou".indexOf(words[i].charAt(0)) != -1;
            boolean sciv = "aeiou".indexOf(words[i].charAt(words[i].length() - 1)) != -1;
            if (fciv == true && sciv == true){
                count[i]++;
            }
        }
        int[] prefCount = new int[words.length + 2];
        for (int i = 0; i < count.length; i++){
            prefCount[i + 1] = count[i] + prefCount[i];
        }
        int[] rez = new int[queries.length];
        for (int i = 0; i < queries.length; i++){
            rez[i] = prefCount[queries[i][1] + 1]  - prefCount[queries[i][0]];
        }
        return rez;
    }

    public static void main(String[] args) {

    }
}
