import java.util.HashMap;

public class RomanToNumber {
	// "MCMXCIV"
	public static int romanToInt(String s) {
    	HashMap<Character, Integer> code = new HashMap<>(); 
    	code.put(' ', 0);
    	code.put('I', 1);
    	code.put('V', 5);
    	code.put('X', 10);
    	code.put('L', 50);
    	code.put('C', 100);
    	code.put('D', 500);
    	code.put('M', 1000);
    	
    	char last = ' ';
    	int all = 0;
    	for (int i = 0; i < s.length(); i++){
    		char current = s.charAt(i);
    		all += code.get(current);
    		if (code.get(last) < code.get(current))
    			all -= 2 * code.get(last);
    		last = current;
    	}
        return all;
    }

	public static void demo() {
		int result = romanToInt("MCMXCIV");
		System.out.println(result);
	}
}
