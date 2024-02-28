//10.  Write a Java program that converts a string containing digits into an integer without using any built-in library functions.

public class Program10 {
    public static void main(String[] args) {
        String str = "123";

        int num = 0;
        for(int i = 0; i<str.length(); i++){
            num = num * 10 + (str.charAt(i)-48);
        }
        System.out.println(num);
    }
}