import java.util.*;

public class Program3 {
    public static void main(String[] args) {
        
        LinkedList<Integer> ll_1 = new LinkedList<>();
        
        ll_1.add(10);
        ll_1.add(20);
        ll_1.add(30);

        LinkedList<Integer> ll_2 = new LinkedList<>(ll_1);
        
        ll_2.add(40);
        ll_2.add(50);
        ll_2.add(60);

        Iterator<Integer> itr = ll_2.listIterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
    }
}
