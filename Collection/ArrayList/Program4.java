// Storing userdefined objects in ArrayList

import java.util.*;

class Team{
    String name;
    int jerNo;

    Team(String name, int jerNo){
        this.name = name;
        this.jerNo = jerNo;
    }

    public String toString(){   // This method is overridden from Object class
        return jerNo + ":" + name;
    }
}

public class Program4 {
    public static void main(String[] args) {
        
        ArrayList al = new ArrayList<>();

        al.add(new Team("Virat",18));
        al.add(new Team("Rohit",45));
        al.add(new Team("MsDhoni",7));

        // Whenever we print objects from collection 
        // toString method is called 
        // if it is not defined in userdefined class it will print address of each object
        System.out.println(al);
    }
}
