package binarySearchTree;

public class BinarySearchTree {

    Node root;

    BinarySearchTree() {
        this.root = null;
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (this.root == null) {
            this.root = newNode;
        }
        Node temp = this.root;
        while (true) {
            if (value == temp.value) return false;

            if (value > temp.value) {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            } else {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            }
        }
    }

    public boolean contains(int value){
        if (this.root == null) return false;
        Node temp = this.root;
        while (temp != null){
            if (value > temp.value) {
                temp = temp.right;
            }else if (value < temp.value) {
                temp = temp.left;
            }else {
                return true;
            }
        }
        return false;
    }
}
