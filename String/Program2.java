import java.io.*;
 
public class Program2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a String");
        String str = br.readLine();

        char ch[] = new char[str.length()];
        ch = str.toCharArray();
        int count = 0;

        for(int i = 0,j = str.length()-1; i<ch.length;j--, i++){
            if(ch[i] == str.charAt(j)){
                count++;
            }
        }
        if(count == str.length())System.out.println("Palindrme");
        else System.out.println("Not Palindrome");
    }
}
