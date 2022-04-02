package com.slavamashkov.problems.leetcode.easy;

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

    /**
     * <h3>104. Maximum Depth of Binary Tree</h3>
     *
     * <p>Given the {@code root} of a binary tree, return <i>its maximum depth</i>.</p>
     *
     * <p>A binary tree's <b>maximum depth</b> is the number of nodes along the longest path from the root node down
     * to the farthest leaf node.</p>
     */

    //Time complexity O(n) because we visit each node only once
    private static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }

    /**
     * <h3>111. Minimum Depth of Binary Tree</h3>
     *
     * <p>Given a binary tree, find its minimum depth.</p>
     *
     * <p>The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.</p>
     *
     * <p><b>Note:</b> A leaf is a node with no children.</p>
     */
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
