
// import java.util.ArrayList;
import java.util.*;

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

        /*
         * ArrayList<Character> al = new ArrayList<>();
         * ArrayList<Character> alresult = new ArrayList<>();
         * ArrayList<Character> alss = new ArrayList<>();
         * 
         * int count = 0;
         * int index = -1;
         * boolean flag = false;
         * 
         * for (int i = 0; i < str.length(); i++) {
         * for (int j = 0; j < ss.length(); j++) {
         * if (ss.charAt(j) == str.charAt(i)) {
         * index = i;
         * flag = true;
         * break;
         * }
         * }
         * if (flag)
         * break;
         * }
         * int min = Integer.MAX_VALUE;
         * 
         * for (int i = index; i < str.length(); i++) {
         * al.add(str.charAt(i));
         * for (int j = 0; j < ss.length(); j++) {
         * if (str.charAt(i) == ss.charAt(j)) {
         * count++;
         * }
         * if (count == ss.length()) {
         * if (min > al.size()) {
         * min = al.size();
         * alresult = new ArrayList<>(al);
         * }
         * count = 0;
         * al.clear();
         * }
         * }
         * }
         * System.out.println(alresult);
         */
    }
}
