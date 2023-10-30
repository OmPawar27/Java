//Q.8 Even Occuring Elements

import java.io.*;

public class Program8 {
    public static void main(String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the array: ");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];

        System.out.println("Enter the elements in the array: ");
        for(int i = 0; i<arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i<arr.length; i++){
            int count = 0;
            int temp = arr[i];
            for(int j = i; j<arr.length; j++){
                if(temp == arr[j]){
                    count++;
                }
            }
            if(count%2 == 0 && count<3){
                System.out.print(temp + " ");
            }
        }
    }
}
