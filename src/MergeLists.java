
public class MergeLists {
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode ans = null;
		ListNode tail = null;
		
		
		while(true) {
			if (list1 == null && list2 == null)
				break;
			ListNode cur;
			if (list1 == null) {
				cur = list2;
				list2 = list2.next;
			}
			else if (list2 == null) {
				cur = list1;
				list1 = list1.next;
			}
			else if (list1.val > list2.val) {
				cur = list2;
				list2 = list2.next;
			}
			else {
				cur = list1;
				list1 = list1.next;
			}
			ListNode item = new ListNode();
			item.val = cur.val;
			
			if (ans == null) {
				ans = item;
			} else {
				tail.next = item;
			}
			tail = item;
			
		}
		
		return ans;
	}

	public static void demo() {
		ListNode list1 = new ListNode();
		list1.val = 1;
		ListNode l2 = new ListNode();
		l2.val = 2;
		ListNode l41 = new ListNode();
		l41.val = 4;
		list1.next = l2;
		l2.next = l41;
		outputList(list1);
		
		ListNode list2 = new ListNode();
		list2.val = 1;
		ListNode l3 = new ListNode();
		l3.val = 3;
		ListNode l42 = new ListNode();
		l42.val = 4;
		list2.next = l3;
		l3.next = l42;
		outputList(list2);
		
		ListNode list = mergeTwoLists(list1, list2);
		outputList(list);
	}

	private static void outputList(ListNode list) {
		while (true) {
			if (list == null)
				break;
			System.out.println(list.val);
			list = list.next;
		}
	}

}
