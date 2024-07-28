class Solution{
    static int searchInSorted(int arr[], int N, int K)
    {
        
        // Your code here
        int cnt = -1;
        for(int i=0;i<N;i++){
            if(arr[i] == K)
                cnt = 1;
        }
        return cnt;
    }
}
