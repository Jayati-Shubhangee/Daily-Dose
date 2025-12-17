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
    public ListNode deleteDuplicates(ListNode head) {
         if (head == null) return null;

    ListNode temp1 = head;        // last unique node
    ListNode temp2 = head.next;  // scanning pointer

    while (temp2 != null) {
        if (temp1.val== temp2.val) {
            // duplicate → just move temp2
            temp2 = temp2.next;
        } else {
            // new unique value found
            temp1.next = temp2;
            temp1 = temp2;
            temp2 = temp2.next;
        }
    }

    // very important: terminate list
    temp1.next = null;

    return head;
    }
}