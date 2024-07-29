class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum2(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }

    private void combinationSum2(int ind, int[] candidates, int target, List<Integer> ds, List<List<Integer>> ans){

        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        
        for(int i=ind; i<candidates.length;i++){
            if (candidates[i] > target || (ind != i && candidates[i] == candidates[i - 1])) continue;

                ds.add(candidates[i]);
                combinationSum2(i+1, candidates, target - candidates[i], ds, ans );
                ds.remove(ds.size() - 1);
        }
    }

}
