
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashmap {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the total number \n");
            int n= sc.nextInt();
            int[] arr= new int[n];
            System.out.println("enter the numbers\n");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            //precompute

            HashMap<Integer,Integer> mp= new HashMap<>();

            for(int i=0;i<n;i++){
                int key =arr[i];
                mp.put(key, mp.getOrDefault(key, 0)+1);
                
            }

            //iterate over the map
            for(Map.Entry<Integer,Integer>it:mp.entrySet()){
                System.out.println(it.getKey()+ "->" + it.getValue());
            }


                sc.close();
        }
    
}
