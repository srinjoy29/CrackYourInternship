class Solution {
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr, int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        // Sort the input array to handle duplicates easily
        Collections.sort(arr);
        // Use a set to track unique permutations
        Set<ArrayList<Integer>> set = new HashSet<>();
        // Call the recursive function to generate permutations
        recurPermute(arr, new ArrayList<>(), set, new boolean[arr.size()]);
        // Convert set to list and sort the result list to get permutations in lexicographical order
        ans.addAll(set);
        ans.sort((a, b) -> {
            for (int i = 0; i < a.size(); i++) {
                if (!a.get(i).equals(b.get(i))) return a.get(i) - b.get(i);
            }
            return 0;
        });
        return ans;
    }

    // Recursive function to generate permutations
    private static void recurPermute(ArrayList<Integer> nums, ArrayList<Integer> ds, Set<ArrayList<Integer>> set, boolean[] freq) {
        if (ds.size() == nums.size()) {
            set.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i < nums.size(); i++) {
            if (i > 0 && nums.get(i) == nums.get(i - 1) && !freq[i - 1]) continue; // Skip duplicates
            if (!freq[i]) {
                freq[i] = true;
                ds.add(nums.get(i));
                recurPermute(nums, ds, set, freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }
}
