import java.io.*;
import java.util.HashMap.*;
import java.util.*;
import java.util.Iterator;

public class Program14 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the array: ");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];

        System.out.println("Enter the elements in the array: ");
        for(int i = 0; i<arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        HashMap<Integer,Integer> hMap = new HashMap();
        for(int i = 0; i<arr.length; i++){
            int number = arr[i];
            int arr2[] = new int[n];
            int count = 0;
            for(int j = i; j<arr.length; j++){
                if(number == arr[j] && number!= arr2[i]){
                    count++;
                    arr2[i] = number;
                    hMap.put(count, i);
                }
            }
        }
        Set entrySet = hMap.entrySet();

        Iterator itr = entrySet.iterator();

        while(itr.hasNext()){
            System.out.print(entrySet.getValues());
        }
        
    }
}
