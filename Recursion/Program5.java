// Q. WAP to check weather the number is prime or not

public class Program5 {
    int i = 1;
    int count = 0;
    int prime(int num){
        if(i % num == 0)
            count++;
        if(i == num)
            return 0;
        ++i;
        prime(num);
        return count;
    }
    public static void main(String[] args) {
        Program5 obj = new Program5();
        
        int x = obj.prime(10);
        System.out.println(x);
    }
}
