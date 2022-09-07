package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class CountNumberOfNodesBinaryTree {
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


    public static int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        int count = 1 + countNodes(node.left) + countNodes(node.right);
        return count;
    }

    public static int MaxHeightOfBinaryTree(Node node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = 1+MaxHeightOfBinaryTree(node.left);
        int rightHeight = 1+MaxHeightOfBinaryTree(node.right);
        return Math.max(leftHeight, rightHeight);
    }

    public static int sumNodes(Node node) {
        if (node == null) {
            return 0;
        }
        int sum = node.data + sumNodes(node.left) + sumNodes(node.right);
        return sum;
    }

    public static void TraverseLevelOrderBinaryTree(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (queue.peek() != null) {
            if (queue.peek().left != null) {
                queue.add(queue.peek().left);
            }
            if (queue.peek().right != null) {
                queue.add(queue.peek().right);
            }

            System.out.print(queue.poll().data + ",");
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        CountNumberOfNodesBinaryTree tree = new CountNumberOfNodesBinaryTree();
        Node root = tree.BinaryTree(nodes);

        System.out.println("Count of Nodes: " + countNodes(root));
        System.out.println("Sum of Nodes: " + sumNodes(root));
        System.out.println("Height of Binary Tree: " + MaxHeightOfBinaryTree(root));

    }


}
