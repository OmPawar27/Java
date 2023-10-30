import java.io.*;

public class Program13 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the array: ");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];

        System.out.println("Enter the elements in the array: ");
        for(int i = 0; i<arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter key:");
        int key = Integer.parseInt(br.readLine());
        int z = key;
        int arr2[] = new int[n];

        for(int i = 0; i<arr.length; i++){
            int number = arr[i];
            //arr2[i] = number;
            int count = 0;
            for(int j = 0; j<arr.length; j++){
                if(number == arr[j]){
                    count++;
                    if(count == key-1){
                        arr2[i] = number;
                    }
                }
            }
        }

        for(int i = 0; i<arr.length; i++){
            if(arr2[i] == 0){
                z = i;
            }
        }
        System.out.println("Every Element occur "+ key + " times except " + arr[z]);
    }    
}
