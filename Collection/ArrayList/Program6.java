// Sorting user-defined class using COMPARATOR

import java.util.*;

class Employee {
    String empName;
    int empId;

    Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public String toString() {
        return empId + ":" + empName;
    }
}

// Using Generics
class sortByName implements Comparator<Employee> {

    public int compare(Employee obj1, Employee obj2) {
        return obj1.empName.compareTo(obj2.empName);
    }
}

/*
 * class sortByName implements Comparator{
 * 
 * public int compare(Object obj1, Object obj2){
 * char ch1 = ((Employee)obj1).empName.charAt(0);
 * char ch2 = ((Employee)obj2).empName.charAt(0);
 * 
 * return ch1 > ch2 ? 1 : -1;
 * }
 * }
 */

// Without using Generics
class sortById implements Comparator {

    public int compare(Object obj1, Object obj2) {
        return ((Employee) obj1).empId - ((Employee) obj2).empId;
    }
}

public class Program6 {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<>();

        al.add(new Employee(5, "Om"));
        al.add(new Employee(3, "Harsh"));
        al.add(new Employee(9, "Shrey"));
        al.add(new Employee(7, "Umer"));
        al.add(new Employee(1, "Subhaan"));

        System.out.println("Sort by Employee Name:");
        Collections.sort(al, new sortByName());
        System.out.println(al);

        System.out.println();

        System.out.println("Sort by Employee Id:");
        Collections.sort(al, new sortById());
        System.out.println(al);

    }
}
