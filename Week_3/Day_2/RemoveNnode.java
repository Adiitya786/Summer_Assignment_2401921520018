package Week_3.Day_2;
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = new ListNode( 0,head);
        int size =0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        int idx = size-n;
        int i =0;
        ListNode prev = res;
        while(i<idx){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return res.next;
    }
}