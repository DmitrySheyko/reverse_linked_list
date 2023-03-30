class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = new ListNode(head.val, null);
        while (head.next != null) {
            head = head.next;
            newHead = new ListNode(head.val, newHead);
        }
        return newHead;
    }
}