// Q. WAP to print the sum of odd numbers up to a given number

public class Program14 {

    int sum = 0;
    int sumOfOdd(int num){
        if(num == 0)
            return num;
        sumOfOdd(--num);
        if(num % 2 != 0)
            sum += num;
        return sum;
    }
    public static void main(String[] args) {
        Program14 obj = new Program14();
        int ans = obj.sumOfOdd(10);
        System.out.println(ans);
    }
}
