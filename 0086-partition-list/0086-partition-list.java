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
          ListNode smallHead = null, smallTail = null;
        ListNode greatHead = null, greatTail = null;

        ListNode temp = head;

        while (temp != null) {
            ListNode nextNode = temp.next; // save next
            temp.next = null;              // detach

            if (temp.val < x) {
                if (smallHead == null) {
                    smallHead = smallTail = temp;
                } else {
                    smallTail.next = temp;
                    smallTail = temp;
                }
            } else {
                if (greatHead == null) {
                    greatHead = greatTail = temp;
                } else {
                    greatTail.next = temp;
                    greatTail = temp;
                }
            }

            temp = nextNode;
        }

        // Join lists
        if (smallTail != null) {
            smallTail.next = greatHead;
            return smallHead;
        }

        return greatHead;
    }
}