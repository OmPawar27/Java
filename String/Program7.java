//7.  Write a Java program that reverses the order of words in a given string while preserving the order of characters within each word.

public class Program7 {
    public static void main(String[] args) {
        String str = "om tushar pawar";

        String arr[] = str.split(" ");
        StringBuffer result = new StringBuffer();

        for(int i = arr.length-1; i>=0; i--){
            result.append(arr[i] + " ");
        }
        System.out.println(result);
    }
}