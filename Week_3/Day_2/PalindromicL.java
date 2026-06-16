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
    public boolean isPalindrome(ListNode head) {
         ListNode slow = head;
    Stack<Integer> s = new Stack<>();
    while(slow != null){
        s.push(slow.val);
        slow = slow.next;
    }
     ListNode curr = head;
     while(curr != null){
       
        if(curr.val != s.pop()){
       
            return false;
            
        }
       curr = curr.next;
     }
    return true;
    }
}