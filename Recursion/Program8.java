// Q. WAP to count the occurence of a specific digit in a given number

public class Program8 {
    
    static int count = 0;
    static int occurenceOfDigit(int num, int key){
        if(num == 0)
            return 0;
        
        int temp = num % 10;
        if(temp == key)
            count++;
        num = num/10;
        occurenceOfDigit(num, key);
        return count;
    }
    public static void main(String[] args) {
        System.out.println(Program8.occurenceOfDigit(12333345, 3));
    }
}
