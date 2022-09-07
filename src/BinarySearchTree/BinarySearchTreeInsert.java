package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeInsert {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
// int[] nodes = {1, 2, 4, 5,7,-1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
    public static Node BinarySearchTreeInsert(Node root, int val) {

        if(root == null){
            root = new Node(val);
            return root;
        }

        if(val > root.val){
            root.right = BinarySearchTreeInsert(root.right , val);
        } else {
            root.left = BinarySearchTreeInsert(root.left, val);
        }
        return root;
    }


    public static void TraverseInOrderBinaryTree(Node node) {
        if (node == null) {
            return;
        }
        TraverseInOrderBinaryTree(node.left);
        System.out.print(node.val + ",");
        TraverseInOrderBinaryTree(node.right);
        return;
    }





    public static void main(String[] args) {
        int[] nodes = {5,1,3,4,2,7};
        Node root = null;

        for(int i=0;i<nodes.length;i++){
            root = BinarySearchTreeInsert(root,nodes[i]);
        }

        TraverseInOrderBinaryTree(root);
    }


}
