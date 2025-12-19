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

    static ListNode addLast(ListNode head, int val) {
        ListNode newNode = new ListNode(val);

        if (head == null) return newNode;

        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    static int size(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    static ListNode getNodeAtIndex(ListNode head, int index) {
        int i = 0;
        while (i < index && head != null) {
            head = head.next;
            i++;
        }
        return head;
    }

    public void reorderList(ListNode head) {

        if (head == null || head.next == null) return;

        int n = size(head);

        int left = 0;
        int right = n - 1;

        ListNode newHead = null;

        // build folded list
        while (left <= right) {

            ListNode leftNode = getNodeAtIndex(head, left);
            newHead = addLast(newHead, leftNode.val);

            if (left != right) {
                ListNode rightNode = getNodeAtIndex(head, right);
                newHead = addLast(newHead, rightNode.val);
            }

            left++;
            right--;
        }

        // copy folded list back to original list
        ListNode t1 = head;
        ListNode t2 = newHead;

        while (t1 != null && t2 != null) {
            t1.val = t2.val;
            t1 = t1.next;
            t2 = t2.next;
        }
    }
}
