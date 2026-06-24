/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        ListNode dummy = new ListNode(-1);
        ListNode l = dummy;

        while (list1 != null && list2 != null) {
            ListNode newnode;
            if (list1.val <= list2.val) {
                newnode = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                newnode = new ListNode(list2.val);
                list2 = list2.next;
            }
            l.next = newnode;
            l = l.next;
        }

        if (list1 != null) {
            l.next = list1;
        }

        if (list2 != null) {
            l.next = list2;
        }
        return dummy.next;
    }
}