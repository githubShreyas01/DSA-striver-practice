class Solution {
    public static int largest(int n, int[] arr) {
        // code here
        int larg = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i] > larg){
                int temp = larg;
                larg = arr[i];
                arr[i] = temp;
            }
        }
        return larg;
    }
}
