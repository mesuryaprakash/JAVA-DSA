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
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null || head.next == null) return head;

        ListNode slow = new ListNode();
        ListNode fast = new ListNode();

        slow = head;
        fast = head;

        while(fast != null){
            if(slow.val == fast.val){
                fast = fast.next;
                continue;
            } else {
                slow.next = fast;
                slow = slow.next;
            }
        }

        slow.next = null;
        
        return head;
        
    }
}