import java.io.*;

public class Program3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the array:");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];
        int max = 0;

        for(int i = 0; i<arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The largest element in the array is: " + max);
    }
}
