// Q9. Write a function to find the common elements between two ArrayLists.

import java.util.*;

public class Program9 {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(3,4,5,6,7));
        ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(2,4,6,9,8));

        for(int i = 0; i<al1.size(); i++){
            for(int j = 0; j<al2.size(); j++){
                if(al1.get(i).equals(al2.get(j))){
                    System.out.print(al1.get(i) + " ");
                }
            }
        }
        
        al1.retainAll(al2); // Add's all common elements between both list's in single list
        System.out.println(al1);
    }
}
