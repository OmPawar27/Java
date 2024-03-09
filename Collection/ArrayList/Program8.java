// 8. Find the Intersection of Two ArrayLists:

import java.util.*;

public class Program8 {
    public static void main(String[] args) {

        ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(7,8,3,9,6));

        for(int i = 0; i<al1.size(); i++){
            for(int j = 0; j<al2.size(); j++){
                if(al1.get(i) == al2.get(j)){
                    System.out.println(al1.get(i));
                }
            }
        }
    }
}
