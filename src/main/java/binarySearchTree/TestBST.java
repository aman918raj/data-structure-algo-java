package binarySearchTree;

public class TestBST {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        System.out.println("--------insert------");
        bst.insert(42);
        bst.insert(38);
        bst.insert(64);
        bst.insert(9);
        bst.insert(52);
        System.out.println("------contains-----");
        System.out.println(bst.contains(38));
        System.out.println(bst.contains(100));

    }
}
