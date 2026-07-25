package com.morgachev.aleksey.algo.l06_trees;

import com.morgachev.aleksey.algo.l06_trees.T1_TreeNode.TreeNode;

//Вычисление максимальной глубины бинарного дерева
public class T2_LeetCode_104 {
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

        //Выводим результат вызова функции вычисления максимальной глубины бинарного дерева
        System.out.println(maxDepth(root));
    }

    //Функция для вычисления максимальной глубины дерева
    public static int maxDepth(TreeNode root) {
        //Поле для расчета глубины деерева (можно обойтись без нее и сразу возвращать результат)
        int depth;

        //Базовый случай рекурссии - условие остановки
        if (root == null){
            return 0;
        }

        //Рекурсивно вызываем функцию для потомков, рассматривая каждый как корень своего поддерева и выбираем потомка с большей глубиной
        depth = Math.max(maxDepth(root.left), maxDepth(root.right));

        //К итоговому ответу прибавляем сам текущий узел
        return depth + 1;
    }
}
