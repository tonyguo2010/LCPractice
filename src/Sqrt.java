
public class Sqrt {

	// https://leetcode.com/problems/sqrtx/description/
	public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        
        int left = 1;
        int right = x;
        int result = 0;
        
        // binary search to locate root
        while (true){
        	if (left > right)
        		break;
        	int mid = (left + right) / 2;
        	if (mid <= x / mid){ // keep the upper half
        		left = mid + 1;
        		result = mid; 
        	} else { // keep the lower half
        		right = mid - 1;
        	}
        }
        
        return result;
    }
	
	public static void demo() {
		System.out.println(mySqrt(3));
	}

}
