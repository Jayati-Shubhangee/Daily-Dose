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
    public static ListNode getNodeAt(ListNode head, int index) {
     ListNode temp = head;
        int i = 0;
        while (temp != null && i < index) {
            temp = temp.next;
            i++;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
     /*  if (head == null || k <= 1) return head;

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

    return head; */
    if (head == null || k <= 1) return head;

    // Step 1: find size
    int size = 0;
    ListNode temp = head;
    while (temp != null) {
        size++;
        temp = temp.next;
    }

    int start = 0;

    // Step 2: process each k-group
    while (start + k <= size) {

        int left = start;
        int right = start + k - 1;

        // reverse data inside group
        while (left < right) {
            ListNode leftNode = getNodeAt(head, left);
            ListNode rightNode = getNodeAt(head, right);

            // swap data
            int swap = leftNode.val;
            leftNode.val = rightNode.val;
            rightNode.val = swap;

            left++;
            right--;
        }

        start = start + k;
    }

    return head;
}  
    }