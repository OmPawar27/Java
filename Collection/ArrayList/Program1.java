// We can store different objects("Data")
// Size is not fixed it is dynamic
// Duplicate objects can be stored
// Insertion order is maintained

import java.util.*;

public class Program1{
    public static void main(String[] args) {
        
        ArrayList al = new ArrayList();

        al.add(10);     
        al.add("Om");
        al.add("30");

        System.out.println(al);
    }
}