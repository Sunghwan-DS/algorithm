package jsh.algorithm.binarytree;

public class BinarySearchTreeCode {

    public static void main(String[] args) {
        binarySearchTreeEx();
    }

    private static void binarySearchTreeEx() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.addNode(new BinarySearchTree.Node<>(3));
        binarySearchTree.addNode(new BinarySearchTree.Node<>(2));
        binarySearchTree.addNode(new BinarySearchTree.Node<>(1));
        binarySearchTree.addNode(new BinarySearchTree.Node<>(4));
        binarySearchTree.addNode(new BinarySearchTree.Node<>(5));

        binarySearchTree.inorderTraversalPrint();
        System.out.println("has 4: " + binarySearchTree.containsNode(new BinarySearchTree.Node<>(4)));
        System.out.println("has 6: " + binarySearchTree.containsNode(new BinarySearchTree.Node<>(6)));
    }

    private static class BinarySearchTree<Integer> {

        Node<Integer> root;

        private void addNode(Node<Integer> node) {
            Node<Integer> current = root;
            if (current == null) {
                root = node;
                return;
            }

            while (true) {
                if (current.data > node.data) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node<>(node.data);
                        break;
                    }
                }

                if (current.data < node.data) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node<>(node.data);
                        break;
                    }
                }

                if (current.data == node.data) {
                    System.out.println("이미 존재하는 데이터입니다. data: " + node.data);
                }
            }
        }

        private void inorderTraversalPrint() {
            Node<Integer> current = root;

            inorderTraversal(current);
        }

        private void inorderTraversal(Node<Integer> node) {
            if (node.left != null) {
                inorderTraversal(node.left);
            }
            System.out.println(node.data);
            if (node.right != null) {
                inorderTraversal(node.right);
            }
        }

        private boolean containsNode(Node<Integer> target) {
            Node<Integer> current = root;

            while (current.data != target.data) {
                if (current.data > target.data) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        return false;
                    }
                }

                if (current.data < target.data) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        return false;
                    }
                }
            }
            return true;
        }


        public static class Node<Integer> {
            int data;
            Node<Integer> left;
            Node<Integer> right;

            public Node(int data) {
                this.data = data;
            }
        }
    }
}
