// 11.Write a function to find the maximum element in an ArrayList.

import java.util.*;

public class Program11 {
    
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(Arrays.asList("Om","Pawar","Phaltan"));
        int max = Integer.MIN_VALUE;
        String result = "";

        Iterator<String> itr = al.iterator();
        while(itr.hasNext()){
            String temp = itr.next();
            int count = temp.length();
            if(count > max){
                max=count;
                result = temp;
            }
        }
        System.out.println(result);
    }
}
