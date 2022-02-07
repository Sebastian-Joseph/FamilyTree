public class BinaryFamilyTree {

    public static class Node {
        String data;
        Node left;
        Node right;

        public Node(String data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }



        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public static void run() {
           Node root = new Node("Sebastian Joseph");
            insert(root, "Momma Joseph");
            insert(root, "Papa Joseph");

        }

        public static void insert(Node node, String data) {
            if (data != node.data) {
                if (node.left != null) {
                    insert(node.left, data);
                } else {
                    System.out.println(" Inserted " + data + " to the left of Node " + node.data);
                    node.left = new Node(data);
                }
            } else if (data != node.data) {
                if (node.right != null) {
                    insert(node.right, data);
                } else {
                    System.out.println(" Inserted " + data + " to the right of Node " + node.data);
                    node.right = new Node(data);
                }
            }
        }

    }

    public static void main(String[] args) {
        Node.run();
    }
}
