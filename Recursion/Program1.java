// Q. Write a program to print the number between 1 to 10

public class Program1{

    void fun(int num){
        if(num == 0)
            return;
        
        fun(num - 1);
        System.out.println(num);
    }
    public static void main(String[] args) {

        Program1 obj = new Program1();
        obj.fun(10);
    }
}