class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        int minDiff=Integer.MAX_VALUE;
        Collections.sort(a);

        for(int i=(m-1);i<a.size();i++)
        {
            minDiff=Math.min((a.get(i)-a.get(i-(m-1))),minDiff);
        }
        return minDiff;
    }
}

ArrayList<Integer> a = new ArrayList<>(Arrays.asList(3, 4, 1, 9, 56, 7, 9, 12));
int n = a.size(); // n = 8
int m = 5;
long result = findMinDiff(a, n, m);
Initial Array:

a: [3, 4, 1, 9, 56, 7, 9, 12]
Sorted Array:

a: [1, 3, 4, 7, 9, 9, 12, 56]
Iterate and Find Minimum Difference:

Iteration 1 (i = 4):
Subarray: [1, 3, 4, 7, 9]
Difference: 9 - 1 = 8
minDiff is updated to 8
Iteration 2 (i = 5):
Subarray: [3, 4, 7, 9, 9]
Difference: 9 - 3 = 6
minDiff is updated to 6
Iteration 3 (i = 6):
Subarray: [4, 7, 9, 9, 12]
Difference: 12 - 4 = 8
minDiff remains 6
Iteration 4 (i = 7):
Subarray: [7, 9, 9, 12, 56]
Difference: 56 - 7 = 49
minDiff remains 6
Return Result:

The minimum difference found is 6
