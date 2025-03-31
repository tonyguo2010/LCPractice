import java.util.Stack;

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
};

public class ListAsNumberCalculation {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode result = null;
    	Stack<Integer> s1 = new Stack<>();
    	ListNode cur = l1;
    	while (true){
    		if (cur == null)
    			break;
    		s1.add(cur.val);
    		cur = cur.next;
    	}
    	
    	Stack<Integer> s2 = new Stack<>();
    	cur = l2;
    	while (true){
    		if (cur == null)
    			break;
    		s2.add(cur.val);
    		cur = cur.next;
    	}

    	Stack<Integer> results = new Stack<>();
    	int over = 0;
    	while (true){
    		int left = 0;
    		int right = 0;
    		if (s1.size() == 0 && s2.size() == 0) break;
    		if (s1.size() > 0)
    			left = s1.pop();
    		if (s2.size() > 0)
    			right = s2.pop();
//    		System.out.println(String.format("%d + %d\n", left, right));
    		results.add((left + right + over) % 10);
    		over = (left + right + over) / 10;
//    		System.out.println(over);
    	}
    	if (over > 0)
    		results.add(over);
    	
//    	System.out.println(results);
    	ListNode last = null;
    	while (results.size() > 0){
    		int digit = results.pop();
//    		System.out.println(digit);
    		if (last == null){
    			result = new ListNode(digit);
    			last = result;
    		}
    		else{
    			last.next = new ListNode(digit);
    			last = last.next;
    		}
    			
    	}
    	return result;
    }

	public static void demo() {

		ListNode seven1 = new ListNode(7);
		ListNode two1 = new ListNode(2);
		ListNode four1 = new ListNode(4);
		ListNode three1 = new ListNode(3);
		
		seven1.next = two1;
		two1.next = four1;
		four1.next = three1;
	
		ListNode five2 = new ListNode(5);
		ListNode six2 = new ListNode(6);
		ListNode four2 = new ListNode(4);
	
		five2.next = six2;
		six2.next = four2;
//		ListNode seven1 = new ListNode(1);
//	
//		ListNode five2 = new ListNode(9);
//		ListNode six2 = new ListNode(9);
	
		five2.next = six2;
		
//		System.out.println(addTwoNumbers(seven1, five2));
		ListNode ans = addTwoNumbers(seven1, five2);
		ListNode cur = ans;
		while (cur != null){
			System.out.println(cur.val);
			cur = cur.next;
		}
		
	}
}
