package com.morgachev.aleksey.algo.l06_trees;

import com.morgachev.aleksey.algo.l06_trees.T1_TreeNode.TreeNode;

//Измерение максимальной глубины дерева
public class T2_LeetCode_104 {
    public static void main(String[] args){

    }

    //Функция для вычисления максимальной глубины дерева
    public int maxDepth(TreeNode root) {
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
