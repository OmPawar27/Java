// Q. WAP to find Maximum between three Numbers

import java.io.*;

public class Program4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n1,n2,n3;

        System.out.println("Enter 3 numbers:");
        n1 = Integer.parseInt(br.readLine());
        n2 = Integer.parseInt(br.readLine());
        n3 = Integer.parseInt(br.readLine());

        if(n1>=n2 && n1>=n3){
            System.out.println(n1 + " is Greater than " + n2 + " " + n3);
        }else if(n2>=n1 && n2>=n3){
            System.out.println(n2 + " is Greater than " + n1 + " " + n3);
        }else{
            System.out.println(n3 + " is Greater than " + n1 + " " + n2);
        }

        br.close();
    }
}
