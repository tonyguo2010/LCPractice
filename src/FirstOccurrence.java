//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/submissions/1595639320/
public class FirstOccurrence {
	public static int strStr(String haystack, String needle) {
		for (int i = 0; i < haystack.length(); i++) {
			int len = needle.length();
			if (len > haystack.length() - i)
				return -1;
			if (haystack.substring(i, i + len).equals(needle))
				return i;
		}
		return -1;
	}

	public static void demo() {
		System.out.println(strStr("leetcode", "leeto"));
	}

}
