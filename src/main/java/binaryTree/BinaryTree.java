package binaryTree;


public class BinaryTree {

    Node root;

    BinaryTree(){
        root = null;
    }

    int height(Node node){

        if(node == null){
            return 0;
        }else{
            int leftDepth = height(node.left);
            int rightDepth = height(node.right);

            if(leftDepth > rightDepth) return leftDepth + 1;
            else return rightDepth + 1;
        }
    }
}

