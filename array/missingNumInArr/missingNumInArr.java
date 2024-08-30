class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for(int i =0;i<=n;i++){
            int cnt = 0;
            for(int j=0;j<=n-1;j++){
                if(nums[j] == i){
                    cnt =1;
                    break;
                }
            }
            if(cnt == 0){
                ans = i;
            }
        }

        return ans;
    }
}
