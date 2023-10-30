import java.io.*;

public class Program15 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the array: ");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];

        System.out.println("Enter the elements in the array: ");
        for(int i = 0; i<arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0;
        int j = 0;
        for(int i =0; i<arr.length;i++){
            for(j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    break;
                }
            }
            if(j == arr.length){
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }
}
