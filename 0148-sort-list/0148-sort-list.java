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
    public static ListNode merge(ListNode left,ListNode right){
        ListNode head=new ListNode(0);
        ListNode temp=head;
        while(left!=null && right!=null){
            if(left.val<right.val){
                temp.next=left;
                left=left.next;
            }else{
                temp.next=right;
                right=right.next;
            }
            temp=temp.next;
        }
        if(left!=null){
            temp.next=left;
            left=left.next;
        }
        if(right!=null){
            temp.next=right;
            right=right.next;
        }
        return head.next;
    }
    public static ListNode findmid(ListNode head){
        ListNode s=head;
        ListNode f=head;
        if(head==null||head.next==null){
            return head;
        }
        f=f.next;
        while(f!=null && f.next!=null){
          s=s.next;
          f=f.next.next;
        }
        ListNode m=s.next;
        s.next=null;
        return m;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=findmid(head);
        ListNode l=sortList(head);
        ListNode r=sortList(mid);

        ListNode newHead =merge(l,r);
        return newHead;
    }
}