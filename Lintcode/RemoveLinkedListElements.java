/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    /**
     * @param head a ListNode
     * @param val an integer
     * @return a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        // Write your code here
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        
        while(pre.next != null){
            if(pre.next.val == val){
                pre.next = head.next;
                head = head.next;
            }else {
                pre = pre.next;
                head = head.next;
            }
        }
        return dummy.next;
    }
}