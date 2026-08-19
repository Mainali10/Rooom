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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode d= new ListNode(0);
        ListNode c =d;
        int crr=0;
        while(l1!=null || l2!=null || crr!=0){
            int x=(l1!=null) ? l1.val :0;
            int y=(l2!=null) ? l2.val :0;
            int sum= x + y+ crr;
            int dig =sum % 10;
            crr=sum / 10;
            c.next = new ListNode(dig);
            c = c.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return d.next;
        }
    }
        
    
