import java.util.Stack;

public class ValidateBrackets {

//	System.out.println(isValid("([)]"));
	public static boolean isValid(String s) {
		boolean result = true;
		
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++){
			char cur = s.charAt(i);
			if (cur == '(' || cur == '[' || cur == '{')
				stack.push(cur);
			else {
				if (stack.size() == 0){
					result = false;
					break;
				}
				char out = stack.pop();
				if (out == '(' && cur != ')') {
					result = false;
					break;
				}
				if (out == '[' && cur != ']') {
					result = false;
					break;
				}
				if (out == '{' && cur != '}') {
					result = false;
					break;
				}
			}
		}
		if (stack.size() > 0)
			result = false;
		return result;
	}

	public static void demo() {
		System.out.println(isValid("([)]"));
	}
	
}
