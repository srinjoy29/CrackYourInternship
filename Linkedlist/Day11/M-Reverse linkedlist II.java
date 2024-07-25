class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right)
        {
            return head;
        }
        ListNode cur=head;
        ListNode prev=null;
        for(int i=0;cur!=null&&i<left-1;i++)
        {
            prev=cur;
            cur=cur.next;
        }
        ListNode last=prev;
        ListNode end=cur;
        ListNode Next=cur.next;
        for(int i=0;cur!=null&&i< right-left+1;i++)
        {
            cur.next=prev;
            prev=cur;
            cur=Next;
            if(cur!=null)
            {
            Next=Next.next;
            }


        }
        if(last!=null)
        {
            last.next=prev;
        }
        else{
            head=prev;
        }
        end.next=cur;
        return head;







        
    }
}