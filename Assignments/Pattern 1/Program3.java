// Q. WAP to print following pattern

/*14 14 14 14 14 
15 15 15 15 15 
16 16 16 16 16 
17 17 17 17 17 
18 18 18 18 18 */

public class Program3 {
    public static void main(String[] args) {
        int row = 5,col = 5;

        int num = 14;
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                System.out.print(num + " ");
            }
            num++;
            System.out.println();
        }
    }
}
