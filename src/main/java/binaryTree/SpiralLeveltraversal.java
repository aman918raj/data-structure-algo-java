package binaryTree;

public class SpiralLeveltraversal {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(1);

        bt.root.left = new Node(2);
        bt.root.right = new Node(3);

        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);

        iterateThroughHeight(bt);
    }

    public static void iterateThroughHeight(BinaryTree bt){
        int height = bt.height(bt.root);
        for(int i = 1; i <= height; i++){
            boolean leftToRight = i % 2 == 0;
            spiralTraverse(bt.root, i, 1, leftToRight);
        }
    }

    public static void spiralTraverse(Node node, int i,int currLevel, boolean leftToRight){

        if (node == null) return;

        if(i == currLevel) System.out.println(node.data);

        if(leftToRight){
            spiralTraverse(node.left, i, currLevel+1, leftToRight);
            spiralTraverse(node.right, i, currLevel+1, leftToRight);
        }else{
            spiralTraverse(node.right, i, currLevel+1, leftToRight);
            spiralTraverse(node.left, i, currLevel+1, leftToRight);
        }
    }
}
