// Q. WAP to print following pattern

/*9 8 7 6 5 
9 8 7 6 5 
9 8 7 6 5 
9 8 7 6 5 
9 8 7 6 5  */

public class Program6 {
    public static void main(String[] args) {
        
        for(int i = 0; i<5; i++){
            int num = 9;
            for(int j = 0; j<5; j++){
                System.out.print(num-- + " ");
            }
            System.out.println();
        }
    }
}
