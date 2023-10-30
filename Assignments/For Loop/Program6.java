// Q. WAP to print the sum of first 10 numbers

public class Program6 {
    public static void main(String[] args) {
        int total = 0;

        for(int i = 1; i<=10; i++){
            total = total + i;
        }
        
        System.out.println("Sum of First 10 numbers is:" + total);
    }
}
