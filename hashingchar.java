
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashingchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the total number of characters\n");

        int n=sc.nextInt();
        sc.nextLine();
        char[] alp=new char[n];
        for(int i=0;i<n;i++){
            alp[i]=sc.nextLine().charAt(0);
        }

        HashMap<Character,Integer> mp = new HashMap<>();

        for(int i=0;i<n;i++){
            char key=alp[i];
            mp.put(key, mp.getOrDefault(key, 0)+1);
        }

        for(Map.Entry<Character, Integer> it : mp.entrySet()){
            System.out.println(it.getKey() + "->" + it.getValue());
        }



        sc.close();
    }
}
