class Solution {
    public ListNode sortList(ListNode head) {
        // Step 1: Calculate the number of nodes in the list
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        
        // Step 2: Create an array to store node values
        int[] arr = new int[count];
        temp = head;
        count = 0;
        while (temp != null) {
            // Store each node's value in the array
            arr[count++] = temp.val;
            temp = temp.next;
        }
        
        // Step 3: Sort the array of node values
        Arrays.sort(arr);
        
        // Step 4: Update node values with sorted values from the array
        temp = head;
        count = 0;
        while (temp != null) {
            // Update the node's value with the sorted value from the array
            temp.val = arr[count++];
            temp = temp.next;
        }
        
        // Step 5: Return the sorted linked list
        return head;
    }
}
