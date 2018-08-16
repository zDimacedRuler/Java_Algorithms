package Tree;

public class BinarySearchTree {
    BSTNode root;

    BinarySearchTree() {
        root = null;
    }

    void addElement(int data) {
        BSTNode node = new BSTNode(data);
        if (root == null) {
            root = node;
            return;
        }
        BSTNode temp = root;
        BSTNode prevNode = null;
        while (temp != null) {
            prevNode = temp;
            if (temp.data < node.data)
                temp = temp.right;
            else
                temp = temp.left;
        }
        if (prevNode.data < node.data)
            prevNode.right = node;
        else
            prevNode.left = node;
    }

    void printInOrder() {
        printInOrder(root);
    }

    private void printInOrder(BSTNode node) {
        if (node == null)
            return;
        printInOrder(node.left);
        System.out.print(node.data + " ");
        printInOrder(node.right);
    }


}

class BSTNode {
    int data;
    BSTNode left, right;

    BSTNode(int data) {
        this.data = data;
        left = right = null;
    }
}
