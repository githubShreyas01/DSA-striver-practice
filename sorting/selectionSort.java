import java.util.*;

public class selectionSort {

    public static void selectionSortSol(int n, int[] arr){
        for(int i = 0;i<=n-2;i++){
            int min = i;
            for(int j =i;j<=n-1;j++){
                if(arr[min] > arr[j]){
                    min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        }

        for(int i =0;i<=n-1;i++){
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

        selectionSortSol(n, arr);
        sc.close();
    }
}
