// Q. WAP to check whether the given number is palindrome or not

public class Program15 {

    int palindrome(int num, int temp){
        if(num == 0)
            return temp;
        temp = (temp*10) + (num%10);
        return palindrome(num/10, temp);
    }
    public static void main(String[] args) {
        Program15 obj = new Program15();
        int num = 121;
        int ans = obj.palindrome(num, 0);
        if(ans == num)
            System.out.println(num + " is a palindrome number");
        else
            System.out.println(num + " is not a palindrome number");
    }
}
