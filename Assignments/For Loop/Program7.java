// Q. WAP to print the product of the first 10 numbers

public class Program7 {
    public static void main(String[] args) {
        int total = 1;

        for(int i = 1; i<10; i++){
            total = total * i;
        }

        System.out.println("Product of the first 10 numbers is:" + total);
    }
}
