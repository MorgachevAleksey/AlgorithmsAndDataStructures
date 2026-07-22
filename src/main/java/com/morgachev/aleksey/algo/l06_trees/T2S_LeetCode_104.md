# Intuition
Вычислить максимальную глубимну дерева - рекурсивный подход

# Approach
Рекурсвиный подход:
1. Прописать базовый случай остановки рекурсии
2. Рекурсивно вызвать функцию для потомков
3. Выбрать наибольшую глубину из двух
4. Вернуть результат + 1 (сам исследуемый узел)

# Complexity
- Time complexity:
  O(n) - каждый узел посещается 1 раз

- Space complexity:
  O(n) - оценка сверху памяти на рекурсию: в худшем случае O(n) при вырожденом дереве, в лучшем O(log n) при совершенном дереве

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
    public int maxDepth(TreeNode root) {
        //Поле для расчета глубины деерева
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
```