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
        ListNode dum=new ListNode(0);
        dum.next=head;
        ListNode cur=dum;
        while(cur.next!=null && cur.next.next!=null){
            if(cur.next.val==cur.next.next.val){
                int v=cur.next.val;
                while(cur.next!=null && cur.next.val == v){
                    cur.next=cur.next.next;
                }
            }
            else cur=cur.next;
        }
        return dum.next;
    }
}