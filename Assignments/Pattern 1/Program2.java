// Q. WAP to print following pattern

/*
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5
 */

public class Program2 {
    public static void main(String[] args) {
        int row = 5, col = 5;
        
        for(int i = 0; i<row; i++){
            int num = 1;
            for(int j = 0; j<col; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
