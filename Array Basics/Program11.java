import java.io.*;

public class Program11 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the array: ");
        int n = Integer.parseInt(br.readLine());

        int arr1[] = new int[n];
        int arr2[] = new int[n];

        int min = 9999999;
        int max = -9999999;

        System.out.println("Enter the elements in the array1: ");
        for(int i = 0; i<arr1.length;i++){
            arr1[i] = Integer.parseInt(br.readLine());
            if(arr1[i]>max){
                max = arr1[i];
            }
        }
        System.out.println("Enter the elements in the array2: ");
        for(int i = 0; i<arr2.length;i++){
            arr2[i] = Integer.parseInt(br.readLine());
            if(arr2[i]<min){
                min = arr2[i];
            }
        }

        System.out.println(max * min);

    }
}
