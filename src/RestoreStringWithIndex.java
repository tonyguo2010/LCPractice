
public class RestoreStringWithIndex {
	public static String restoreString(String s, int[] indices) {
		int len = s.length();
		StringBuilder sb = new StringBuilder();
		char[] ans = new char[len];
		for (int i = 0; i < len; i++) {
			int index = indices[i];
			ans[index] = s.charAt(i);
			// System.out.println(String.format("%d %c", index, ans[index]));
		}
		for (int i = 0; i < len; i++) {
			sb.append(ans[i]);
			// System.out.println(sb.toString());
		}
		return sb.toString();
	}

	public static void demo() {
		int[] ind = { 4, 5, 6, 7, 0, 2, 1, 3 };
		System.out.println(restoreString("codeleet", ind));
	}
}
