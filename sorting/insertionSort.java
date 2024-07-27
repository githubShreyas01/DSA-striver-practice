import java.util.*;

public class insertionSort {

    public static void insertionSortSol(int n, int [] arr){
        for(int i=0;i<=n-1;i++){
            int j=i;
            while((j>0) && (arr[j-1] > arr[j])){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        for(int i=0;i<=n-1;i++){
            System.out.print(arr[i] + " ");
        }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        insertionSortSol(n, arr);
        sc.close();
    }
}
