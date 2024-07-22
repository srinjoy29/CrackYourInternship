class Solution {
    public boolean isPossible(long a[], long b[], int n, long k) {
        // Sort array a in ascending order
        Arrays.sort(a);
        
        // Sort array b in descending order
        Arrays.sort(b);
        for(int i = 0; i < n / 2; i++) {
            long temp = b[i];
            b[i] = b[n - i - 1];
            b[n - i - 1] = temp;
        }
        
        // Check if the sum of pairs is at least k
        for (int i = 0; i < n; i++) {
            if (a[i] + b[i] < k) {
                return false;
            }
        }
        
        return true;
    }
}