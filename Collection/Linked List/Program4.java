import java.util.*;

class Employee{

    String name = null;
    int id = 0;

    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String toString(){
        return name + ":" + id;
    }
}

public class Program4 {
    public static void main(String[] args) {
        
        LinkedList ll = new LinkedList<>();
        
        ll.add(new Employee("Om", 50));
        ll.add(new Employee("Vaibhav", 45));

        Iterator itr = ll.listIterator();

        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
    }
}
