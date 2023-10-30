//Q. WAP to calculate Profit or Loss

import java.io.*;

public class Program5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int costPrice, sellingPrice;

        System.out.println("Enter 1.CostPrice and 2.SellingPrice");
        costPrice = Integer.parseInt(br.readLine());
        sellingPrice = Integer.parseInt(br.readLine());

        int remaining = sellingPrice - costPrice;
        if(remaining == 0){
            System.out.println("No Profit No Loss.");
        }
        else if(remaining > 0){
            System.out.println("Profit of:" + remaining + " Rs.");
        }else{
            System.out.println("Loss of:" + remaining + " Rs.");
        }

        br.close();
    }
}
