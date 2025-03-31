import java.util.HashMap;

public class LetterToStringPattern {

	public static boolean wordPattern(String pattern, String s) {
		String[] words = s.split(" ");
		if (pattern.length() != words.length)
			return false;
		HashMap<Character, String> up = new HashMap<>();
		HashMap<String, Character> down = new HashMap<>();

		for (int i = 0; i < pattern.length(); i++) {
			char ch = pattern.charAt(i);
			String word = words[i];
			if (up.containsKey(ch) && up.get(ch).equals(word) == false)
				return false;
			up.put(ch, word);
			if (down.containsKey(word) && down.get(word) != ch)
				return false;
			down.put(word, ch);
		}

		return true;
	}

	public static void demo() {
		String p = "abba";
		String s = "apple ball ball apple";
		System.out.println(wordPattern(p, s));
	}
}
