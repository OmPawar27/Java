// Q To check Number is Positive or Negative

import java.io.*;

public class Program3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        if(num>=0){
            System.out.println("Number is Positive");
        }else{
            System.out.println("Number is Negative");
        }

        br.close();
    }
}
