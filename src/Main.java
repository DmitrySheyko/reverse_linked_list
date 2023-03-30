public class Main {
    public static void main(String[] args) {
        ListNode ln5 = new ListNode(5);
        ListNode ln4 = new ListNode(4, ln5);
        ListNode ln3 = new ListNode(3, ln4);
        ListNode ln2 = new ListNode(2, ln3);
        ListNode ln1 = new ListNode(1, ln2);
        Solution solution = new Solution();
        ListNode result = solution.reverseList(ln1);
        do {
            System.out.println(result.val);
            result = result.next;
        } while (result != null);
    }
}