package com.morgachev.aleksey.algo.l06_trees;

import java.util.ArrayList;
import java.util.List;
import com.morgachev.aleksey.algo.l06_trees.T1_TreeNode.TreeNode;

//Preorder - Root-Left-Right, рекурсия
public class T3_LeetCode_144 {
    public static void main(String[] args) {
        //Создаем дерево
        //Сначала создаем все узлы
        TreeNode root = new TreeNode(1);
        TreeNode node10 = new TreeNode(10);
        TreeNode node5 = new TreeNode(5);
        TreeNode node15 = new TreeNode(15);
        TreeNode node2 = new TreeNode(2);
        //Потом соединяем
        root.left = node10;
        root.right = node5;
        node5.left = node15;
        node5.right = node2;

        //Создаем результирующий список
        List<Integer> rezult = new ArrayList<>();
        //Вызываем функцию обхода
        preorderTraversal(root, rezult);
        //Выводим результат
        System.out.println(rezult);
    }

    public static void preorderTraversal (TreeNode root, List<Integer> rezult){
        //Базовый случай
        if (root == null) {
            return;
        }

        //Модифицируем список
        rezult.add(root.val);
        //Вызываем рекурсивно для левого и праваого потомка
        preorderTraversal(root.left, rezult);
        preorderTraversal(root.right, rezult);
    }
}

//Решение задачи LeetCode 144 в две функции
///**
// * Definition for a binary tree node.
// * public class TreeNode {
// *     int val;
// *     TreeNode left;
// *     TreeNode right;
// *     TreeNode() {}
// *     TreeNode(int val) { this.val = val; }
// *     TreeNode(int val, TreeNode left, TreeNode right) {
// *         this.val = val;
// *         this.left = left;
// *         this.right = right;
// *     }
// * }
// */
//class Solution {
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> rezult = new ArrayList<>();
//        helper(root, rezult);
//        return rezult;
//    }
//
//    public static void helper(TreeNode root, List<Integer> rezult){
//        if (root == null){
//            return;
//        }
//        rezult.add(root.val);
//        helper(root.left, rezult);
//        helper(root.right, rezult);
//    }
//}