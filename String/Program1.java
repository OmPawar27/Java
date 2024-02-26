//1.  Write a Java program that takes a string input and returns the reverse of that string. Ensure that your solution does not use any built-in library functions for reversing strings.

import java.io.*;

class Program1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a String: ");
        String str = br.readLine();

        StringBuffer result = new StringBuffer();

        for (int i = str.length() - 1; i >=0; i--) {
            result.append(str.charAt(i));
        }
        System.out.println(result);
    }
}