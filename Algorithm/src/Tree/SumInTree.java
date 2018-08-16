package Tree;

import java.util.Stack;

public class SumInTree {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.addElement(10);
        tree.addElement(7);
        tree.addElement(8);
        tree.addElement(5);
        tree.addElement(6);
        tree.addElement(3);
        tree.addElement(15);
        System.out.println("Inorder Traversal Of Tree:");
        tree.printInOrder();
        Stack<Integer> stack = new Stack<>();
        System.out.println();
        printPath(tree.root, 25, stack);

    }

    //print path if sum is present in tree from root to leaf
    private static void printPath(BSTNode root, int sum, Stack<Integer> stack) {
        if (root == null)
            return;
        if (root.data > sum)
            return;
        stack.push(root.data);
        if (sum == root.data && isLeaf(root)) {
            System.out.println(stack);
            stack.pop();
            return;
        }
        printPath(root.left, sum - root.data, stack);
        printPath(root.right, sum - root.data, stack);
        stack.pop();
    }

    private static boolean isLeaf(BSTNode node) {
        return node.left == null && node.right == null;
    }
}
