class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        while (head!= null && head.val == val){
            head = head.next;
            if(head== null){
                return null;
            }
        }
        
        ListNode dummy = head;
        while(dummy.next != null){
            if(dummy.next.val == val){
                dummy.next = dummy.next.next;
                
            } else {
                dummy = dummy.next;
            }
        }
        return head;
    }
}
