import java.io.*;

class Program1{
    public static void main(String[] args) throws IOException{
        
        int arr[] = {1,2,3,4,5};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter an Element to find:");
        int x = Integer.parseInt(br.readLine());

        boolean flag = false;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x){
                System.out.println(i);
                flag = true;
                break;
            }
        }
        if(flag == false){
            System.out.println("Element is not present");
        }
    }
}