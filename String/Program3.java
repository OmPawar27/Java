//3.  Write a Java program to count the occurrences of a specific character within a given string. 
//  Your program should take both the input string and the character to be counted as inputs.

import java.io.*;

public class Program3 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a String");
        String str = br.readLine();

        System.out.println("Enter a character :");
        char ch = (char)br.read();
        
        int count = 0;

        for(int i = 0 ;i<str.length(); i++){
            if(str.charAt(i) == ch)count++;
        }
        System.out.println("Count of " + ch + " is: " + count);
    }
}
