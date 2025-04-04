//https://leetcode.com/problems/remove-element/submissions/1595629868/
public class RemoveElement {

	public static int removeElement(int[] nums, int val) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[count++] = nums[i];
			}
		}
		return count;
	}

	public static void demo() {
		int[] nums = {0,1,2,2,3,0,4,2};
		System.out.println(removeElement(nums, 2));
	}

}
