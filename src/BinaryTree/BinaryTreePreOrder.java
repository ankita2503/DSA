package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreePreOrder {
    static int idx = -1;

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
// int[] nodes = {1, 2, 4, 5,7,-1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
    public static Node BinaryTree(int[] nodes) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }

        Node newNode = new Node(nodes[idx]);
        newNode.left = BinaryTree(nodes);
        newNode.right = BinaryTree(nodes);

        return newNode;
    }

    public static void TraversePreOrderBinaryTree(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + ",");
        TraversePreOrderBinaryTree(node.left);
        TraversePreOrderBinaryTree(node.right);
        return;
    }

    public static void TraverseInOrderBinaryTree(Node node) {
        if (node == null) {
            return;
        }
        TraverseInOrderBinaryTree(node.left);
        System.out.print(node.data + ",");
        TraverseInOrderBinaryTree(node.right);
        return;
    }

    public static void TraversePostOrderBinaryTree(Node node) {
        if (node == null) {
            return;
        }
        TraversePostOrderBinaryTree(node.left);
        TraversePostOrderBinaryTree(node.right);
        System.out.print(node.data + ",");
        return;
    }

    public static void TraverseLevelOrderBinaryTree(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (queue.peek() != null) {
            if(queue.peek().left!=null){
                queue.add(queue.peek().left);
            }
            if(queue.peek().right!=null){
                queue.add(queue.peek().right);
            }

            System.out.print(queue.poll().data + ",");
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTreePreOrder tree = new BinaryTreePreOrder();
        Node root = tree.BinaryTree(nodes);
        System.out.print("PreOrder traversal :");
        TraversePreOrderBinaryTree(root);
        System.out.println();
        System.out.print("InOrder traversal :");
        TraverseInOrderBinaryTree(root);
        System.out.println();
        System.out.print("PostOrder traversal :");
        TraversePostOrderBinaryTree(root);
        System.out.println();
        System.out.print("LevelOrder traversal :");
        TraverseLevelOrderBinaryTree(root);
    }


}
