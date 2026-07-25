# Intuition
Прямой обход бинарного дерева, рекурсивный подход

# Approach
Реализую в две функции:
1ая Создает список, вызывает функцию обхода, возвращает список
2ая Получает корень дерева и список, модифицирует спиоск, добавляя значения узлов в нужном порядке (Корень, левый потомок, правый потомок)

# Complexity
- Time complexity:
  O(n) - каждый узел посещается 1 раз, над ним совершается O(1) действий

- Space complexity:
  O(n) - создается 1 список + память на рекурсию, глубиной: O(log n) при совершенном дереве и O(n) при вырожденном

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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> rezult = new ArrayList<>();
        helper(root, rezult);
        return rezult;
    }

    public static void helper(TreeNode root, List<Integer> rezult){
        if (root == null){
            return;
        }
        rezult.add(root.val);
        helper(root.left, rezult);
        helper(root.right, rezult);
    }
}
```