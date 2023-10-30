import java.io.*;

public class Program9 {
    public static void main(String[] args)throws IOException {
        
        int arr[] = {1,2,3,4,5};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the index of element you want to remove from the array");
        int n = Integer.parseInt(br.readLine());

        for(int i = n; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        for(int i = 0; i<arr.length-1; i++){
            System.out.print(arr[i]);
        }
    }
}
