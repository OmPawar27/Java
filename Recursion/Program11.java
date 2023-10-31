// Q. WAP to print the factorial of a given number

public class Program11 {

    int fact = 1;
    int factorial(int num){
        if(num == 1)
            return num;
        fact = fact * num;
        factorial(--num);
        return fact;
    }
    public static void main(String[] args) {
        Program11 obj = new Program11();
        int ans = obj.factorial(5);
        System.out.println(ans);
    }
}
