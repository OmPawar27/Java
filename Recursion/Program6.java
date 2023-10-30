// Q. WAP to calculate the sum of digits of a given positive integer

public class Program6 {
    static int sum(int num){
        if(num/10 == 0)
            return num;
        return sum(num/10)+(num%10);
    }
    public static void main(String[] args) {
        System.out.println(Program6.sum(12356));
    }
}
