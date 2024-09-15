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
    public ListNode mergeKLists(ListNode[] lists) {
        Queue<ListNode> q=new PriorityQueue<ListNode> ((a,b)->a.val-b.val);
        for(ListNode l:lists){
           if(l!=null){
            q.add(l);
           }
        }
        ListNode h=new ListNode(0);
        ListNode point=h;
        while(!q.isEmpty()){
          point.next=q.poll();
          point=point.next;
          if(point.next!=null){
            q.add(point.next);
          }
        }
        return h.next;
    }
}