//8. Write a Java program to check if a given string contains only digits (0-9).

public class Program8 {
    public static void main(String[] args) {
        String str = "12345";

        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            if(!Character.isDigit(ch)){
                System.out.println("There are some non digit values");
                break;
            }
            if(i == str.length()-1)System.out.println("String is pure");
        }
    }
}
