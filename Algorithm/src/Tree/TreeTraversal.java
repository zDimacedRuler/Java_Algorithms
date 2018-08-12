package Tree;

public class TreeTraversal {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal of binary tree is ");
        tree.printPreOrder();

        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInOrder();

        System.out.println("\nPostorder traversal of binary tree is ");
        tree.printPostOrder();

        System.out.println("\nHeight of binary tree is:" + tree.getHeight());

        System.out.println("Level order traversal of binary tree is ");
        tree.printLevelOrder();

    }
}
