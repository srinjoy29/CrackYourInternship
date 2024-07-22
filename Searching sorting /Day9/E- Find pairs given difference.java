class Solution {
    public int findPair(int n, int x, int[] arr) {
        // code here

        //brute force approach TLE
        Arrays.sort(arr);
        for(int i=0;i<n-1;++i){
            for(int j=i+1;j<n;++j){
                if((arr[j]-arr[i])==x){
                     return 1;
                    
                }
               
            }
        }
        return -1;

   }
}
//optimized with single while loop
 class Solution {
    public int findPair(int n, int x, int[] arr) {
        // Sort the array
        Arrays.sort(arr);

        int i = 0, j = 1;

        while (i < n && j < n) {
            if (i != j && arr[j] - arr[i] == x) {
                return 1;
            } else if (arr[j] - arr[i] < x) {
                j++;
            } else {
                i++;
            }
        }

        return -1;
    }
}
 

