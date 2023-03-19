/*
 * @lc app=leetcode id=86 lang=java
 *
 * [86] Partition List
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
    public ListNode partition(ListNode head, int x) {
        ListNode ldummy = new ListNode();
        ListNode rdummy = new ListNode();
        ListNode lnode = ldummy;
        ListNode rnode = rdummy;

        while(head != null) {
            if(head.val < x) {
                lnode.next = head;
                lnode = lnode.next;
            }else {
                rnode.next = head;
                rnode = rnode.next;
            }
            head = head.next;
        }
        
        /*  !!! without this statement, there may be a cycle 
            in the result when the last node in the orginial 
            list is less than x, because the last rnode would
            point to the last node in the left list*/ 
        rnode.next = null;   
        lnode.next = rdummy.next;
        return ldummy.next;
    }
}
// @lc code=end

