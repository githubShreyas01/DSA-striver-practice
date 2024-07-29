class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        subsets(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    private void subsets(int ind, int[] nums, List<Integer> ds, List<List<Integer>> ans){
        ans.add(new ArrayList<>(ds));

        for(int i = ind; i<nums.length;i++){
            ds.add(nums[i]);
            subsets(i + 1, nums, ds, ans);
            ds.remove(ds.size() - 1);
        }
    }
}
