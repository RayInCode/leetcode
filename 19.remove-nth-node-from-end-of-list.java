/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
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
public class Solution {
     public ListNode removeNthFromEnd(ListNode head, int n) {
         // Don't need to consider n > sz

         // Set dummy node to unify opetation
         ListNode dummy = new ListNode();
         dummy.next = head;
         ListNode rp = head;
         ListNode lp = dummy;
         for(int i = 1; i < n; i++) {
             rp = rp.next;
         }
         while(rp.next != null) {
             rp = rp.next;
             lp = lp.next;
         }
        
         // delet the node aftet rp
         lp.next = lp.next.next;
         return dummy.next;
         // should we need to delete the node?
     }

        // 返回链表的倒数第 k 个节点
//    ListNode findFromEnd(ListNode head, int k) {
//        ListNode p1 = head;
//        // p1 先⾛ k 步
//        for (int i = 0; i < k; i++) {
//        p1 = p1.next;
//        }
//        ListNode p2 = head;
//        // p1 和 p2 同时⾛ n - k 步
//        while (p1 != null) {
//        p2 = p2.next;
//        p1 = p1.next;
//        }
//        // p2 现在指向第 n - k + 1 个节点，即倒数第 k 个节点
//        return p2;
//    }
//
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        // 虚拟头结点
//        ListNode dummy = new ListNode(-1);
//        dummy.next = head;
//        // 删除倒数第 n 个，要先找倒数第 n + 1 个节点
//        ListNode x = findFromEnd(dummy, n + 1);
//        // 删掉倒数第 n 个节点
//        x.next = x.next.next;
//        return dummy.next;
//    }
}
// @lc code=end

