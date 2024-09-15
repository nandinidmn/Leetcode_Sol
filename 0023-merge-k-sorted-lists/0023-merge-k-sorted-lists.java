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
    public ListNode mergek(ListNode[] l,int s,int e){
        if(s==e){return l[s];}
        int m=(s+e)/2;
        ListNode le=mergek(l,s,m);
        ListNode r=mergek(l,m+1,e);
        return merge(le,r);
    }
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode a=new ListNode(0);
        ListNode curr=a;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                curr.next=l1;
                l1=l1.next;
            }else{
                curr.next=l2;
                l2=l2.next;
            }
            curr=curr.next;
        }
        curr.next=(l1!=null)?l1:l2;

        return a.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0){return null;}

        return mergek(lists,0,lists.length-1);
    }
}