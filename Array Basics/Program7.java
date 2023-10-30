import java.io.*;

public class Program7 {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array: ");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];

        System.out.println("Enter the elements in the array: ");
        for(int i = 0; i<arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 0;i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i);
        }
    }
}
