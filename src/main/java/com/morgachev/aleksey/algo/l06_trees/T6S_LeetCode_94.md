# Intuition
Центрированный обход бинарного дерева, итеративный подход
Моделирование работы стэка вызовов рекурсивного подхода

# Approach
Реализация:
Условный цикл реализации остановится когда в стэке не останется узлов и текущий будет null, в этом цикле:
1. Спускаемся вниз по левым потомкам до упора, с помощью цикла
2. Обрабатываем текущий узел, удаляя его из стэка и добавляя его значение в результирующий массив
3. Выбираем текущим правого потомка текущего

# Complexity
- Time complexity:
  O(n) - каждый узел обрабатывается ровно 1 раз

- Space complexity:
  O(n) - Не считая выходных данных (результирующий массив значений), создается стэк размером n в худшем случае (вырожденное дерево), и log n в лучшем случае (совершенное дерево)

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
    //Рекурсивный подход
    // public List<Integer> inorderTraversal(TreeNode root) {
    //     List<Integer> result = new ArrayList<>();
    //     inorderTraversal(root, result);
    //     return result;
    // }
    // private static void inorderTraversal(TreeNode root, List<Integer> result){ //Перегрузка метода для лаконичности + инкапсуляция
    //     if (root == null){
    //         return;
    //     }
    //     inorderTraversal(root.left, result);
    //     result.add(root.val);
    //     inorderTraversal(root.right, result);
    // }

    //Итеративный подход
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode current = root;
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();

        while (!stack.isEmpty() || current != null){
            
            while (current != null){
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            result.add(current.val);

            current = current.right;
        }
        return result;
    }
}
```