package binaryTree;

public class MirrorTree {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(1);

        bt.root.left = new Node(2);
        bt.root.right = new Node(3);

        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);
        mirror(bt.root);
        DepthFirstSearch.preOrderTraversal(bt.root);
    }

    public static void mirror(Node node){

        if(node == null) return;

        mirror(node.left);
        mirror(node.right);
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
    }

}

