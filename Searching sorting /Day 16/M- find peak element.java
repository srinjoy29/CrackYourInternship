class Solution {
    public int findPeakElement(int[] nums) {
        int l=0, h=nums.length-1;
        while(l<h){
            int mid = l+(h-l)/2;
            if(nums[mid]>nums[mid+1]){
                h=mid;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}

// Initial Array: [1, 2, 1, 3, 5, 6, 4]
// Indexes:       0  1  2  3  4  5  6

// Iteration 1:
//   l = 0, h = 6, mid = 3
//   nums[3] = 3, nums[4] = 5
//   Since 3 < 5, move to the right half: l = 4

// Iteration 2:
//   l = 4, h = 6, mid = 5
//   nums[5] = 6, nums[6] = 4
//   Since 6 > 4, move to the left half: h = 5

// Iteration 3:
//   l = 4, h = 5, mid = 4
//   nums[4] = 5, nums[5] = 6
//   Since 5 < 6, move to the right half: l = 5

// Termination:
//   l = h = 5
//   Return index 5
