import java.util.*;

public class hash{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the contents into the array\n");
            arr[i]=scanner.nextInt();

        }
        double[] hash=new double[10000000];
        for(int i=0;i<n;i++){
            hash[arr[i]]+=1;
        }

        System.out.println("enter the number of querries\n");
        int q=scanner.nextInt();

        System.out.println("enter the querries\n");
        for(int i=0;i<q;i++){
            int number = scanner.nextInt();
            if(number<hash.length){
                System.out.printf("the numeber %d appears in the array %f times \n",number,hash[number]);
            }else{
                System.out.println("array out of bound index\n");
            }
        }

scanner.close();
    

    }
}