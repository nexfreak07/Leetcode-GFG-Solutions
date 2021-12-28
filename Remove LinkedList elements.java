
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val)
            head = head.next; // Delete if 1st num is val, delete by moving the head
        
        ListNode curr = head;
        while(curr!=null && curr.next!=null)
        {
            if(curr.next.val == val) //IMP Check next Node Being Current Node
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }
        return head;
    }
}