// Q. WAP to print the maximum digit in a given number

public class Program13 {

    int max = Integer.MIN_VALUE;
    int maxDigit(int num){
        if(num == 0)
            return max;
        int temp = num%10;
        if(temp > max)
            max = temp;
        maxDigit(num/10);
        return max;
    }
    public static void main(String[] args) {
        Program13 obj = new Program13();
        int ans = obj.maxDigit(129428);
        System.out.println(ans);
    }
}
