package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

class BreadthFirstSearch {

    public static void iterative(Node node) {

        if (node == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node temp = queue.remove();
            System.out.println(temp.data);
            if (temp.left != null) {
                queue.add(temp.left);
            }

            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
    }

    public static void recrusionBFS(Node node, int i, int currlevel) {
        if (node == null) {
            return;
        }

        if (i == currlevel) {
            System.out.println(node.data);
        } else {
            recrusionBFS(node.left, i, currlevel + 1);
            recrusionBFS(node.right, i, currlevel + 1);
        }

    }

    public static void treeTraversal(BinaryTree tree) {
        int maxHeight = tree.height(tree.root);
        for (int i = 1; i <= maxHeight; i++) {
            recrusionBFS(tree.root, i, 1);
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(1);

        bt.root.left = new Node(2);
        bt.root.right = new Node(3);

        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);

        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);

        treeTraversal(bt);
        iterative(bt.root);

    }

}
