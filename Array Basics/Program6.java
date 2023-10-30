import java.io.*;

public class Program6 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the array:");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];

        System.out.println("Enter the elements in the array:");
        for(int i = 0; i<arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        System.out.println("Enter the element you want to find:");
        int key = Integer.parseInt(br.readLine());

        System.out.println("Enter starting index:");
        int start = Integer.parseInt(br.readLine());

        System.out.println("Enter ending index:");
        int end = Integer.parseInt(br.readLine());

        boolean flag = false;
        for(int i = start; i<=end; i++){
            if(arr[i] == key){
                flag = true;
            }
        }
        if(flag == true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
