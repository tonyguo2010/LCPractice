
public class IsPalindrome {

//	System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	public static boolean isPalindrome(String s) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < s.length(); i++	){
			char ch = s.charAt(i);
			if ('a' <= ch && ch <= 'z')
				sb.append(ch);
			if ('A' <= ch && ch <= 'Z')
				sb.append((char) ('a' + (ch - 'A')));
			if ('0' <= ch && ch <= '9')
				sb.append(ch);
		}
		String ori = sb.toString();
		String rev = sb.reverse().toString();
		return (rev.equals(ori));
    }

	public static void demo() {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	}
	
}
