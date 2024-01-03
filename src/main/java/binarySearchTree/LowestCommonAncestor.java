package binarySearchTree;

/*
Lowest common ancestor (LCA)

LCA(n1,n2) -> is the lowest node in the tree which as both n1 and n2 as its descendants.
(closest node for both n1 and n2)
we allow LCA = n1, when n2 descendant from n1
 */
public class LowestCommonAncestor {

    public Node lca(Node node, int n1, int n2){

        if (node == null) return null;

        if( n1 > node.data && n2 >  node.data){
            return lca(node.right, n1, n2);
        }

        if( n1 < node.data && n2 < node.data){
            return lca(node.left, n1, n2);
        }
        return node;
    }

    public static void inOrderTraversal(Node node) {
        if (node == null) {
            return;
        }

        if (node.left != null) {
            inOrderTraversal(node.left);
        }

        System.out.println(node.data);

        if (node.right != null) {
            inOrderTraversal(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(8);

        bt.root.left = new Node(2);
        bt.root.right = new Node(10);

        bt.root.left.left = new Node(1);
        bt.root.left.right = new Node(3);

        bt.root.right.left = new Node(9);
        bt.root.right.right = new Node(11);

        inOrderTraversal(bt.root);

        LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();
        Node node = lowestCommonAncestor.lca(bt.root, 1,3);
        System.out.println("LCA of 1 & 3 = " + node.data);
    }
}
