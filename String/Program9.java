//  9.  Implement a Java function to find and return the first non-repeated character in a given string.

public class Program9 {
    public static void main(String[] args) {
        String str = "GeeksforGeeks";

        for (int i = 0; i < str.length(); i++) {
            boolean flag = false;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("The first non repreated character in String is: " + str.charAt(i));
                break;
            }
        }
    }
}
