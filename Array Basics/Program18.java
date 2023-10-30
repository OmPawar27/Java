import java.io.*;

public class Program18 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = {1,4,0,0,3,10,5};

        int key = Integer.parseInt(br.readLine());
        boolean flag = false;

        for(int i = 0; i<arr.length; i++){
            int sum = 0;
            for(int j = i; j<arr.length; j++){
                sum +=arr[j];
                if(sum == key){
                    System.out.println("Sum found between indexes " + i + " and " + j);
                    flag = true;
                }
            }
        }
        if(flag == false)
            System.out.println("No Subarray found");
    }
}
