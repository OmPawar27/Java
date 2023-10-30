// Q. WAP to print following pattern

/*E D C B A 
E D C B A 
E D C B A 
E D C B A 
E D C B A */

public class Program8 {
    public static void main(String[] args) {
        for(int i = 0; i<5; i++){
            char ch = 'E';
            for(int j = 0; j<5; j++){
                System.out.print(ch-- + " ");
            }
            System.out.println();
        }
    }
}
