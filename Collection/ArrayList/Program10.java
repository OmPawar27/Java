// Q10. Write a program to check if an ArrayList is empty.

import java.util.*;

public class Program10 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList());

        //1
        System.out.println(al.isEmpty());   //True:  as arraylist is empty

        //2
        Iterator<Integer> itr = al.iterator();
        System.out.println(itr.hasNext()); // False: as arraylist doesnot containes any elements

        //3
        System.out.println(al.size() == 0); // True as there are not elements

        //4
        boolean isEmpty = false;
        for(Integer val : al){
            isEmpty = true;
            break;
        }
        if(isEmpty) System.out.println("Not Empty"); else System.out.println("Empty");
    } 
}
