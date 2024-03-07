// Sorting user-defined class using COMPARABLE

import java.util.*;

class Employee implements Comparable{
    String empName;
    int empId;
    
    Employee(int empId, String empName){
        this.empId = empId;
        this.empName = empName;
    }

    public int compareTo(Object obj1){
        System.out.println(this.empId + " " + (((Employee)obj1).empId));
        return this.empId - ((Employee)obj1).empId;
    }

    public String toString(){
        return empId + ":" + empName;
    }
}

public class Program5 {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<>();

        al.add(new Employee(5,"Om"));
        al.add(new Employee(3,"Harsh"));
        al.add(new Employee(9,"Shrey"));
        al.add(new Employee(7,"Umer"));
        al.add(new Employee(1,"Subhaan"));
 
        Collections.sort(al);

        System.out.println(al);
    }
}
