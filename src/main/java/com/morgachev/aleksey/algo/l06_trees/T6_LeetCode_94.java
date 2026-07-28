package com.morgachev.aleksey.algo.l06_trees;

import java.util.*;

//Inorder, итеративная реализация
public class T6_LeetCode_94 {
    public static void main(String[] args){
        //Создаем дерево
        //Сначала создаем все узлы
        T1_TreeNode.TreeNode root = new T1_TreeNode.TreeNode(1);
        T1_TreeNode.TreeNode node10 = new T1_TreeNode.TreeNode(10);
        T1_TreeNode.TreeNode node5 = new T1_TreeNode.TreeNode(5);
        T1_TreeNode.TreeNode node15 = new T1_TreeNode.TreeNode(15);
        T1_TreeNode.TreeNode node2 = new T1_TreeNode.TreeNode(2);
        //Потом соединяем
        root.left = node10;
        root.right = node5;
        node5.left = node15;
        node5.right = node2;

        System.out.println(inorder(root));
    }

    //Итеративная реализация центрированного обхода
    public static List<Integer> inorder(T1_TreeNode.TreeNode root){
        //Создание результирующего списка, стэка, перменной текущего узла
        List<Integer> result = new ArrayList<>();
        T1_TreeNode.TreeNode current = root;
        Deque<T1_TreeNode.TreeNode> stack = new ArrayDeque<>(); //Класс Stack официально считается устаревшим

        //Внешний цикл - пока стек не пуст ИЛИ текущий не пуст (В стэке остались необработанные узлы или текущий узел не нулевой)
        while (!stack.isEmpty() || current != null) {

            //Внутренний цикл - спускаемся (очевидно, только если текущий по сле последней итерации не null) до послднего вниз по левым (пока у текущего не левый потом не null)
            while (current != null) {
                //1) Спускаемся влево до упора (сохраняем в стеке текущий, новый текущий - левый потомок)
                stack.push(current); //push - кладет обьект на вершину стэка
                current = current.left;
            }

            //2) Извлекаем из стэка последний (последний добавленный, самый низкий по дереву - LIFO) и добавляем его значение в результат
            current = stack.pop(); //pop - удаляет обьект из стэка и возвращает удаленный обьект
            result.add(current.val);

            //3) Рассматриваем правого потомка
            current = current.right;
        }
        //Возвращаем результат
        return result;
    }
}
