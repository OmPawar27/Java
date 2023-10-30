// Q. WAP to find the factorial of a number

class Program7{

    int fact = 1;
    int factorial(int num){
        if(num == 0)
            return 0;
        fact *= num;
        factorial(--num);
        return fact;
    }
    public static void main(String[] args) {
        Program7 obj = new Program7();
        int ans = obj.factorial(5);
        System.out.println(ans);
    }
}