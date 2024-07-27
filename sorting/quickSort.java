import java.util.*;

public class quickSort {
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        quickSortSol(n, arr);
    }
}
