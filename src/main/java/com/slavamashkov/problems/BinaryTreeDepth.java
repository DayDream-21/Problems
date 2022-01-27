package com.slavamashkov.problems;

public class BinaryTreeDepth {
    public static void main(String[] args) {
        TreeNode node2_1 = new TreeNode(15);
        TreeNode node2_2 = new TreeNode(7);

        TreeNode node1 = new TreeNode(9, null, null);
        TreeNode node2 = new TreeNode(20, node2_1, node2_2);

        TreeNode root = new TreeNode(3, node1, node2);

        System.out.printf("Max depth: %d%n", maxDepth(root));
        System.out.printf("Min depth: %d%n", minDepth(root));
    }

    //Time complexity O(n) because we visit each node only once
    private static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }

    private static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        if (left == 0 || right == 0) {
            return Math.max(left, right) + 1;
        }

        return Math.min(left, right) + 1;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) { this.val = val; }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
