package BinaryTreesyt;

import java.util.LinkedList;
import java.util.Queue;

import Circular.Node;

public class binaryTree {
        static class Node{
        int data;
        Node left;
        Node right;

        
        Node(int data){
            this.data= data;
            this.left = null;
            this.right= null;
        }
    }
    static class BinaryTree{
        static int idx =-1;
        public static Node buildTree(int node[]){
             idx++;
             if(node[idx] ==-1){
                return null;
             }
             Node newNode = new Node(node[idx]);

             newNode.left = buildTree(node);
             newNode.right = buildTree(node);

             return newNode;
        }
    }
        public static void preOrder(Node root){
            if(root== null){
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void inOrder(Node root){
            if(root== null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
        public static void postOrder(Node root){
            if(root== null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
        public static void levelOrder(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node curNode = q.remove();
                if (curNode == null) {
                    System.out.println();

                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(curNode.data+" ");
                    if (curNode.left != null) {
                        q.add(curNode.left);
                    }
                    if (curNode.right != null ) {
                        q.add(curNode.right);
                    }
                }
            }
        }
        public static int countOfNodes(Node root){
            if(root == null){
                return 0;
            }
            int leftNodes = countOfNodes(root.left);
            int rightNodes = countOfNodes(root.right);

            return leftNodes + rightNodes +1;
        }
        //sum of binary tree
        public static int sumOfNodes(Node root) {
            if(root == null) {
                return 0;
            }
     
     
            int leftSum = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);
            return leftSum + rightSum + root.data;
        }
        public static int height(Node root) {
            if(root == null) {
                return 0;
            }
     
     
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            int myHeight = Math.max(leftHeight, rightHeight)+1;
            return myHeight;
        }

        public static void diameter(){

        }
        public static void main(String[] args) {
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        // System.out.println(root.data);
        // preOrder(root);
        // inOrder(root);
        // postOrder(root);
        // levelOrder(root);
        // System.out.println(countOfNodes(root));
        // System.out.println(levelOrder(root));
        // System.out.println(sumOfNodes(root));
        // System.out.println(height(root));
        
    }
}
