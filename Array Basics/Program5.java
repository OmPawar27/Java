import java.io.*;

public class Program5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the array:");
        int n = Integer.parseInt(br.readLine());

        String str = Integer.toString(n);

        char arr[] = new char[str.length()];

        arr = str.toCharArray();
        
        for(int i = 0; i<str.length();i++){
            if(arr[i] == '0'){
                arr[i] = '5';
            }
        }

        for(int i = 0; i<str.length();i++){
            System.out.print(arr[i]);
        }
    
    }
}
