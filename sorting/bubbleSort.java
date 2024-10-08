import java.util.*;

public class bubbleSort {

    public static void bubbleSortSol(int n,  int [] arr){
        for(int i = n-1; i>=1;i--){

            int didSwap =0;
            for(int j =0 ; j<=i-1;j++){
                if(arr[j] > arr[j+1] ){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap ==0){ // for optimizing code i.e. if loop runs for first time ,
                break;       // and no swap happens this means arr already in sorted asc order then no need for further loop running.
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

        bubbleSortSol(n, arr);
        sc.close();
    }
}
