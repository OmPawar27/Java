//4. Implement a Java function to determine whether two strings are anagrams of each other. 
//  Anagrams are strings that contain the same characters but in a different order.

import java.io.*;

public class Program4 {
    static char[] sort(char[] ch){
        for(int i = 0; i<ch.length; i++){
            for(int j = 0; j<ch.length; j++){
                if(ch[i] < ch[j]){
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        return ch;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter First String: ");
        String str1 = br.readLine();
        str1 = str1.toLowerCase();
        
        System.out.println("Enter Second String: ");
        String str2 = br.readLine();
        str2 = str2.toLowerCase();

        int count = 0;

        if(str1.length() != str2.length())System.out.println("Strings are not Anagram");
        else{
            char ch1[] = str1.toCharArray();
            char ch2[] = str2.toCharArray();

            ch1 = sort(ch1);
            ch2 = sort(ch2);
            for(int i = 0; i<ch1.length; i++){
                if(ch1[i] == ch2[i])count++;
            }
            if(count == ch1.length)System.out.println("Strings are Anagram");
            else System.out.println("Strings are not Anagram");
        }
    }
}
