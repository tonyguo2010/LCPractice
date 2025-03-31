class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
};

public class TrimBST {
	public static TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) return null;
        
        if (root.val < low){
        	return trimBST(root.right, low, high);
        }
        if (root.val > high){
        	return trimBST(root.left, low, high);
        }
        
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        
        return root;
    }

	public static void demo() {
		TreeNode one = new TreeNode(1, null, null);
		TreeNode two = new TreeNode(2, one, null);
		TreeNode zero = new TreeNode(0, null, two);
		TreeNode four = new TreeNode(4, null, null);
		
		TreeNode root = new TreeNode(3, zero, four);
		System.out.println(trimBST(root, 1, 3));
	}
}
