// Q12.Sort an ArrayList of Strings in ascending order.

import java.util.*;

public class Program12 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(Arrays.asList("dd", "cc", "bb", "aa"));

        for (int i = 0; i < al.size(); i++) {
            for (int j = i + 1; j < al.size(); j++) {
                if (al.get(i).compareTo(al.get(j)) == 1) {
                    String temp = al.get(i);
                    al.set(i, al.get(j));
                    al.set(j, temp);
                }
            }
        }
        System.out.println(al);
    }
}
