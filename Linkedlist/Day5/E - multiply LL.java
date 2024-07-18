class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        long num1 = 0, num2 = 0;
        long mod = 1000000007;

        while (first != null) {
            num1 = (num1 * 10 + first.data) % mod;
            first = first.next;
        }

        while (second != null) {
            num2 = (num2 * 10 + second.data) % mod;
            second = second.next;
        }

        return (num1 * num2) % mod;
    }
}

//explanation will be done 
// Explanation:
// Node Class: This class represents a node in the linked list with an integer data and a reference to the next node.
// multiplyTwoLists Function:
// num1 and num2 are initialized to 0. These will store the integer values of the two linked lists.
// mod is used to ensure that the numbers do not overflow by keeping them within the range of a long data type.
// We traverse the first linked list, converting it into an integer num1 by shifting the current digits left (multiplying by 10) and adding the new digit. The result is taken modulo mod to prevent overflow.
// Similarly, we traverse the second linked list to convert it into an integer num2.
// Finally, we return the product of num1 and num2, again taking the result modulo mod to ensure it fits within the range of a long data type.