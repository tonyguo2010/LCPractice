import java.util.ArrayList;
import java.util.List;


public class PascalTriangle {
    public static List<Integer> getRow(int rowIndex) {
    	if (rowIndex <= 0) {
    		List<Integer> ans = new ArrayList<Integer>();
    		ans.add(1);
    		return ans;
    	}
    		
        List<Integer> prev = getRow(rowIndex - 1);
//        System.out.println(prev);
        List<Integer> current = new ArrayList<Integer>();
        
        current.add(1);
        for (int i = 0; i < prev.size() - 1; i++) {
        	current.add(prev.get(i) + prev.get(i + 1));
        }
        current.add(1);
        
        return current;
    }
	public static void demo() {
		System.out.println(getRow(4));
	}

}
