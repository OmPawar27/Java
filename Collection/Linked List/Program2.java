import java.util.*;

public class Program2 {
    public static void main(String[] args) {
        
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(10);
        ll.add(20);
        ll.add(30);

        ll.add(10);
        ll.add(20);
        ll.add(30);

        System.out.println(ll);

        ll.addFirst(5);
        ll.addLast(55);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.contains(30));
        System.out.println(ll.equals(30));
        System.out.println(ll.isEmpty());
        System.out.println(ll.hashCode());
        ll.remove(3);
        System.out.println(ll);
        System.out.println(ll.size());
    }
}
