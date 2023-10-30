import java.io.*;

public class Program4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the array:");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];

        for(int i = 0; i<arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        int ans = 1;
        for(int i = 0; i<arr.length;i++){
            ans *= arr[i];
        }

        System.out.println(ans);
    }
}
