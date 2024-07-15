class Solution {
    public int majorityElement(int[] nums) {
        int n= nums.length;
        int ans=nums[0];
        int count=1;
        for(int i=0;i<n;i++){
            if(nums[i]!= ans)
            count--;
            else{
                count++;
            }
            if(count==0){
               ans=nums[i];
               count=1;

            }
        }
        return ans;
    }
}
