package Tree;

class BinaryTree {

    Node root;

    BinaryTree() {
        root = null;
    }

    void printPostOrder() {
        printPostOrder(root);
    }

    private void printPostOrder(Node node) {
        if (node == null)
            return;
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.data+" ");
    }

    void printPreOrder() {
        printPreOrder(root);
    }

    private void printPreOrder(Node node) {
        if (node == null)
            return;
        System.out.print(node.data+" ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    void printInOrder() {
        printInOrder(root);
    }

    private void printInOrder(Node node) {
        if (node == null)
            return;
        printInOrder(node.left);
        System.out.print(node.data+" ");
        printInOrder(node.right);
    }

    int getHeight() {
        return height(root);
    }

    private int height(Node node) {
        if (node == null)
            return 0;
        int lHeight = height(node.left);
        int rHeight = height(node.right);
        if (lHeight > rHeight)
            return lHeight + 1;
        return rHeight + 1;
    }

    void printLevelOrder(){
        int height = getHeight();
        for (int i=1;i<=height;i++)
            printLevel(root,i);
    }

    private void printLevel(Node root, int level) {
        if (root==null)
            return;
        if (level==1)
            System.out.print(root.data+" ");
        else{
            printLevel(root.left,level-1);
            printLevel(root.right,level-1);
        }
    }
}

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
