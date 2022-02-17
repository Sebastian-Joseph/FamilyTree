public class BinaryFamilyTree {


    public static class Node {
        String data;
        Node left;
        Node right;
        int id;

        public Node(String data, int id) {
            this.data = data;
            this.left = null;
            this.right = null;
            this.id = id;

        }


        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public String getData() {
            return data;
        }

        public static void run() {

            Node root = new Node("Sebastian", 100);
            insert(root, "Mom", 110);
            insert(root, "Dad", 50);

            insert(root, "Grandma (Mom)",111);
            insert(root, "Grandpa (Mom)", 109);

            insert(root, "Great-Grandma (Mom)", 112);
            insert(root, "Great-Grandpa (Mom)", 108);
            

            insert(root, "Grandma (Dad)", 51);
            insert(root, "Grandpa (Dad)", 49);


            insert(root, "Great-Grandma (Dad)", 52);
            insert(root, "Great-Grandpa (Dad)", 48);


            Node.traverseInOrder(root);


        }



        public static void insert(Node node, String data, int id) {

            if (id < node.id) {
                if (node.left != null) {
                    insert(node.left, data, id);
                } else {
                    System.out.println("Inserted " + data + " to left of " + node.data); node.left = new Node(data, id);
                }
            } else if (id > node.id) {
                if (node.right != null) {
                    insert(node.right, data, id);
                } else {
                    System.out.println("Inserted " + data + " to right of " + node.data);
                    node.right = new Node(data, id);
                }
            }


        }

        public static void traverseInOrder(Node node) {
            if (node == null) {
                return;
            }

            traverseInOrder(node.left);
            System.out.printf("%s ", node.data);
            traverseInOrder(node.right);
        }

        }



    public static void main(String[] args) {
        Node.run();
    }
}