class Solution {
    public int search(int[] nums, int target) {
        int si = 0;
        int ei = nums.length - 1;

        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[si] <= nums[mid]) {
                // Left half is sorted
                if (nums[si] <= target && target < nums[mid]) {
                    // Target is in the left half
                    ei = mid - 1;
                } else {
                    // Target is in the right half
                    si = mid + 1;
                }
            } else {
                // Right half is sorted
                if (nums[mid] < target && target <= nums[ei]) {
                    // Target is in the right half
                    si = mid + 1;
                } else {
                    // Target is in the left half
                    ei = mid - 1;
                }
            }
        }

        return -1;
    }
}