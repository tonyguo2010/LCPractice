
public class RemoveOuterParentheses {
//	System.out.println(removeOuterParentheses("(()())(())(()(()))"));
	public static String removeOuterParentheses(String s) {
		String result= "";
		int start = 0;
		int count = 0;
		for (int i = 0; i < s.length(); i++){
			char ch = s.charAt(i);
			if (ch == '(')
				count ++;
			else
				count --;
			if (count == 0){
				String sub = s.substring(start + 1, i);
				start = i + 1;
//				System.out.println(sub);
				result += sub;
			}
		}
		return result;
	}

	public static void demo() {
		System.out.println(removeOuterParentheses("(()())(())(()(()))"));
	}
	
	
}
