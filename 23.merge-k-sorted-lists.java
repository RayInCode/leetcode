/*
 * @lc app=leetcode id=23 lang=java
 *
 * [23] Merge k Sorted Lists
 */

// @lc code=start

import java.util.PriorityQueue;

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
    public ListNode mergeKLists(ListNode[] lists) {
        // check args
        if(lists == null || lists.length == 0)   return null;

        // set up return value
        ListNode dummy = new ListNode();
        ListNode ptr = dummy;

        // build up the priority queue
        // notice: some elements in lists may be null
        PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length, (a, b)->(a.val - b.val));
        for(int i = 0; i < lists.length; i++) {
            if(lists[i] != null)
                pq.add(lists[i]);
        }

        // loop for pop current minimum node
        /* notice:
         *      one of the list is out
         *      all of the lists is out
         */
        while(!pq.isEmpty()) {
            ptr.next = pq.poll();
            ptr = ptr.next;
            if(ptr.next != null) pq.add(ptr.next);
        }

        return dummy.next;
    }
}
// @lc code=end

