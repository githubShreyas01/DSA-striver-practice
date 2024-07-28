class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int [] arr = new int[n];

        int posInd = 0;
        int negInd = 1;

        for(int i=0;i<n;i++){
            if(nums[i] > 0){
                arr[posInd] = nums[i];
                posInd = posInd +2;
            }
            else{
                arr[negInd] = nums[i];
                negInd = negInd +2;
            }
        }
        return arr;
    }
}
