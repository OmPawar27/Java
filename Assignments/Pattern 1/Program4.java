// Q. WAP to print following pattern

/*1A 1A 1A 1A 1A 
1A 1A 1A 1A 1A 
1A 1A 1A 1A 1A 
1A 1A 1A 1A 1A 
1A 1A 1A 1A 1A */

public class Program4 {
    public static void main(String[] args) {
        int num = 1;
        char ch = 'A';

        for(int i = 0; i<5; i++){
            for(int j = 0; j<5; j++){
                System.out.print(num + "" + ch + " ");
            }
            System.out.println();
        }
    }
}
