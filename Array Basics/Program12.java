import java.io.*;

public class Program12 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the array: ");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];

        System.out.println("Enter the elements in the array1: ");
        for(int i = 0; i<arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter the element you want to find its occurance:");
        int key = Integer.parseInt(br.readLine());

        int firstIndex = -1;
        int lastIndex = -1;

        boolean flag = false;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == key && flag == false){
                firstIndex = i;
                flag = true;
            }
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == key){
                lastIndex = i;
            }
        }

        if(firstIndex != -1){
            System.out.println("Element found! First Index:" + firstIndex + " LastIndex:" + lastIndex);
        }else{
            System.out.println(-1);
        }
    }
}
