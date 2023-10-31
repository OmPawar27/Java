// Q. WAP to check whether a given number is a strong number or not

public class Program16 {

    int total = 0;
    int strongNum(int num, int temp){

        if(num == 0)
            return total;
        int sum = 1;
        temp = num % 10;
        for(int i = 1; i<=temp; i++){
            sum *= i;
        }
        total += sum;
        strongNum(num/10, temp);
        return total;
    }

    public static void main(String[] args) {

        Program16 obj = new Program16();
        int num = 145;
        int ans = obj.strongNum(num, 0);
        
        if(ans == num)
            System.out.println(ans + " is a strong number");
        else    
            System.out.println(ans + " is not a strong number");
    }
}
