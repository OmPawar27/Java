// Q. Write a program to print following pattern

/*  # # # # 
    # # # # 
    # # # # 
    # # # # */

public class Program1{
    public static void main(String[] args) {
        int row = 4, col = 4;

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                System.out.print("#" + " ");
            }
            System.out.println();
        }
    }
}