class Node {
    String key;
    Node left, right;

    public Node(String item) {
        key = item;
        left = right = null;
    }

}

class BinaryTree {
    Node root;

    BinaryTree(String key) {
        root = new Node(key);
    }

    BinaryTree() {
        root = null;
    }

    public static void main(String[] args) {

    }
}

