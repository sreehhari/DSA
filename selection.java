
import java.util.Arrays;
import java.util.Scanner;

public class selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the number of elements in the array\n");
        n=sc.nextInt();
        int[] arr =new int[n];
        System.out.println("enter the elements into the array\n");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        //sorting

        for(int i=0;i<n-1;i++){
            // int key=arr[i];
            for(int j=i+1;j<n;j++){
                if(arr[j]<=arr[i]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }

            
        }


        //printing
        System.out.println(Arrays.toString(arr));

    }
}
