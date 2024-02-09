package binarytree;

public class BinaryTree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    public BinaryTree() {
        root = null;
    }

    // Method to insert a new node in the binary tree
    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    // Recursive method to insert a new node in the binary tree
    public Node insertRecursive(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRecursive(root.left, data);
        } else if (data > root.data) {
            root.right = insertRecursive(root.right, data);
        }

        return root;
    }

    // Method to perform an inorder traversal of the binary tree
    public void inorder() {
        inorderRecursive(root);
    }

    // Recursive method to perform an inorder traversal of the binary tree
    public void inorderRecursive(Node root) {
        if (root != null) {
            inorderRecursive(root.left);
            System.out.print(root.data + " ");
            inorderRecursive(root.right);
        }
    }

    // Method to perform a preorder traversal of the binary tree
    public void preorder() {
        preorderRecursive(root);
    }

    // Recursive method to perform a preorder traversal of the binary tree
    public void preorderRecursive(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRecursive(root.left);
            preorderRecursive(root.right);
        }
    }

    // Method to perform a postorder traversal of the binary tree
    public void postorder() {
        postorderRecursive(root);
    }

    // Recursive method to perform a postorder traversal of the binary tree
    public void postorderRecursive(Node root) {
        if (root != null) {
            postorderRecursive(root.left);
            postorderRecursive(root.right);
            System.out.print(root.data + " ");
        }
    }
}
