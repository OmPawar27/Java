// Q. WAP to print the product of digits of a given number

public class Program12 {
    int sum = 1;
    int productOfDigits(int num){
        if(num == 0)
            return 1;
        sum *= num%10;
        productOfDigits(num/10);
        return sum;
    }
    public static void main(String[] args) {
        Program12 obj = new Program12();
        int ans = obj.productOfDigits(225);
        System.out.println(ans);
    }
}
