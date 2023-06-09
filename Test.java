public class Test {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode p = head;
        for(int i = 2; i < 6; i++) {
            p.next = new ListNode(i);
            p = p.next;
        }
        TestSolution s = new TestSolution();
        ListNode res = s.removeNthFromEnd(head, 2);
    }
}
