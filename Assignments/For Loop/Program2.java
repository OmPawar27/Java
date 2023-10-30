// Q. WAP to print even numbers 1-100

public class Program2 {
    public static void main(String[] args) {
        int x = 100;

        System.out.println("Even numbers between 1 to 100 are:");

        for(int i = 1; i<=x; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
