# Intuition
Центрированный обход бинарного дерева, рекурсивный подход

# Approach
Реализую в две функции:
1ая Создает список, вызывает функцию обхода, возвращает список
2ая Получает корень дерева и список, модифицирует список, добавляя значения узлов в нужном порядке (Левый потомок, корень, правый потомок)

# Complexity
- Time complexity:
  O(n) - каждый узел посещается 1 раз, над ним совершается O(1) действий

- Space complexity:
  O(n) - создается один список(выходные данные) + память на рекурсию, глубиной: O(log n) при совершенном дереве и O(n) при вырожденном, оценено сверху

# Code
```java []
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
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
```