# Intuition
Обратный обход бинарного дерева, рекурсивный подход

# Approach
Реализую в две функции:
1ая Создает список, вызывает функцию обхода, возвращает список
2ая Получает корень дерева и список, модифицирует список, добавляя значения узлов в нужном порядке (Левый потомок (вызывает себя рекурсивно), правый потомок (вызывает себя рекурсивно), корень)

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
    public List<Integer> postorderTraversal(TreeNode root) {
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
```