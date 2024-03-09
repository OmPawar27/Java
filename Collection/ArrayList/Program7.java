// Q7. Write a program to reverse an ArrayList.

import java.util.*;

public class Program7 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> al2 = new ArrayList<>();

        for(int i = al.size()-1; i>=0;i--){
            al2.add(al.get(i));
        }

        System.out.println(al2);
    }
}
