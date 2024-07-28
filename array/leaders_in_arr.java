class Solution {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here
        ArrayList <Integer> ans = new ArrayList <Integer> ();
        int maxi = Integer.MIN_VALUE;
        
        for(int i = n-1; i>=0;i--){
            if(arr[i] >= maxi){
                ans.add(arr[i]);
            }
            maxi = Math.max(maxi, arr[i]);
        }
        
        Collections.sort(ans, Collections.reverseOrder());
        return ans;
    }
}
