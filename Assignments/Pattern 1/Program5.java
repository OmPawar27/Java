// Q. WAP to print the following pattern

/*16 16 16 16 16 
15 15 15 15 15 
14 14 14 14 14 
13 13 13 13 13 
12 12 12 12 12 */

public class Program5 {
    public static void main(String[] args) {

        int num = 16;

        for(int i = 0; i<5; i++){
            for(int j = 0; j<5; j++){
                System.out.print(num + " ");
            }
            num--;
            System.out.println();
        }
    }
}
