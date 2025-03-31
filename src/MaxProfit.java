
public class MaxProfit {
//	int[] price = { 7, 1, 5, 3, 6, 4 };
	public static int maxProfit(int[] prices) {
		int start = 0;
		int end = 0;
		int record = 0;
		
		for (int i = 0; i < prices.length; i++){
			if (prices[i] < prices[start])
				start = i;
			
			int cur = prices[i] - prices[start];
			
			if (cur > record){
				record = cur;
				end = i;
			}
		}
		return prices[end] - prices[start];
	}

	public static void demo() {
		int[] price = { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(price));
	}

}
