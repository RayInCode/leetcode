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
        ListNode lp = ldummy, rp = rdummy;
        ListNode p = head;

        while(p != null) {
            if(p.val < x) {
                lp.next = p;
                lp = lp.next;
            }else {
                rp.next = p;
                rp = rp.next;
            }
            p = p.next;
        }
        
        /*  !!! without this statement, there may be a cycle 
            in the result when the last node in the orginial 
            list is less than x, because the last rnode would
            point to the last node in the left list*/ 
        rp.next = null;
        
        // another advantage of dummy node when we need to return head node of a list
        lp.next = rdummy.next;
        return ldummy.next;
    }
}
// @lc code=end

