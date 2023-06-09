public class TestSolution{
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Don't need to consider n > sz

        // Set dummy node to unify opetation
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode rp = head;
        ListNode lp = dummy;
        for (int i = 1; i < n; i++) {
            rp = rp.next;
        }
        while (rp.next != null) {
            rp = rp.next;
            lp = lp.next;
        }

        // delet the node aftet rp
        lp.next = lp.next.next;
        return dummy.next;
        // should we need to delete the node?
    }
}
