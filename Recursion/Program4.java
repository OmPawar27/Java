// Q. WAP to print the length of digits in a number

public class Program4 {

    int count = 0;
    int lenOfNum(int num){
        if(num == 0)
            return 0;
        count++;
        num = num/10;
        lenOfNum(num);
        return count;
    }
    public static void main(String[] args) {
        
        Program4 obj = new Program4();
        int x = obj.lenOfNum(12345);

        System.out.println(x);
    }
}
