import java.util.*;

public class mergeSort {

    public static void mergeSortSol(int [] arr, int low, int high){
        if(low >= high)
                return;
            int mid = (low + high) / 2;
            mergeSortSol(arr, low, mid);
            mergeSortSol(arr, mid + 1, high);
            merge(arr, low, mid, high);
    }



    public static void merge(int [] arr, int low, int mid, int high){
        ArrayList <Integer> temp = new ArrayList <Integer>();       
        int l = low;
        int r = mid + 1;



        while((l<=mid) && (r<=high)){
            if(arr[l] < arr[r]){
                temp.add(arr[l]);
                l++;
            }
            else{
                temp.add(arr[r]);
                r++;
            }
        }

        while(l<=mid){
            temp.add(arr[l]);
            l++;
        }

        while(r <= high){
            temp.add(arr[r]);
            r++;
        }

        for(int i =low; i<=high;i++){
            arr[i] = temp.get(i - low);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        int low = 0;
        int high = n-1;

        mergeSortSol(arr, low, high);
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    
}
