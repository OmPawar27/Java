//6. Implement a Java function that removes duplicate characters from a string while maintaining the original order of characters.
import java.io.*;
import java.util.Arrays;

public class Program6 {

    static boolean removeDuplicates(char ch,char[] temp,int index){

        for(int i = 0;i<temp.length; i++){
            if(ch == temp[i]){
                return false;
            }
            if(i == temp.length-1){
                temp[index] = ch;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a String:");
        String str = br.readLine();

        char ch[] = str.toCharArray();
        
        StringBuffer result = new StringBuffer();
        char temp[] = new char[str.length()];

        for(int i = 0,index = 0; i<ch.length; i++){
            if(removeDuplicates(ch[i],temp,index)){
                result.append(ch[i]);
                index++;
            }
        }
        System.out.println(result);
        System.out.println("Result:" + Arrays.toString(temp));
    }
}
