class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next==null) return head;

        ListNode Current = head;
        while(Current.next != null){
            if(Current.next.val== Current.val){
                Current.next = Current.next.next;
            }
            else{
                Current = Current.next;
            }
        }
        return head;
    }
} 
