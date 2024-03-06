// Some basic methods

import java.util.*;

public class Program2 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(10);
        al.add(20);
        al.add(30);

        // Print all List
        System.out.println(al);

        // Size of the list
        // Return Type: int
        System.out.println(al.size());

        // return True if object is present in list
        System.out.println(al.contains(20));

        // indexOf(obj)
        // returns first index of object if present
        System.out.println(al.indexOf(30));

        // lastIndexOf(obj)
        System.out.println(al.lastIndexOf(30));

        // E get(int)
        System.out.println(al.get(3));

        // E set(index,obj)
        al.set(3, 40);
        System.out.println(al);

        ArrayList<Integer> al2 = new ArrayList<Integer>();
        al2.add(60);
        al2.add(70);
        al2.add(80);

        // addAll(collection)
        al.addAll(al2);
        System.out.println(al);

        // remove(int)
        System.out.println(al.remove(1));

    }
}
