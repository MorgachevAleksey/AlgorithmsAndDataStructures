package com.morgachev.aleksey.algo.l06_trees;

import java.util.ArrayList;
import java.util.List;
import com.morgachev.aleksey.algo.l06_trees.T1_TreeNode.TreeNode;

//Postorder - Left-Right-Root, рекурсия
public class T5_LeetCode_145 {
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

        //Выводим возвращаемый функцией обратного обхода список
        System.out.println(postorderTraversal(root));
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderTraversal(root, result);
        return result;
    }

    private static void postorderTraversal(TreeNode root, List<Integer> result){
        if (root == null){
            return;
        }
        postorderTraversal(root.left, result);
        postorderTraversal(root.right, result);
        result.add(root.val);
    }
}
