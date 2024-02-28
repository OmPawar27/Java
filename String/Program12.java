//  12. Write a Java program to find the minimum window in a string containing all characters of another string.

public class Program12 {
    public static void main(String[] args) {
        String str = "ZZADOBECODEBANC";
        String ss = "ABC";
        String result = "";
        int min = Integer.MAX_VALUE;
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                boolean flag = false;
                temp = str.substring(i, j + 1);
                for (int z = 0; z < ss.length(); z++) {
                    if (temp.contains(ss.charAt(z) + "")) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                }
                if (flag == true && temp.length() < min) {
                    min = temp.length();
                    result = temp;
                }
            }
        }
        System.out.println(result);
    }
}
