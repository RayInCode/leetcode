/*
 * @lc app=leetcode id=876 lang=java
 *
 * [876] Middle of the Linked List
 */

// @lc code=start
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
    // notice: number of nodes is singular or plural, edge case 1 or 2
    public ListNode middleNode(ListNode head) {
        // set up return value and process variable
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode sptr = dummy;
        ListNode fptr = dummy;

        while(fptr != null && fptr.next != null){
            sptr = sptr.next;
            fptr = fptr.next.next;
        }

        if(fptr == null)
            return sptr;
        else
            return sptr.next;
    }
}
// @lc code=end

