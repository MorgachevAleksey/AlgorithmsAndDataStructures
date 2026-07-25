package com.morgachev.aleksey.algo.l06_trees;

import java.util.ArrayList;
import java.util.List;
import com.morgachev.aleksey.algo.l06_trees.T1_TreeNode.TreeNode;

//Inorder - Left-Root-Right, рекурсия
public class T4_LeetCode_94 {
    public static void main(String[] args){
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

        //Выводим возвращаемый функцией центрированного обхода список
        System.out.println(inorderTraversal(root));
    }


    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversal(root, result);
        return result;
    }

    private static void inorderTraversal(TreeNode root, List<Integer> result){ //Перегрузка метода для лаконичности + инкапсуляция
        if (root == null){
            return;
        }
        inorderTraversal(root.left, result);
        result.add(root.val);
        inorderTraversal(root.right, result);
    }
}
