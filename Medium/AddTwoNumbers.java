//Leetcode 2 : Add Two Numbers
//Topic : Linked List, Math, Recursion
package Medium;
import common.ListNode;
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode curr=res;
        int carry=0;
        while(l1!=null || l2!= null || carry==1){
            int sum=0;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            sum +=carry;
            carry = sum /10;
            ListNode node = new ListNode(sum % 10);
            curr.next = node;
            curr = curr.next;
        }
        return res.next;
    }
}
