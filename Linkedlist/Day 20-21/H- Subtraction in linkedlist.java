class Solution {
    public Node subLinkedList(Node head1, Node head2) {
      // Step 1: Convert the first linked list to a string
        StringBuilder num1 = new StringBuilder();
        Node current1 = head1;
        while (current1 != null) {
            num1.append(current1.data);
            current1 = current1.next;
        }

        // Step 2: Convert the second linked list to a string
        StringBuilder num2 = new StringBuilder();
        Node current2 = head2;
        while (current2 != null) {
            num2.append(current2.data);
            current2 = current2.next;
        }

        // Step 3: Convert the strings to BigIntegers
        BigInteger bigIntNum1 = new BigInteger(num1.toString());
        BigInteger bigIntNum2 = new BigInteger(num2.toString());

        // Step 4: Perform the subtraction and get the absolute value
        BigInteger result = bigIntNum1.subtract(bigIntNum2).abs();

        // Step 5: Convert the result to a new linked list
        String resultStr = result.toString();
        Node resultHead = new Node(Character.getNumericValue(resultStr.charAt(0)));
        Node currentResult = resultHead;

       for(int i=1;i<resultStr.length();i++){
           currentResult.next=new Node(Character.getNumericValue(resultStr.charAt(i)));
           currentResult = currentResult.next;
       }

        return resultHead;
            
    }
}
