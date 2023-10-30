// Q. WAP to check whether the given number is palindrome or not

public class Program10 {
    int palindrome(int num,int temp){
        if(num == 0)
            return temp;
        temp = (temp*10) + (num%10);
        return palindrome(num/10, temp);
    }
    public static void main(String[] args) {
        Program10 obj = new Program10();
        int num = 11211;

        if(obj.palindrome(num, 0) == num)
            System.out.println(num + " is palindrome");
        else
            System.out.println(num + " is not palindrome");
    }
}
