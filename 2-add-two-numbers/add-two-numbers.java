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
        
        if(l1==null) {
            return l2;
        }
        if(l2==null) {
            return l1;
        }
        
        ListNode ansHead=null;
        ListNode ansTail=null;
        int sum=0,rem=0,carry=0;
        while(l1!=null && l2!=null) {
            sum=l1.val+l2.val+carry;
            rem=sum%10;
            carry=sum/10;
            
            if(ansHead==null) {
                ListNode newNode=new ListNode(rem);
                ansHead=newNode;
                ansTail=newNode;
            }else {
                ListNode newNode=new ListNode(rem);
                ansTail.next=newNode;
                ansTail=newNode;
            }
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null) {
            sum=carry+l1.val;
            rem=sum%10;
            carry=sum/10;
            
            ListNode newNode=new ListNode(rem);
            ansTail.next=newNode;
            ansTail=newNode;
            
            l1=l1.next;
            
        }
        while(l2!=null) {
            sum=carry+l2.val;
            rem=sum%10;
            carry=sum/10;
            
            ListNode newNode=new ListNode(rem);
            ansTail.next=newNode;
            ansTail=newNode;
            
            l2=l2.next;
        }
        if(carry>0) {
            ListNode newNode=new ListNode(carry);
            ansTail.next=newNode;
            ansTail=newNode;
        }
        return ansHead;
    }
}