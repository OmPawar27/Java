// Q. WAP to print Odd numbers from 1-50

public class Program3 {
    public static void main(String[] args) {
        int x = 50;

        System.out.println("Odd numbers between 1-50 are:");

        for(int i = 1; i<=x; i++){
            if(i%2 !=0){
                System.out.println(i);
            }
        }
    }
}
