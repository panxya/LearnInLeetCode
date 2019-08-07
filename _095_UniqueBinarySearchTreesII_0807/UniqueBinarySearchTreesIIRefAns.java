package _095_UniqueBinarySearchTreesII_0807;

import java.util.ArrayList;
import java.util.List;

import _094_BinaryTreeInorderTraversal_0807.TreeNode;

public class UniqueBinarySearchTreesIIRefAns {

	public static List<TreeNode> generateTrees(int n) {
		if (n == 0)
			return new ArrayList();
		return genTrees(1, n);

	}

	private static List<TreeNode> genTrees(int start, int end) {
		List<TreeNode> list = new ArrayList<TreeNode>();
		if (start > end) {
			list.add(null);
			return list;
		}

		List<TreeNode> left, right;
		for (int i = start; i <= end; i++) {
			left = genTrees(start, i - 1);
			right = genTrees(i + 1, end);
			for (TreeNode lnode : left) {
				for (TreeNode rnode : right) {
					TreeNode root = new TreeNode(i);
					root.left = lnode;
					root.right = rnode;
					list.add(root);
				}
			}
		}
		return list;
	}
}
