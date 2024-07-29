class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<> ();
        combinationSum(0, candidates, target, new ArrayList<>(), ans);
        return ans;    
    }

    private void combinationSum(int ind, int[] candidates, int target, List<Integer> ds, List<List<Integer>> ans){

        if(target == 0){
                ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = ind; i<candidates.length; i++){
            if(candidates[i] > target) continue;

                ds.add(candidates[i]);
                combinationSum(i, candidates, target - candidates[i], ds, ans);
                ds.remove(ds.size() - 1);
                
        }
    }
}
