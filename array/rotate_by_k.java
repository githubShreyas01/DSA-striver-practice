class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        reverse(nums, 0, (nums.length-1) - k);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
        
    }

    public static void reverse(int[] arr, int str, int end){
        while(str<=end){
            int temp = arr[str];
            arr[str] = arr[end];
            arr[end] = temp;
            str++;
            end--;
        }
    }
}
