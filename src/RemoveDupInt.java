import java.util.HashMap;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class RemoveDupInt {
	public static int removeDuplicates(int[] nums) {
		SortedSet<Integer> record = new TreeSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			record.add(nums[i]);
		}
		int cur = 0;
		for (Integer i : record) {
			nums[cur++] = i;
		}
		for (int i = cur; i < nums.length; i++) {
			nums[i] = 0;
		}
		return record.size();
	}

	public static void demo() {
		int[] nums = {-3,-1,0,0,0,3,3};
		removeDuplicates(nums);
	}

}
