import java.util.ArrayList;
import java.util.Collections;

class Tree {
    // Nested Node class for the binary search tree
    static class Node {
        int data;
        Node left, right;

        // Constructor to create a new node with given data
        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    // Method to find the median of the values in a BST
    public static float findMedian(Node root) {
        // List to store the values of nodes during in-order traversal
        ArrayList<Integer> nodes = new ArrayList<>();
        // Perform in-order traversal and populate the list with node values
        inOrderTraversal(root, nodes);

        // Number of nodes in the list
        int n = nodes.size();
        if (n == 0) {
            // Handle the case where the tree is empty
            throw new IllegalStateException("Tree is empty");
        }

        // Sort the list to ensure values are in order
        Collections.sort(nodes);

        // Compute median based on whether the number of nodes is odd or even
        if (n % 2 == 0) {
            // If even number of elements, median is the average of the two middle values
            int mid1 = nodes.get(n / 2 - 1);
            int mid2 = nodes.get(n / 2);
            return (float) (mid1 + mid2) / 2;
        } else {
            // If odd number of elements, median is the middle value
            return nodes.get(n / 2);
        }
    }

    // In-order traversal method that populates the nodes list
    private static void inOrderTraversal(Node root, ArrayList<Integer> nodes) {
        if (root != null) {
            // Recursively traverse the left subtree
            inOrderTraversal(root.left, nodes);
            // Add the value of the current node to the list
            nodes.add(root.data);
            // Recursively traverse the right subtree
            inOrderTraversal(root.right, nodes);
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Create a sample binary search tree
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);
        root.left.left = new Node(1);
        root.left.right = new Node(7);
        root.right.left = new Node(15);
        root.right.right = new Node(25);

        // Calculate and print the median of the BST
        System.out.println("Median: " + findMedian(root));
    }
}
