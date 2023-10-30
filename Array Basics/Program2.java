import java.io.*;

public class Program2 {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the length of the array:");
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        
        int min = 99999;int max = 0;

        System.out.println("Enter the elements in the array:");
        for(int i = 0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println("Largest Element is:" + max);
        System.out.println("Smallest Element is:" + min);

    }
}
