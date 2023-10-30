// Q. WAP to print the length of digits in a number

public class Program3 {

    int sum = 0;
    int fun(int num){
        if(num == 0){
            return 0;
        }
        sum += num;
        fun(--num);
        return sum;
    }
    public static void main(String[] args) {
        Program3 obj = new Program3();
        int x = obj.fun(10);
        System.out.println(x);
    }
}
