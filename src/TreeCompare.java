public class TreeCompare {
//	class TreeNode {
//	    int val;
//	    TreeNode left;
//	    TreeNode right;
//	    TreeNode() {}
//	    TreeNode(int val) { this.val = val; }
//	    TreeNode(int val, TreeNode left, TreeNode right) {
//	        this.val = val;
//	        this.left = left;
//	        this.right = right;
//	    }
//	};
	static public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null)
			return true;
		if (p == null || q == null)
			return false;
		if (p.val != q.val)
			return false;
		// here p.val == q.val
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}
	public static void demo() {
		TreeNode left = new TreeNode();
		left.val = 2;
		left.left = new TreeNode();
		left.left.val = 1;
		left.right = new TreeNode();
		left.right.val = 3;

		TreeNode right = new TreeNode();
		right.val = 2;
		right.left = new TreeNode();
		right.left.val = 1;
		right.right = new TreeNode();
		right.right.val = 2;
		
		System.out.println(isSameTree(left, right));
}
}
