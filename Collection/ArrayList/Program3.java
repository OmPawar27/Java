// Cursors Types - Iterator, ListIterator, Enumerator, SplitIterator
// Iterator works on - List, Set, Queue
// ListIterator works on - List only

import java.util.*;

public class Program3 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        al.add("Om");
        al.add("Vaibhav");
        al.add("Prajwal");
        al.add("Vishal");
        // System.out.println(al);

        // Iterator goes only FORWARD
        Iterator iterator = al.iterator();
        System.out.println("Iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // ListIterator can traverse on both direction(forward,backward)
        ListIterator lisIterator = al.listIterator();
        System.out.println("ListIterator(FORWARD):");
        while (lisIterator.hasNext()) {
            System.out.println(lisIterator.next());
        }

        System.out.println("ListIterator(BACKWARD):");
        while (lisIterator.hasPrevious()) {
            System.out.println(lisIterator.previous());
        }

    }
}
