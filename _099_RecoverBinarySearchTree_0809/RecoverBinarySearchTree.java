package _099_RecoverBinarySearchTree_0809;

import _094_BinaryTreeInorderTraversal_0807.TreeNode;

public class RecoverBinarySearchTree {
	public void recoverTree(TreeNode root) {
		TreeNode pre = null;
		TreeNode first = null, second = null;
		TreeNode temp = null;
		while (root != null) {
			if (root.left != null) {
				temp = root.left;
				while (temp.right != null && temp.right != root) {
					temp = temp.right;
				}
				if (temp.right != null) {
					if (pre != null && pre.val > root.val) {
						if (first == null) {
							first = pre;
							second = root;
						} else {
							second = root;
						}
					}
					pre = root;
					temp.right = null;
					root = root.right;
				} else {
					temp.right = root;
					root = root.left;
				}
			} else {
				if (pre != null && pre.val > root.val) {
					if (first == null) {
						first = pre;
						second = root;
					} else {
						second = root;
					}
				}
				pre = root;
				root = root.right;
			}
		}
		if (first != null && second != null) {
			int t = first.val;
			first.val = second.val;
			second.val = t;
		}
	}

}
