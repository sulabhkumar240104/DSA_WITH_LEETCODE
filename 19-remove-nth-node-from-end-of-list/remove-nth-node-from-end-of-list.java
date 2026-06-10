

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node that points to the head
        if(head ==null)
            return null;
        
        ListNode fast = head;
        ListNode slow = head;

        for(int i = 0; i< n ; i++){
            if(fast == null)
                return head;

            fast = fast.next;
        }
        if(fast == null)
            return head.next;
        
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;

        
    }
}
