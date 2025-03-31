
public class LongestCommonPrefix {

	// String[] inputs = {"a"};
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String record = strs[0];
        for (String s : strs){
        	while (true){
        		if (s.startsWith(record) == false){
        			record = record.substring(0, record.length() - 1);
        		}
        		else break;
        	}
        }
        return record;
    }

	public static void demo() {
		String[] inputs = {"a"};
		System.out.println(longestCommonPrefix(inputs));
	}
}
