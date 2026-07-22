package com.morgachev.aleksey.algo.l06_trees;


public class T1_TreeNode {
    public static void  main(String args[]){
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
    }

    //Класс для задания дерева
    public static class TreeNode {
        //Поля класс узла
        int val; //Значение узла
        public TreeNode left; //Левый потомок (то что поле публичное - допустимое нарушение инкапсуляции)
        public TreeNode right; //Правый потомок

        //Конструкторы
        public TreeNode(){ //Пустой, сохранение конструктора по умолчанию

        }
        public TreeNode(int val){ //С инициализацией узла тольско со значением
            this.val = val;
        }
        public TreeNode(int val, TreeNode left, TreeNode right){ //С инициализацией узла со значением и потомками
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
