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
    public ListNode reverseKGroup(ListNode head, int k) {
       if (head == null || k <= 1) return head;

    ListNode curr = head;
    ListNode temp = head;
    ListNode prev = null;
    ListNode next = null;

    ListNode prevGroupTail = null;
    boolean firstGroup = true;

    int counter = 1;

    while (temp != null) {

        if (counter != k) {
            counter++;
            temp = temp.next;
        } 
        else {
            ListNode groupStart = curr;
            temp = temp.next;

            prev = null;
            next = null;

            while (curr.next != temp) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            curr.next = prev;

            if (firstGroup) {
                head = curr;
                firstGroup = false;
            }

            if (prevGroupTail != null) {
                prevGroupTail.next = curr;
            }

            prevGroupTail = groupStart;

            counter = 1;
            curr = temp;
        }
    }

    
    if (prevGroupTail != null) {
        prevGroupTail.next = curr;
    }

    return head;   
    }
}