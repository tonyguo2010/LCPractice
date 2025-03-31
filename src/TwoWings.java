import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TwoWings {
	
//	int[] nums = {1,2,3,4}; 
	public static int[] productExceptSelf(int[] inputs) {
		int[] output = new int[inputs.length];
		
		int left = 1;
		output[0] = 1;
		for (int i = 1; i < inputs.length; i ++){
			left *= inputs[i - 1];
			output[i] = left;
		}
		
		int right = 1;
		for (int i = inputs.length - 2; i >= 0; i --){
			right *= inputs[i+1];
			output[i] *= right;
		}
		return output;
	}

	public static void demo() {
		int[] nums = {1,2,3,4};
		int[] result = productExceptSelf(nums);
		System.out.println(Arrays.stream(result).boxed().collect(Collectors.toList()));
	}
}
