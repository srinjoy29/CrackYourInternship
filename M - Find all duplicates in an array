class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        if (nums.length == 1)
        {
            return new ArrayList<>();
        }
        List<Integer> lst = new ArrayList<>();
        int[] cnt = new int[nums.length + 1];
        for (int num : nums)
        {
            cnt[num]++;
        }
        for (int i = 1; i < cnt.length; i++) {
            if (cnt[i] == 2)
            {
                lst.add(i);
            }
        }
        return lst;
    }
}
