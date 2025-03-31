import java.util.ArrayList;
import java.util.List;

public class Trives {

	// ababcbacadefegdehijhklij
	// Group it to ababcbaca defegde hijhklij
	public static List<Integer> partitionLabels(String s) {
		List<Integer> result = new ArrayList<>();
        int[] familiyOldest = new int[26]; // For 'a' to 'z'
        
        for (int i = 0; i < s.length(); i ++	){
        	familiyOldest[s.charAt(i) - 'a'] = i;
        }
        
        int chief = 0;
        int trive = 0;
        for (int i = 0; i < s.length(); i ++	){
        	chief = Math.max(chief, familiyOldest[s.charAt(i) - 'a']);
        	
        	if (i == chief){
        		result.add(i - trive + 1);
        		trive = i + 1;
        	}
        }
        
        return result;
	}

	public static void demo() {
		List<Integer> result = partitionLabels("ababcbacadefegdehijhklij");
		System.out.println(result);
	}
	
}
